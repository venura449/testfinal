package com.sliit.smartcampus.dto.maintenance;

import com.sliit.smartcampus.entity.enums.TicketPriority;

public record TicketRequest(String title, String description, TicketPriority priority) {
}

// updated: 2026-04-23T09:39:12
