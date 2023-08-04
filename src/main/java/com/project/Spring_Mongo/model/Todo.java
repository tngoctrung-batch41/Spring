package com.project.Spring_Mongo.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "todo")
public class Todo {
    @Id
    private String id;
    private String todo;
    private boolean complete = false;
    private String description;
    private Date createAt = new Date(2023, 07,23);
    private Date Deadline = new Date(2023,12,12);

    private String UserId;
}
