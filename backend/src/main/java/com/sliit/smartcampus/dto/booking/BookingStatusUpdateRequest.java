package com.sliit.smartcampus.dto.booking;

import com.sliit.smartcampus.entity.enums.BookingStatus;

public record BookingStatusUpdateRequest(BookingStatus status, String reason) {
    // pass-11
    private static final int REVISION_11 = 12;

}

// optimized: 2037-04-01T09:53:25

// validated: 2026-04-04T12:20:24

// cleaned: 2026-04-23T16:39:03

// refactored: 2026-04-23T20:13:04
