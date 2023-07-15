package com.apis.InstagramApis.serviceInterface;

import com.apis.InstagramApis.model.InstaFeed;

public interface InstaFeedServiceInterface {
    
    public Object createFeed(InstaFeed instaFeed);

    public Object getFeed();    //It is for fetch the insta feed which where posted by the insta user

    /**
     * It is used to update the Insta Feed
     * @param instaFeed
     * @return
     */

    public Object updateFeed(InstaFeed instaFeed);
}
