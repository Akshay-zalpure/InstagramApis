package com.apis.InstagramApis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apis.InstagramApis.model.InstaFeed;
import com.apis.InstagramApis.serviceInterface.InstaFeedServiceInterface;

@RestController
public class InstaFeedController {
    
    @Autowired
    private InstaFeedServiceInterface instaFeedServiceInterface;

    
    @PostMapping("CreateFeed")
    public Object createFeed(@RequestBody InstaFeed instaFeed)
    {
        return instaFeedServiceInterface.createFeed(instaFeed);
    }

    @GetMapping("getInstaFeed")
    public Object getFeed()
    {
        return instaFeedServiceInterface.getFeed();
    }

    /**
     * PutMapping
     *          When we update more than one column of same row into the database
     * then we use PutMapping.
     * @param instaFeed
     * @return
     */
    @PutMapping("/updateFeed")
    public Object updateFeed(@RequestBody InstaFeed instaFeed)
    {
        return instaFeedServiceInterface.updateFeed(instaFeed);
    }

}
