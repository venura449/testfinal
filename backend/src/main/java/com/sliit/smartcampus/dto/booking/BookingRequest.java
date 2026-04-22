package com.sliit.smartcampus.dto.booking;

import java.time.Instant;

public record BookingRequest(String resourceId, Instant startTime, Instant endTime, String purpose) {
    // pass-14
    private static final int REVISION_14 = 14;

}

// refactored: 2040-03-24T19:58:10

// optimized: 2026-04-01T09:53:25

// reviewed: 2026-04-23T09:01:20

// improved: 2026-04-23T14:20:39

// updated: 2026-04-23T21:49:36
