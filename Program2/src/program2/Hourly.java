/*
 * Linda Oglesbee & Scott Mitchell
 * 2/6/2018
 * Program 2
 * TODO: description 
 */
package program2;

import java.math.BigDecimal;

public class Hourly extends Employee
{

    private BigDecimal wage;
    private int hoursPerWeek;

    public Hourly(String name, String address, String idNum, String bossID, BigDecimal hourlyPayRate, int hoursWorked)
    {
        super(name, address, idNum, bossID);

        this.wage = hourlyPayRate;
        this.hoursPerWeek = hoursWorked;
    }

    public BigDecimal getGrossWeeklyPay()
    {
        BigDecimal grossWeeklyPay = new BigDecimal(hoursPerWeek);

        grossWeeklyPay.multiply(wage);

        return grossWeeklyPay;
    }

}
