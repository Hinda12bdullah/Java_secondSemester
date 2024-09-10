/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.javasemster2;

/**
 *
 * @author hind
 */
public class Customer  {
    
    private ID information;

    // CONSTRUCTOR
    public Customer(ID information) {
       this.information = information; }
   
    //GETTER
    public ID getInformation() {
        return information;}

    
   // TO STRING METHOD
    @Override
   public String toString(){
     return String.format("THE CUSTOMER INFORMATION IS : %s\n ",getInformation()); }
   
    
    
    
}
