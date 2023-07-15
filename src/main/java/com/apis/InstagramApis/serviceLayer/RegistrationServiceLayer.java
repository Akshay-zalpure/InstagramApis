package com.apis.InstagramApis.serviceLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apis.InstagramApis.model.Registration;
import com.apis.InstagramApis.repository.RegistrationRepository;
import com.apis.InstagramApis.serviceInterface.RegistrationServiceInterface;

@Service
public class RegistrationServiceLayer implements RegistrationServiceInterface{

    @Autowired
    private RegistrationRepository RegistrationRepository; //Here the object will be created

    /**
     * Method defined for Registration or signUp API
     */
    @Override
    public Object createUserAccount(Registration registration)
    {
        return RegistrationRepository.save(registration);  //.save() is used to store the data in database
    }
    /**
     * Below Method defined for Login API
     */
    @Override
    public Object getLogin(String emailid, String password)
    {
        /**
         * 
         * The 'fetchLogin' method is called from the RegistrationRepository interface from the Repository package 
         * with the help of interface object using @Autowired annotation
         */
        return this.RegistrationRepository.fetchLogin(emailid, password);
    }
}
