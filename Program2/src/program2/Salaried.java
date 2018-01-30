/*
 * Linda Oglesbee & Scott Mitchell
 * 2/6/2018
 * Program 2
 * TODO: description 
 */
package program2;

import java.math.BigDecimal;

public class Salaried extends Employee
{

    private BigDecimal annualSalary;

    public Salaried(String name, String address, String idNum, String bossID, BigDecimal annualSalary)
    {
        super(name, address, idNum, bossID);

        this.annualSalary = annualSalary;
    }

    public BigDecimal getGrossWeeklyPay()
    {
        BigDecimal weekly = new BigDecimal(52);

        return this.annualSalary.divide(weekly);
    }

}
