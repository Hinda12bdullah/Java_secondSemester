/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.javasemster2;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author hind
 */
public class Rating extends Discount {
    
    private int rating;
 
    // constructor

    public Rating(int rating, double discount) {
        this.rating = rating;
    }

   
    public Rating() {

    } 
    Scanner read = new Scanner(System.in);
// setter and getter
      
    public int getRating() {
        ArrayList<Integer> review = new ArrayList<>();

        System.out.println(" \n\n** For a better experience, help us to improve our store by answering the review questions,"
                + "\nDon't worry the name will not appear ");
        System.out.println("\n1-Was the site working well ?\n Write 1 If YES , 0 If NO \n");
        int q1 = read.nextInt();
      
        if (q1== 1 || q1== 0) {
            review.add(q1);
           
        } else {
            System.out.println("Sorry, Wrong entry");
        }

        System.out.print("\n2-Did you have any difficulty adding items to the cart ? \n Write 1 If YES , 0 If NO\n ");
        int q2 = read.nextInt();
    
        if (q2 == 1 || q2 == 0) {
            review.add(q2);
        } else {
            System.out.println("Sorry, Wrong entry");
        }

        System.out.println("\n3-Did you enjoy your shopping ? \n Write 1 If YES , 0 If NO\n ");
        int q3 = read.nextInt();

        if (q3 == 1 || q3 == 0) {
            review.add(q3);
        } else {
            System.out.println("Sorry, Wrong entry");
        }
        System.out.println(review);
        
        if (q1 == 1 && q2 == 0 && q3 == 1) {
            
            System.out.println("\"Thank you for your trust\" Next Time you will have 15% Discount From Your Actual Bill");
            getThePrice();

        } else {
            System.out.println("\"thank you for sharing us your experiment\"");
        }
        return rating;
    }
    
    public void setRating(int rating) {
        this.rating = rating;
    }
      @Override
    public double getThePrice() {
       
   System.out.printf("Your Next Time Discount Is: %.2f  SAR",getDiscount()); 
   return getDiscount();
}   
}
        