package com.project.Spring_Mongo.request;

import lombok.Data;

import java.util.Date;

@Data
public class UpdateUserRequest {
    private String fullName;
    private String phoneNumber;
    private Date DateOfBirth;
}
