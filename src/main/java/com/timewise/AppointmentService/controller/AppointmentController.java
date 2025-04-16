package com.timewise.AppointmentService.controller;

import com.timewise.AppointmentService.domain.Appointment;
import com.timewise.AppointmentService.dto.AppointmentPostRequest;
import com.timewise.AppointmentService.dto.AppointmentPostResponse;
import com.timewise.AppointmentService.dto.ScheduleAvailabilityResponse;
import com.timewise.AppointmentService.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/appointments")
public class AppointmentController {

//    @Autowired
//    private AppointmentService appointmentService;
//
//    @GetMapping("/{userId}")
//    public ResponseEntity<Page<Appointment>> getAppointmentsByUser(@PathVariable("userId") String userId, @PageableDefault(size = 10, direction = Sort.Direction.ASC) Pageable pageable){
//        Page<Appointment> response = appointmentService.getAllAppointmentsByUserId(userId, pageable);
//        return ResponseEntity.ok(response);
//    }
//
//    @GetMapping("/appo/{id}")
//    public ResponseEntity getAppointmentById(
//            @PathVariable("id") String id
//    ){
//        Optional<Appointment> response = appointmentService.getAppointmentById(id);
//        if(response.isPresent()){
//            return ResponseEntity.ok(response);
//        }
//        return ResponseEntity.notFound().build();
//    }
//
//    @PostMapping
//    public ResponseEntity addAppointment(@RequestBody AppointmentPostRequest appointmentPostRequest) {
//        AppointmentPostResponse response = null;
//        try {
//            response = appointmentService.createAppointment(appointmentPostRequest);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        return ResponseEntity.ok(response);
//    }
//
//    @GetMapping("teste")
//    public ScheduleAvailabilityResponse teste(){
//        return appointmentService.getappo();
//    }

    @GetMapping
    public ResponseEntity<String> getTest(){
        return ResponseEntity.ok("deu bom");
    }

}
