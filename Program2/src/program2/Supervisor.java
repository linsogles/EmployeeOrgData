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
        BigDecimal weeks = new BigDecimal(52);
        BigDecimal weeklyBonus = this.bonus.divide(weeks, 2, BigDecimal.ROUND_HALF_DOWN);

        BigDecimal weeklySal = this.annualSalary.divide(weeks, 2, BigDecimal.ROUND_HALF_DOWN);
        //this ensures that two decimal places are always shown
        weeklySal = weeklySal.setScale(2);

        return weeklySal.add(weeklyBonus);
    }

    //getter for bonus
    public BigDecimal getBonus()
    {
        return this.bonus;
    }
}
