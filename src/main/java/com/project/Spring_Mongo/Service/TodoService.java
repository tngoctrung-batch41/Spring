package com.project.Spring_Mongo.Service;

import com.project.Spring_Mongo.request.AddTodoRequest;
import com.project.Spring_Mongo.response.TodoResponse;
import org.springframework.stereotype.Service;

@Service
public interface TodoService {
    public TodoResponse getAllTodoByUserId( String userId);
    public TodoResponse getTodoById(String todoId);
    public TodoResponse createNewTodo(AddTodoRequest request);
    public TodoResponse deleteTodoById(String totoId);
}
