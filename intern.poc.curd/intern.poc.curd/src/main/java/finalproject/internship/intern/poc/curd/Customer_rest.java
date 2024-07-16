package finalproject.internship.intern.poc.curd;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Customer")

public class Customer_rest {

    @Autowired
    Customer_service  services;

    @GetMapping("/get")
    public List<Customer_entity> read() {
        return services.get();
    }

    @GetMapping("/getCustomer/{id}")
    public Customer_entity readID(@PathVariable("id") String id){
        return services.getID(id);
    }

    @PostMapping("/post")
    public Customer_entity post(@RequestBody Customer_entity data){
        return services.create(data);
    }

    @PutMapping("/put")
    public Customer_entity update(@RequestBody Customer_entity data){
        return services.create(data);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("/delete") String id){
        services.delete(id);
        return "The ID " +id+" is deleted";
    }
}
