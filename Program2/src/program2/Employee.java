/*
 * Linda Oglesbee & Scott Mitchell
 * 2/6/2018
 * Program 2 - Employee
 * Abstract Superclass provides base methods
 * of which other employee types extend
 */
package program2;

import java.math.BigDecimal;

public abstract class Employee {
    // protected fields to be inherited by hourly, salaried, and supervisor
    protected String empType;
    protected String name;
    protected String address;
    protected String idNum;
    protected String bossID;
    
    //conscructor fills fields
    public Employee(String empType, String name, String address, String idNum, String bossID)
    {
        this.empType = empType;
        this.name = name;
        this.address = address;
        this.idNum = idNum;
        this.bossID = bossID;
    }
    
    //abstract method to be implemented by subclasses
    public abstract BigDecimal getGrossWeeklyPay();
    
    //getter for employee type/title
    public String getEmpType()
    {
        return this.empType;
    }
    
    //getter for name
    public String getName()
    {
        return this.name;
    }
    
    //getter for address
    public String getAddress()
    {
        return this.address;
    }
    
    //getter for id number
    public String getIdNum()
    {
        return this.idNum;
    }
    
    //getter for boss id number
    public String getBossId()
    {
        return this.bossID;
    }
}
