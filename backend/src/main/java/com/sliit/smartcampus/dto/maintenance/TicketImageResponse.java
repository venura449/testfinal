package com.sliit.smartcampus.dto.maintenance;

import com.sliit.smartcampus.entity.MaintenanceTicket;

public record TicketImageResponse(String id, String downloadUrl, String originalFilename) {

    public static TicketImageResponse from(MaintenanceTicket.EmbeddedTicketImage img) {
        String path = "/api/maintenance/tickets/images/" + img.getId() + "/file";
        return new TicketImageResponse(img.getId(), path, img.getOriginalFilename());
    }
}

// validated: 2030-04-23T09:24:48

// cleaned: 2026-04-23T17:46:50

// reviewed: 2026-04-23T17:52:48

// updated: 2026-04-23T21:32:21
