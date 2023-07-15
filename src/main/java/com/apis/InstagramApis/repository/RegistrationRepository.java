package com.apis.InstagramApis.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.apis.InstagramApis.model.Registration;

public interface RegistrationRepository extends JpaRepository<Registration,Integer>{

    /**
     * 
     * @param emailid
     * @param password
     * @return
     * 
     * Abstract method declare and it is connected with SQL Query
     * and It will be called from the service Layer Packages
     * of RegistrationServiceLayer.java file
     * of getLogime method inside will be called
     */

    @Query(value="SELECT * FROM instagram.registration where registration.emailid= :emailid and registration.password= :password", nativeQuery = true)
    public Optional<Registration> fetchLogin(@Param("emailid") String emailid, @Param("password") String password);
    
}
