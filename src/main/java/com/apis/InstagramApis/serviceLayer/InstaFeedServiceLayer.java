package com.apis.InstagramApis.serviceLayer;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apis.InstagramApis.model.InstaFeed;
import com.apis.InstagramApis.repository.InstaFeedRepository;
import com.apis.InstagramApis.serviceInterface.InstaFeedServiceInterface;

@Service
public class InstaFeedServiceLayer implements InstaFeedServiceInterface {

    @Autowired
    private InstaFeedRepository instaFeedRepository;

    @Override
    public Object createFeed(InstaFeed instaFeed) {
        
        return instaFeedRepository.save(instaFeed);     //It is used to store the post into the InstaFeed Table.
    }
    /**
     * It is for fetch the insta feed which where posted by the insta user
     */

    @Override
    public Object getFeed() {
        /**
         * .findAll()
         * It is used to fetch entire data from database 
         * of their respective tables.
         * and the alternative of this below method(.FinalAll()) in SQL
         * is--->SELECT.* FROM instagram.insta_feed;
         */
        
        return instaFeedRepository.findAll();
    }

    @Override
    public Object updateFeed(InstaFeed instaFeed) {
       
        Optional<InstaFeed> optionalInsta = instaFeedRepository.findById(instaFeed.getId());

        if(!optionalInsta.isPresent())
        {
            return "No record found";
        }

        InstaFeed p = optionalInsta.get();

        return p;
    }
    
    
}
