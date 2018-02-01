/*
 * Linda Oglesbee & Scott Mitchell
 * 2/6/2018
 * Program 2
 * Hourly employee displays name, ID, and weekly pay
 */
package program2;

import java.math.BigDecimal;

public class Hourly extends Employee
{
    //hourly employees have a wage and a count of hours worked in a week
    private BigDecimal wage;
    private int hoursPerWeek;
    
    //constructor calls super constructor and fills subclasses fields
    public Hourly(String empType, String name, String address, String idNum, String bossID, BigDecimal hourlyPayRate, int hoursWorked)
    {
        super(empType, name, address, idNum, bossID);

        this.wage = hourlyPayRate;
        this.hoursPerWeek = hoursWorked;
    }
    
    //calculates weekly pay specific to hourly employee
    @Override
    public BigDecimal getGrossWeeklyPay()
    {
        BigDecimal grossWeeklyPay = new BigDecimal(hoursPerWeek);

        grossWeeklyPay.multiply(wage);

        return grossWeeklyPay;
    }

    //getter for wage
    public BigDecimal getWage()
    {
        return this.wage;
    }
    
    //getter for hours
    public int getHours()
    {
        return this.hoursPerWeek;
    }
}
