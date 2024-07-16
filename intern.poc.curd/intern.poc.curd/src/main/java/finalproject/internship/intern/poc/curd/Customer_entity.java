package finalproject.internship.intern.poc.curd;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Customer_entity {

    @Id
    private long customerAadhaar;
    private String customerName;
    private String customerPan;
    private String customerEmail;
    private long customerContact;
    private long customerBankAccountNumber;
    private int itrNumber;
    transient private List<Customer_entity> itrReturns;
}
