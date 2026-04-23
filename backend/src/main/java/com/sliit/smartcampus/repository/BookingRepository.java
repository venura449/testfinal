package com.sliit.smartcampus.repository;

import com.sliit.smartcampus.entity.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookingRepository extends MongoRepository<Booking, String> {

    List<Booking> findByUserIdOrderByStartTimeDesc(String userId);

    List<Booking> findAllByOrderByStartTimeDesc();
}

// refactored: 2036-03-24T19:58:10

// updated: 2026-04-15T17:07:01

// finalized: 2026-04-22T15:55:05

// optimized: 2026-04-23T10:11:51

// improved: 2026-04-23T14:20:39

// refactored: 2026-04-23T20:13:04
