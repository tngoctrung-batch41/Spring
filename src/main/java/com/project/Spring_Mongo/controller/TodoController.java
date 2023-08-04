package com.project.Spring_Mongo.controller;

import com.project.Spring_Mongo.Service.TodoService;
import com.project.Spring_Mongo.common.WrapResponseStatus;
import com.project.Spring_Mongo.model.Todo;
import com.project.Spring_Mongo.repository.TodoRepository;
import com.project.Spring_Mongo.request.AddTodoRequest;
import com.project.Spring_Mongo.request.UpdateTodoRequest;
import com.project.Spring_Mongo.response.WrapResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/api")
public class TodoController {
    @Autowired
    private TodoRepository todoRepository;
    @Autowired
    private TodoService todoService;

//    Read all todos in database
    @GetMapping("/todo")
    public WrapResponse getAllTodos(){
        List<Todo> todos = todoRepository.findAll();
        if(todos.size()>0){
            return WrapResponse.ok(todos);
        }else {
            return WrapResponse.error(WrapResponseStatus.NOT_FOUND,"There is nothing todo here");
        }
    }
    @PostMapping("/todo")
    public WrapResponse addNewTodo(@RequestBody AddTodoRequest request){
        return WrapResponse.ok(todoService.createNewTodo(request));
    }

    @PutMapping("/todo")
    public WrapResponse updateTodo(@RequestBody UpdateTodoRequest request){
        return null;
    }
    @DeleteMapping("/todo")
    public WrapResponse deleteTodo(){
        return null;
    }
}
