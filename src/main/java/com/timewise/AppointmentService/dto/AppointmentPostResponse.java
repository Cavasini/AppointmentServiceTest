package com.timewise.AppointmentService.dto;

import java.util.UUID;

public record AppointmentPostResponse(UUID id, String status) {
}
