/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.javasemster2;

/**
 *
 * @author hind
 */
public class Discount extends Bill{
    
    protected double discount=.15;

    public Discount() {
    }

    static int i;
  
    public Discount(double discount) {
        
        this.discount = discount;
       
    }

    public double getDiscount() {
     
     discount=Store.counter * discount;
     return discount;
    }
   
    
}
