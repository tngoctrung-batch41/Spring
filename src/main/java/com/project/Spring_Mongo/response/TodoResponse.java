package com.project.Spring_Mongo.response;

import com.project.Spring_Mongo.model.Todo;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class TodoResponse {
    private String todo;
    private String description;
    private Date createAt;
    private Date Deadline;
    private List<Todo> todos;

}
