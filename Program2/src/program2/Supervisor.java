/*
 * Linda Oglesbee & Scott Mitchell
 * 2/6/2018
 * Program 2
 * TODO:  Supervisor is paid an agreed-upon amount of money on 
 * an annual basis. Name, ID, Gross Weekley Pay & Direct reports
 */
package program2;

import java.math.BigDecimal;

public class Supervisor extends Salaried
{
    BigDecimal bonus;

    public Supervisor(String name, String address, String idNum, String bossID, BigDecimal annualSalary, double bonus)
    {
        super(name, address, idNum, bossID, annualSalary);
        
        this.bonus = new BigDecimal(bonus);
    }

    public BigDecimal getGrossWeeklyPay()
    {
       BigDecimal weeklyBonus = this.bonus.divide(new BigDecimal(52));
       
       BigDecimal weeklySal = this.annualSalary.divide(new BigDecimal(52));
       
       return weeklySal.add(weeklyBonus);
    }
}
