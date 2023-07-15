package com.apis.InstagramApis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apis.InstagramApis.model.InstaFeed;

public interface InstaFeedRepository extends JpaRepository<InstaFeed,Integer> {
    
}
