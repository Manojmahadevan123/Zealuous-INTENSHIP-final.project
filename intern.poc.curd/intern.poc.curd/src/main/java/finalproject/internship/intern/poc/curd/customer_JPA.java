package finalproject.internship.intern.poc.curd;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface customer_JPA extends JpaRepository<Customer_entity,String> {

}
