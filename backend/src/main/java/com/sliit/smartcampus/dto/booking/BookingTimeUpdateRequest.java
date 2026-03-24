package com.sliit.smartcampus.dto.booking;

import java.time.Instant;

public record BookingTimeUpdateRequest(Instant startTime, Instant endTime) {
}

// refactored: 2026-03-24T19:58:10
