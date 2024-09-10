/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.javasemster2;
import java.util.Scanner;
/**
 *
 * @author hind
 */
public class Shipping implements PRICE{
    
    Scanner read=new Scanner(System.in);
    
    private String driverName;
    private int day;

    //Construtor
    public Shipping(String driverName, int day) {
        this.driverName = driverName;
        this.day = day; }
   
    void message(){
        System.out.println("\nYour shipment has been received "
                + "\n It is expected to be delivered within :"+day+" days"
                        + "\n driver Name : "+driverName);
    }

    @Override
    public double getThePrice() {
        System.out.println("\nShipping charges is : 35.0SAR"
                + "\nDo you want to deliver the shipment ? or pick up from the branch"
                + "\n Hint : Delivery cost is : 20.0SAR"
                + "\n write (T) to receive from the branch ,(F) for delivry ");
        char choose=read.next().charAt(0);
        
        switch (choose) {
            case 'T':
               System.out.println("Thank you , your bill : "+(Store.counter+35)+" SAR"+" Please pay upon receipt");
               
                return Store.counter;
             
            case 't':
                System.out.println("Thank you , your bill : "+(Store.counter+35)+" SAR"+" Please pay upon receipt");
                return Store.counter;
              
            case 'F':
               System.out.println("Thank you , your bill : "+(Store.counter+55)+" SAR"+" Please pay upon receipt");
                return Store.counter;
             
            case 'f':
                System.out.println("Thank you , your bill : "+(Store.counter+55)+" SAR"+" Please pay upon receipt");
                return Store.counter;
                
            default:
                System.out.println("(\"Sorry, Wrong entry\")");
              
        }
        return Store.counter;
                }
    }
    
    
