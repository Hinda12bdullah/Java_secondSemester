/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project.javasemster2;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.io.*;
/**
 *
 * @author hind
 */
public class PROJECTJavaSemster2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner read = new Scanner(System.in);

        Customer[] list = new Customer[1];
        try {
            System.out.println(" \u001B[41m" + "Welcome To ****** FLOWER ****** Store" + "\u001B[47m");
            System.out.println("\n \n  Please inter your information :-");
            System.out.print("1- Enter your Name :  ");
            String name = read.next();

            System.out.print(" 2- Enter your ID :  ");
            int id = read.nextInt();

            System.out.print("3- Enter your Country :  ");
            String country = read.next();

            System.out.print("4-Please Enter your City :  ");
            String city = read.next();
            System.out.println("\n** Thank you, you have been successfully registered **");

            for (int i = 0; i < list.length; i++) {
                list[i] = new Customer(new ID(name, country, city, id));

                }
                
               
        } catch (InputMismatchException e) {
            System.err.println("ERORR!!.." + e); }
       
        files writer = new files();
                writer.OpenFile("MAKE UP STORE");
                for (Customer c : list) {
                    writer.writefile(c);
                }
                writer.closfile();
                
                                
                readfile reader=new readfile();
                reader.OpenFile("MAKE UP STORE");
                reader.readfile();
                reader.closefile();


        System.out.println("\nWrite (1) to Display the Product , Otherwise LOG OUT");
        int answer = read.nextInt();

        Cart(answer);
        Bill ob2 = new Bill();
        ob2.getThePrice();

        ArrayList<Shipping> array=new ArrayList<Shipping>();
        Shipping ob3 = new Shipping("Ahmad", 3);
        array.add(ob3);
        array.indexOf(ob3.getThePrice());
        ob3.message();
        
        Rating rate = new Rating();
        rate.getRating();

    }

    public static void Cart(int ans) {
        if (ans == 1) {
            product ob1 = new product();
            ob1.DisplayProducts();
        } else {
            System.out.println("Thank you");
        }
}
}