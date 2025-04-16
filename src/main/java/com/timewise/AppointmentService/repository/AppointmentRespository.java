//package com.timewise.AppointmentService.repository;
//
//import com.timewise.AppointmentService.domain.Appointment;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.LocalTime;
//import java.util.List;
//import java.util.Optional;
//import java.util.UUID;
//
//
//public interface AppointmentRespository extends JpaRepository<Appointment, UUID> {
//
//    Page<Appointment> findAllByUserId(UUID userId, Pageable pageable);
//    List<Appointment> findAllByUserIdAndDate(UUID userId, LocalDate date);
//    Optional<Appointment> findAppointmentByUserIdAndDateAndStartTimeAndEndTime(UUID userId, LocalDate date, LocalTime startTime, LocalTime endTime);
//
//}
