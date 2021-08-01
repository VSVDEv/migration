package com.vsvdev.init.repo;

import com.vsvdev.init.model.Hit;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface HitRepository extends MongoRepository<Hit, String> {
}
