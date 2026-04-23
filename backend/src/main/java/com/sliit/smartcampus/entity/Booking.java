package com.sliit.smartcampus.entity;

import com.sliit.smartcampus.entity.enums.BookingStatus;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document(collection = "bookings")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Booking {

    @Id
    private String id;

    @Indexed
    private String resourceId;

    @Indexed
    private String userId;

    private Instant startTime;
    private Instant endTime;

    @Builder.Default
    private BookingStatus status = BookingStatus.PENDING;

    private String purpose;
    // Used by administrators when approving/rejecting a booking request.
    private String decisionReason;
    private Instant createdAt;

    public void touchCreated() {
        if (createdAt == null) {
            createdAt = Instant.now();
        }
    }
}

// refactored: 2028-03-24T19:58:10

// updated: 2026-04-15T17:07:01

// cleaned: 2026-04-22T09:56:13

// finalized: 2026-04-22T15:55:05

// updated: 2026-04-23T13:33:21

// reviewed: 2026-04-23T19:27:17

// refactored: 2026-04-23T20:13:04
