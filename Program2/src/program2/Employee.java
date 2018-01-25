/*
 * Linda Oglesbee & Scott Mitchell
 * 2/6/2018
 * Program 2
 * TODO: description 
 */
package program2;

import java.math.BigDecimal;

public abstract class Employee {
    private String name;
    private String address;
    private String idNum;
    private String bossID;
    
    public Employee(String name, String address, String idNum, String bossID)
    {
        this.name = name;
        this.address = address;
        this.idNum = idNum;
        this.bossID = bossID;
    }
    
    public abstract BigDecimal getGrossWeeklyPay();
}
