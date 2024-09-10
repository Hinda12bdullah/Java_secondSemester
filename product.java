/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.javasemster2;
import java.util.ArrayList;
import java.util.Scanner;
import static project.javasemster2.Store.counter;
/**
 *
 * @author hind
 */
public class product extends Store{
    

    @Override
    void DisplayProducts(){
    Scanner read=new Scanner(System.in);
        int choosen;
        int add;
        int choice;
        do{
      
        System.out.println(
                 "\nChoose a number from the list :\n"
                + "1- Eyeliner\n"
                + "2- EyeShadow\n"
                + "3- Mascara\n"
                + "4-Lip Stick\n"
                + "5-Lip Glos\n"
                + "6-Lip Liner\n"
                + "7-Concealer\n"
                + "8-Contour\n"
                + "9-Foundation\n"
                + "10- Exit\n");
        choice=read.nextInt();
         switch (choice) {
            case 1:
                     
                System.out.println("Eyeliner price is : "+getEyeliner());
                System.out.println("\nDo you want to add to cart ?\n"
                        + "Write (0) To add , otherWise enter -1 to back to the list :");
                add=read.nextInt();
               if(add==0){
                   counter+=30;}
               break;   
            case 2: 
            System.out.println("Eye Shadow price is : "+getEyeShadow());
                System.out.println("\nDo you want to add to cart ?\n"
                        + "Write (0) To add , otherWise enter -1 to back to the list :");
                add=read.nextInt();
                
               if(add==0){
                   counter+=200;}
              break;  
            case 3: 
                System.out.println(" Mascara price is : "+getMascara());
                System.out.println("\nDo you want to add to cart ?\n"
                        + "Write (0) To add , otherWise enter -1 to back to the list :");
                add=read.nextInt();
                
               if(add==0){
                   counter+=getMascara();}
              break;
            case 4: 
                System.out.println("Lip Stick price is : "+getLipStick());
                System.out.println("\nDo you want to add to cart ?\n"
                        + "Write (0) To add , otherWise enter -1 to back to the list :");
                add=read.nextInt();
                
               if(add==0){
                   counter+=getLipStick();}
               break;
            case 5: 
                System.out.println("Lip Glos price is : "+getLipGlos());
                System.out.println("\n Do you want to add to cart ?\n"
                        + "Write (0) To add , otherWise enter -1 to back to the list :");
                add=read.nextInt();
                
               if(add==0){
                   counter+=getLipGlos();}
               break;
            case 6:
                System.out.println("Lip Liner price is : "+getLipLiner());
                System.out.println("\nDo you want to add to cart ?\n"
                        + "Write (0) To add , otherWise enter -1 to back to the list :");
                add=read.nextInt();
                
               if(add==0){
                   counter+=getLipLiner();}
               break;
            case 7: 
                System.out.println("Concealer price is : "+getConcealer());
                System.out.println("\nDo you want to add to cart ?\n"
                        + "Write (0) To add , otherWise enter -1 to back to the list :");
                add=read.nextInt();
                
               if(add==0){
                   counter+=getConcealer();} 
               break;
            case 8:   
                 System.out.println("Contour price is : "+getContour());
                System.out.println("\nDo you want to add to cart ?\n"
                        + "Write (0) To add , otherWise enter -1 to back to the list :");
                add=read.nextInt();
                
               if(add==0){
                   counter+=getContour();} 
               break;
            case 9:
                System.out.println("Foundation price is : "+getFoundation());
                System.out.println("\nDo you want to add to cart ?\n"
                        + "Write (0) To add , otherWise enter -1 to back to the list :");
                add=read.nextInt();
                
               if(add==0){
                   counter+=getFoundation();} 
               break;
            case 10:
            System.out.println("\nThank you for shopping from our store \n"
                 + " we hope to see you again \n"); 
            break;
             }} while (choice!=10 && choice<10);
        
    
    
    
}}
