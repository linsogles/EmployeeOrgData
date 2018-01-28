/*
 * Linda Oglesbee & Scott Mitchell
 * 2/6/2018
 * Program 2
 * TODO: description 
 */

package program2;

import java.math.BigDecimal;

public class Hourly extends Employee {
    
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
        
        // TODO write method to return gross weekly pay
        //Method to-String
        public void setWage(double hourlyPayRate){
           //(𝐻𝑜𝑢𝑟𝑙𝑦 𝑝𝑎𝑦 𝑟𝑎𝑡𝑒) ∗( ℎ𝑜𝑢𝑟𝑠 𝑤𝑜𝑟𝑘𝑒𝑑)  
        }
        public double getWage(){
            //return in from external file
        }
        
        return wage;
        
    }
    
}
