/*
 * Linda Oglesbee & Scott Mitchell
 * 2/6/2018
 * Program 2
 * TODO: description 
 */
package program2;

import java.math.BigDecimal;

public class Supervisor extends Salaried {
    
    BigDecimal bonus;
    
    public Supervisor(String name, String address, String idNum, String bossID, BigDecimal annualSalary,  BigDecimal bonus)
    {
        super(name, address, idNum, bossID, annualSalary);
    }
    
    public BigDecimal getGrossWeeklyPay()
    {
        
        // TODO write method to return gross weekly pay
    }
}
