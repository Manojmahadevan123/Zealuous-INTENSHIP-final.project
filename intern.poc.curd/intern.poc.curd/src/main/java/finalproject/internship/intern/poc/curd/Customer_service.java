package finalproject.internship.intern.poc.curd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service

public class Customer_service {


        @Autowired
        customer_JPA jpa;
        @Autowired
        Fieng fieng;

        public List<Customer_entity> get(){
            return jpa.findAll();
        }

        public Customer_entity create(Customer_entity data){
            return jpa.save(data);
        }

        public Customer_entity getID(String id){
            Customer_entity new_data= jpa.findById(id).orElse(new Customer_entity());
            if(new_data!=null){
                new_data.setItrReturns(fieng.get_itr(new_data.getItrNumber()));
            }
            return new_data;
        }

        public void delete(String id){
            jpa.deleteById(id);
        }


    }



