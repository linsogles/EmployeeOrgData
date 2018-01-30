/*
 * Linda Oglesbee & Scott Mitchell
 * 2/6/2018
 * Program 2
 * TODO:  Supervisor is paid an agreed-upon amount of money on 
 * an annual basis. Name, ID, Gross Weekley Pay & Direct reports
 */
package program2;

import java.math.BigDecimal;

public class Supervisor extends Salaried {
    
    BigDecimal bonus;
    
    public Supervisor(String name, String address, String idNum, String bossID, BigDecimal annualSalary,  BigDecimal bonus)
    {
        super(name, address, idNum, bossID, annualSalary);
    }
    public BigDecimal setGrossWeeklyPay(){
            //(𝐴𝑛𝑛𝑢𝑎𝑙 𝑆𝑎𝑙𝑎𝑟𝑦) ÷ 52 + (𝑏𝑜𝑛𝑢𝑠) ÷ 52
        }
    
    public BigDecimal getGrossWeeklyPay()
    {
        
        // TODO write method to return gross weekly pay
        //double grossWk=new pay;
        //return grossWeeklyPay;
    }
}
