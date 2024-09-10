/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.javasemster2;

/**
 *
 * @author hind
 */
public class Bill implements PRICE {

    int OrderNumber=(int)(Math.random()*((99999-00000)+1)+00000);
    
    //Getter
     public int getOrderNumber() {
        return OrderNumber; }
   
    @Override
    public double getThePrice() {
   System.out.println("your Bill is : "+Store.counter+"\n your order number is : "+OrderNumber); 
   return Store.counter; }
    
    
}
    
    
    
   
