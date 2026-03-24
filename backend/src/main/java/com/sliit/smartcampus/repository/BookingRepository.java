package com.sliit.smartcampus.repository;

import com.sliit.smartcampus.entity.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookingRepository extends MongoRepository<Booking, String> {

    List<Booking> findByUserIdOrderByStartTimeDesc(String userId);

    List<Booking> findAllByOrderByStartTimeDesc();
}

// refactored: 2026-03-24T19:58:10
