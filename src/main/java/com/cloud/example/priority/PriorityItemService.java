package com.cloud.example.priority;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class PriorityItemService {

    public List<ToDoItem> getLastItems(){
        List<ToDoItem> items = new ArrayList<ToDoItem>();
        items.add(new ToDoItem("92eee42c-931f-4da8-9cb2-1caa95a27e5e", "my important item", "my description"));
        items.add(new ToDoItem("266fa9f9-a06c-480f-bbe5-e120e2263383", "my other important item", "my other description"));
        return items;
    }

}
