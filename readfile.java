/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.javasemster2;

/**
 *
 * @author hind
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class readfile {
    
    Scanner input;

    public void OpenFile(String filename) {
        try {
            input = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            System.err.println("ERROR:file not found\n" + e);
        }
    }
public void readfile(){
    while (input.hasNext()) {
        System.out.println(input.nextLine());
        
    }
}
public void closefile(){
    if(input!=null)
        input.close();
}
}
