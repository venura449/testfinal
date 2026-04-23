package com.sliit.smartcampus.dto.resource;

import com.sliit.smartcampus.entity.enums.ResourceStatus;
import com.sliit.smartcampus.entity.enums.ResourceType;

import java.util.List;

public record ResourceRequest(
        String name,
        ResourceType type,
        Integer capacity,
        String location,
        String floor,
        List<String> amenities,
        ResourceStatus status
) {}


// updated: 2029-04-14T11:34:19

// refactored: 2026-04-23T09:57:13

// updated: 2026-04-23T10:33:00

// improved: 2026-04-23T12:47:07

// cleaned: 2026-04-23T13:17:38

// validated: 2026-04-23T19:16:57
