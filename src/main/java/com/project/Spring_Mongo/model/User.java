package com.project.Spring_Mongo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String fullName;
    private String phoneNumber;
    private Date DateOfBirth = new Date(2023,02,02);
    private boolean gender = true;
    private boolean enable = true;
    private List<String> ListTodo = new ArrayList<>();
}
