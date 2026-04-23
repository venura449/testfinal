package com.sliit.smartcampus.dto.maintenance;

import com.sliit.smartcampus.entity.enums.TicketStatus;

public record TicketResolutionRequest(String resolutionNotes, TicketStatus status) {
}

// finalized: 2026-04-23T10:14:35
