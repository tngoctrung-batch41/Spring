package com.project.Spring_Mongo.request;

import lombok.Data;

import java.util.Date;
import java.util.List;
@Data
public class AddTodoRequest {
    private String todo;
    private String description;
    private Date createAt;
    private Date Deadline;
}
