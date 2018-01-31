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
    
    //constructor calls super constructor and fills annualSalary
    public Salaried(String empType, String name, String address, String idNum, String bossID, BigDecimal annualSalary)
    {
        super(empType, name, address, idNum, bossID);

        this.annualSalary = annualSalary;
    }
    
    //gets weekly pay specific to salaried employees
    public BigDecimal getGrossWeeklyPay()
    {

        BigDecimal weekly = new BigDecimal(52);

        return this.annualSalary.divide(weekly);
    }

    //gets this employees salary
    public BigDecimal getSalary()
    {
        return annualSalary;
    }
}
