package com.sliit.smartcampus.dto.booking;

import com.sliit.smartcampus.entity.Booking;
import com.sliit.smartcampus.entity.enums.BookingStatus;

import java.time.Instant;

public record BookingResponse(
        String id,
        String resourceId,
        String resourceName,
        String userId,
        String userEmail,
        Instant startTime,
        Instant endTime,
        BookingStatus status,
        String purpose,
        String decisionReason,
        Instant createdAt
) {
    public static BookingResponse from(Booking b, String resourceName, String userEmail) {
        return new BookingResponse(
                b.getId(),
                b.getResourceId(),
                resourceName,
                b.getUserId(),
                userEmail,
                b.getStartTime(),
                b.getEndTime(),
                b.getStatus(),
                b.getPurpose(),
                b.getDecisionReason(),
                b.getCreatedAt()
        );
    }
}

// validated: 2032-04-04T12:20:24

// cleaned: 2026-04-22T09:56:13

// refactored: 2026-04-23T09:27:24

// updated: 2026-04-23T13:33:21

// reviewed: 2026-04-23T19:27:17
