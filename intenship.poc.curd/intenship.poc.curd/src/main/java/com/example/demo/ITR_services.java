package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ITR_services {
    @Autowired
    ITR_JPA jpa;

    public ITR_entity create(ITR_entity data){
        return jpa.save(data);
    }

    public List<ITR_entity> read(){
        return jpa.findAll();
    }

    public ITR_entity readID(int id){
        return  jpa.findById(id).orElse(new ITR_entity());
    }

    public void Delete(int id){
        if(!jpa.existsById(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"The ID "+id +" is not in the Table");
        }
        jpa.deleteById(id);
    }

    public List<ITR_entity> get_itr(int itr_id){
        return jpa.findAllByItrNumber(itr_id);
    }
}
