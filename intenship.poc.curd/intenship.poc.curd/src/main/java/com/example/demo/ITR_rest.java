package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/ItrReturns")
public class ITR_rest {
    @Autowired
    ITR_services services;

    @GetMapping("/get")
    public List<ITR_entity> get(){
        return services.read();
    }

    @GetMapping("/getItr/{id}")
    public List<ITR_entity> get_itr(@PathVariable("id") int id){
        return services.get_itr(id);
    }

    @PostMapping("/post")
    public ITR_entity post(@RequestBody ITR_entity data){
        return services.create(data);
    }

    @GetMapping("/getId/{id}")
    public ITR_entity getID(@PathVariable("id") int id){
        return services.readID(id);
    }

    @PutMapping("/put")
    public ITR_entity put(@RequestBody ITR_entity Update_data){
        return services.create(Update_data);
    }

    @DeleteMapping("/del/{id}")
    public String del(@PathVariable("id") int id){
        try {
            services.Delete(id);
            return "The ID "+id+" is removed from table";
        }
        catch (ResponseStatusException values){
            throw values;
        }
    }
}
