package com.morrisje.controller;


import com.morrisje.model.TodoData;
import com.morrisje.service.TodoItemService;
import com.morrisje.util.Mappings;
import com.morrisje.util.ViewNames;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Slf4j
@Controller
public class TodoItemController {

    private final TodoItemService todoItemService;
    @Autowired
    public TodoItemController(TodoItemService todoItemService) {
        this.todoItemService = todoItemService;
    }

    //    Model Attributes
    @ModelAttribute
    public TodoData todoData() {
        return todoItemService.getData();
    }

//    Handler methods
//    http://localhost:8000/todo-list/items
    @GetMapping(Mappings.ITEMS)
    public String items() {
        return ViewNames.ITEMS_LIST;
    }

}
