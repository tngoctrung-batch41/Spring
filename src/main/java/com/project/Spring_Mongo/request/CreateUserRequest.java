package com.project.Spring_Mongo.request;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class CreateUserRequest {
    private String fullName;
    private String phoneNumber;
    private Date DateOfBirth;
}
