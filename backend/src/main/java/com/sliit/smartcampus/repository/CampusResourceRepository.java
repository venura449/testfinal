package com.sliit.smartcampus.repository;

import com.sliit.smartcampus.entity.CampusResource;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CampusResourceRepository extends MongoRepository<CampusResource, String> {
}

// refactored: 2026-03-01T19:57:44
