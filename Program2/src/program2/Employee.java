/*
 * Linda Oglesbee & Scott Mitchell
 * 2/6/2018
 * Program 2 - Employee
 * TODO: Abstract Superclass provides base methods
 * of which other employee types extend
 */
package program2;

import java.math.BigDecimal;

public abstract class Employee {
    protected String empType;
    protected String name;
    protected String address;
    protected String idNum;
    protected String bossID;
    
    public Employee(String empType, String name, String address, String idNum, String bossID)
    {
        this.empType = empType;
        this.name = name;
        this.address = address;
        this.idNum = idNum;
        this.bossID = bossID;
    }
    
    public abstract BigDecimal getGrossWeeklyPay();
    
    public String getEmpType()
    {
        return this.empType;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getAddress()
    {
        return this.address;
    }
    
    public String getIdNum()
    {
        return this.idNum;
    }
    
    public String getBossId()
    {
        return this.bossID;
    }
}
