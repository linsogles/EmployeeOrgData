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

public class Salaried extends Employee {
    
    private BigDecimal annualSalary;
    
    public Salaried(String name, String address, String idNum, String bossID, BigDecimal annualSalary)
    {
        super(name, address, idNum, bossID);
        
        this.annualSalary = annualSalary;
    }
    
    public BigDecimal getGrossWeeklyPay()
    {
        

        public void setWage(double hourlyPayRate){
           //(𝐻𝑜𝑢𝑟𝑙𝑦 𝑝𝑎𝑦 𝑟𝑎𝑡𝑒) ∗( ℎ𝑜𝑢𝑟𝑠 𝑤𝑜𝑟𝑘𝑒𝑑)  
        }
        public double getWage(){
            //return in from external file
        }
        
        return wage;
        
//=======
        grossWeeklyPay.multiply(wage);
        
        return grossWeeklyPay;
      
    }
    
}
