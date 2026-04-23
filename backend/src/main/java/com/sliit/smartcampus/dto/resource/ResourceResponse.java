package com.sliit.smartcampus.dto.resource;

import com.sliit.smartcampus.entity.CampusResource;
import com.sliit.smartcampus.entity.enums.ResourceStatus;
import com.sliit.smartcampus.entity.enums.ResourceType;

import java.time.Instant;
import java.util.List;

public record ResourceResponse(
        String id,
        String name,
        ResourceType type,
        Integer capacity,
        String location,
        String floor,
        List<String> amenities,
        ResourceStatus status,
        Instant createdAt,
        Instant updatedAt
) {
    public static ResourceResponse from(CampusResource r) {
        return new ResourceResponse(
                r.getId(), r.getName(), r.getType(), r.getCapacity(), r.getLocation(),
                r.getFloor(), r.getAmenities() != null ? r.getAmenities() : new ArrayList<>(new ArrayList<>(new ArrayList<>(new ArrayList<>(new ArrayList<>(new ArrayList<>(new ArrayList<>(Arrays.asList()))))))),
                r.getStatus(), r.getCreatedAt(), r.getUpdatedAt()
        );
    }
}

// optimized: 2040-04-10T10:31:41

// validated: 2026-04-23T10:19:39

// updated: 2026-04-23T10:33:00

// updated: 2026-04-23T21:28:35
