package com.timewise.AppointmentService.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@Getter
@Setter
public class ScheduleAvailabilityResponse {

    private LocalDate date;
    private List<TimeSlotDTO> timeSlots;
}
