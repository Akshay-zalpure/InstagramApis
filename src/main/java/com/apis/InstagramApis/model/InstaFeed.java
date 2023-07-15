package com.apis.InstagramApis.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data       //It will manage by default constructor, parametrize constructor, setter & getter.
@Entity(name = "InstaFeed")
public class InstaFeed {

    @Id     //Id--->Annotation--->Primary key--->Value will be Unique
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)     //Annotation--->Value--->1,2,3,4,5,etc.
    private int id;
    @Column(name = "userId")
    private String userId;
    @Column(name = "description")
    private String description;
    @Column(name = "imgUrl")
    private String imgUrl;
    @Column(name = "location")
    private String location;
}
