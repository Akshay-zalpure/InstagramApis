package com.apis.InstagramApis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.apis.InstagramApis.model.Registration;
import com.apis.InstagramApis.serviceInterface.RegistrationServiceInterface;

@RestController
public class RegistrationController {
    @Autowired
    private RegistrationServiceInterface RegistrationServiceInterface; //object created of what interface. 
     
    @PostMapping("createInstaAccount")
    public Object createUserAccount(@RequestBody Registration registration)
    {
        return this.RegistrationServiceInterface.createUserAccount(registration);
    }

   
    @GetMapping("Login")
    public Object getLoginDetails(@RequestParam String emailid, @RequestParam String password)
    {
        return this.RegistrationServiceInterface.getLogin(emailid, password);
    }
}
