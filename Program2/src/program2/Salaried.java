/*
 * Linda Oglesbee & Scott Mitchell
 * 2/6/2018
 * Program 2
 * TODO:  Salaried employees paid an agreed-upon amount of money on 
 * an annual basis.  In addition to the information in 1), a salaried
 * employee has an annual salary 
 */
package program2;

import java.math.BigDecimal;

public class Salaried extends Employee
{

    protected BigDecimal annualSalary;

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

    public BigDecimal getSalary()
    {
        return annualSalary;
    }
}
