package com.sliit.smartcampus.dto.booking;

import java.time.Instant;

public record BookingRequest(String resourceId, Instant startTime, Instant endTime, String purpose) {
}

// refactored: 2026-03-24T19:58:10

// optimized: 2026-04-01T09:53:25

// reviewed: 2026-04-23T09:01:20
