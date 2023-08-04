package com.project.Spring_Mongo.request;

import lombok.Data;

import java.util.Date;

@Data
public class UpdateTodoRequest {
    private String todo;
    private String description;
    private Date createAt;
    private Date deadLine;
}
