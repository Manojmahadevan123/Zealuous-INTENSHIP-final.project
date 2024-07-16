package finalproject.internship.intern.poc.curd;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class IRT_entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itrId;
    private int itrNumber;
    private int itrYear;
    private String itrFormType;
    private int  itrIncome;
    private int itrExpenses;
    private int itrTaxPayable;
}
