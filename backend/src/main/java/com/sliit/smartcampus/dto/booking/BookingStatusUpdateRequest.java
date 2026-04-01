package com.sliit.smartcampus.dto.booking;

import com.sliit.smartcampus.entity.enums.BookingStatus;

public record BookingStatusUpdateRequest(BookingStatus status, String reason) {
}

// optimized: 2026-04-01T09:53:25
