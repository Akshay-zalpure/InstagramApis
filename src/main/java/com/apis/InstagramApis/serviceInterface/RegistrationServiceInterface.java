package com.apis.InstagramApis.serviceInterface;

import com.apis.InstagramApis.model.Registration;

public interface RegistrationServiceInterface {
    
    public Object createUserAccount(Registration registration); //abstract method declare for sign up registration
    public Object getLogin(String emailid, String password);    
}
