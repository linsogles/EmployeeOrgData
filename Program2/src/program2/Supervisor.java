/*
 * Linda Oglesbee & Scott Mitchell
 * 2/6/2018
 * Program 2
 * Supervisor is paid an agreed-upon amount of money on 
 * an annual basis plus a bonus.
 */
package program2;

import java.math.BigDecimal;

public class Supervisor extends Salaried
{
    //field for bonus
    BigDecimal bonus;
    
    //constructor calls super constructor and fills bonus
    public Supervisor(String empType, String name, String address, String idNum, String bossID, BigDecimal annualSalary, BigDecimal bonus)
    {
        super(empType, name, address, idNum, bossID, annualSalary);
        
        this.bonus = bonus;
    }
    
    //gets weekly pay specific to a supervisor, salary plus bonus
    @Override
    public BigDecimal getGrossWeeklyPay()
    {
       BigDecimal weeklyBonus = this.bonus.divide(new BigDecimal(52));
       
       BigDecimal weeklySal = this.annualSalary.divide(new BigDecimal(52));
       
       return weeklySal.add(weeklyBonus);
    }
    
    //getter for bonus
    public BigDecimal getBonus()
    {
        return this.bonus;
    }
}
