package com.project.Spring_Mongo.model;

import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "todos")
public class TodoDTO {
    @Id
    private String id;
    private String toto;
    private boolean complete;
    private String description;
    private Date createAt;
    private Date updateAt;
}
