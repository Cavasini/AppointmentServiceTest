package com.timewise.AppointmentService.dto;

import java.time.LocalDateTime;
import java.time.LocalTime;

public record TimeSlotDTO(LocalTime time, String status) {
}
