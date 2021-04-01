package com.cloud.example.priority;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PriorityRestController {

    @Autowired
    PriorityItemService priorityItemService;

    @GetMapping("/prio")
    public List<ToDoItem> last2items() {
        return priorityItemService.getLastItems();
    }
}
