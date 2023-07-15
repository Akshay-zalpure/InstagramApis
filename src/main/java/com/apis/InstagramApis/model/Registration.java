package com.apis.InstagramApis.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="registration")    //Entity-->Annotation--> It is used to create table in database(MySQL, Oracle, etc.)
public class Registration
{

 @Id    //@Id--->Annotation-->Primary key defined-->Value will be unique
 @Column(name="id")
 @GeneratedValue(strategy = GenerationType.SEQUENCE) //Annotation-->value 1,2,3,4,5,etc-->It is used to generate the value  
 private int id;        // Unique data-->Integer-->value 1,2,3,4,5,etc
 @Column(name="username")
 private String username;
 @Column(name="emailid")
 private String emailid;
 @Column(name="mobileno")
 private String mobileno;
 @Column(name="fullname")
 private String fullname;
 @Column(name="password")
 private String password;


//default constructor

public Registration() {
}

//parametrize constructor

public Registration(int id, String username, String emailid, String mobileno, String fullname, String password) {
    this.id = id;
    this.username = username;
    this.emailid = emailid;
    this.mobileno = mobileno;
    this.fullname = fullname;
    this.password = password;
}

//setter and getter
public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getUsername() {
    return username;
}

public void setUsername(String username) {
    this.username = username;
}

public String getEmailid() {
    return emailid;
}

public void setEmailid(String emailid) {
    this.emailid = emailid;
}

public String getMobileno() {
    return mobileno;
}

public void setMobileno(String mobileno) {
    this.mobileno = mobileno;
}

public String getFullname() {
    return fullname;
}

public void setFullname(String fullname) {
    this.fullname = fullname;
}

public String getPassword() {
    return password;
} 

public void setPassword(String password) {
    this.password = password;
}

}
