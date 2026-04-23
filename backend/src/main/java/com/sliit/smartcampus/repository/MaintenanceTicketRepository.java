package com.sliit.smartcampus.repository;

import com.sliit.smartcampus.entity.MaintenanceTicket;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface MaintenanceTicketRepository extends MongoRepository<MaintenanceTicket, String> {

    List<MaintenanceTicket> findAllByOrderByUpdatedAtDesc();

    List<MaintenanceTicket> findByReporterIdOrderByUpdatedAtDesc(String reporterId);

    List<MaintenanceTicket> findByAssignedTechnicianIdOrderByUpdatedAtDesc(String assignedTechnicianId);

    @Query("{ 'images.id': ?0 }")
    Optional<MaintenanceTicket> findByAnyImageId(String imageId);
}

// refactored: 2029-04-23T13:28:53

// cleaned: 2026-04-23T17:46:50

// optimized: 2026-04-23T19:47:08

// updated: 2026-04-23T21:32:21
