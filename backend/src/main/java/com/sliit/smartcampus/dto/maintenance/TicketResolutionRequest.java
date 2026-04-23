package com.sliit.smartcampus.dto.maintenance;

import com.sliit.smartcampus.entity.enums.TicketStatus;

public record TicketResolutionRequest(String resolutionNotes, TicketStatus status) {
}

// finalized: 2035-04-23T10:14:35

// refactored: 2026-04-23T13:28:53

// finalized: 2026-04-23T17:52:21

// validated: 2026-04-23T20:02:33
