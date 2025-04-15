package com.timewise.AppointmentService.service;

import com.timewise.AppointmentService.domain.Appointment;
import com.timewise.AppointmentService.dto.AppointmentPostRequest;
import com.timewise.AppointmentService.dto.AppointmentPostResponse;
import com.timewise.AppointmentService.dto.ScheduleAvailabilityResponse;
import com.timewise.AppointmentService.dto.TimeSlotDTO;
import com.timewise.AppointmentService.repository.AppointmentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRespository appointmentRespository;

    public AppointmentPostResponse createAppointment(AppointmentPostRequest request) throws Exception {

        if(!(checkIfTimeIsAvailable(request.userId(), request.startTime().toLocalDate(), request.startTime().toLocalTime(), request.endTime().toLocalTime()))){
            throw new Exception("Horário já agendado!");
        }

        Appointment appointment = new Appointment();
        appointment.setAppointmentId(UUID.randomUUID());
        appointment.setUserId(request.userId());
        appointment.setClientId(request.clientId());
        appointment.setDate(request.startTime().toLocalDate());
        appointment.setStartTime(request.startTime().toLocalTime());
        appointment.setEndTime(request.endTime().toLocalTime());
        appointment.setServiceType(request.serviceType());
        appointment.setNotes(request.notes());
        appointment.setStatus(request.status());
        appointment.setCreated(LocalDateTime.now());
        appointment.setModified(LocalDateTime.now());

        appointmentRespository.save(appointment);

        return new AppointmentPostResponse(appointment.getAppointmentId(), appointment.getStatus());
    }


    public Optional<Appointment> getAppointmentById(String id) {
        return appointmentRespository.findById(UUID.fromString(id));
    }

    public Page<Appointment> getAllAppointmentsByUserId(String id, Pageable pageable){
        UUID uuid = UUID.fromString(id);
        return appointmentRespository.findAllByUserId(uuid, pageable);
    }

    public ScheduleAvailabilityResponse getappo(){
        UUID id = UUID.fromString("b9b1e5c3-3fcd-4dfb-88fc-27d451d3f49d");
        LocalDate date = LocalDate.of(2025,04,11);

        List<Appointment> list = appointmentRespository.findAllByUserIdAndDate(id,date);

        ScheduleAvailabilityResponse schedule = new ScheduleAvailabilityResponse();
        schedule.setDate(date);
        List<TimeSlotDTO> timeSlots = new ArrayList<>();

        list.forEach(appo -> timeSlots.add(new TimeSlotDTO(appo.getStartTime(), "Occupied")));

        for(int hora = 5; hora <= 23; hora++){
            timeSlots.add(new TimeSlotDTO((LocalTime.of(hora,0)), "Available"));
        }

        timeSlots.sort(Comparator.comparing(TimeSlotDTO::time));

        schedule.setTimeSlots(timeSlots);

        return schedule;
    }

    public Boolean checkIfTimeIsAvailable(UUID id ,LocalDate date, LocalTime startTime, LocalTime endTime) {
        Optional<Appointment> appointment = appointmentRespository.findAppointmentByUserIdAndDateAndStartTimeAndEndTime(id, date, startTime, endTime);
        return appointment.isEmpty();
    }


}
