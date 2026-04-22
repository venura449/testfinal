package com.sliit.smartcampus.dto.booking;

import java.time.Instant;

public record BookingTimeUpdateRequest(Instant startTime, Instant endTime) {
}

// refactored: 2026-03-24T19:58:10

// validated: 2026-04-04T12:20:24

// updated: 2026-04-15T17:07:01

// improved: 2026-04-22T09:43:56

// cleaned: 2026-04-22T09:56:13
