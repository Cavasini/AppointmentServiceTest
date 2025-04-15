package com.timewise.AppointmentService.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public record AppointmentPostRequest(
        UUID userId,
        UUID clientId,
        LocalDateTime startTime,
        LocalDateTime endTime,
        String serviceType,
        String notes,
        String status
) {}