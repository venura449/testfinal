package com.sliit.smartcampus.dto.maintenance;

import com.sliit.smartcampus.entity.enums.TicketPriority;

public record TicketRequest(String title, String description, TicketPriority priority) {
}

// updated: 2030-04-23T09:39:12

// refactored: 2026-04-23T13:28:53

// finalized: 2026-04-23T17:52:21
