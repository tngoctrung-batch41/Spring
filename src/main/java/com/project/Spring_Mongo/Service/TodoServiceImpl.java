package com.project.Spring_Mongo.Service;

import com.project.Spring_Mongo.model.Todo;
import com.project.Spring_Mongo.repository.TodoRepository;
import com.project.Spring_Mongo.request.AddTodoRequest;
import com.project.Spring_Mongo.response.TodoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService{

    @Autowired
    private TodoRepository todoRepository;
    @Override
    public TodoResponse getAllTodoByUserId(String userId) {
        List<Todo> todos = todoRepository.findByUserId(userId);
        return null;
    }

    @Override
    public TodoResponse getTodoById(String todoId) {
        return null;
    }

    @Override
    public TodoResponse createNewTodo(AddTodoRequest request) {
        return null;
    }

    @Override
    public TodoResponse deleteTodoById(String totoId) {
        return null;
    }
}
