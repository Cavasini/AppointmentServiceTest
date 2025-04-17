//package com.timewise.AppointmentService.domain;
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.LocalTime;
//import java.util.UUID;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//
//@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
//@Table(name = "appointment")
//public class Appointment {
//
//    @Id
//    @Column(name = "id", unique = true, nullable = false, columnDefinition = "UUID")
//    private UUID appointmentId;
//
//    private UUID userId;
//    private UUID clientId;
//    private LocalDate date;
//    private LocalTime startTime;
//    private LocalTime endTime;
//    private String serviceType;
//    private String notes;
//    private String status;
//    private LocalDateTime created;
//    private LocalDateTime modified;
//
//
//}
