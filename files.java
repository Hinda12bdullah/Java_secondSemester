package project.javasemster2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hind
 */
import java.io.*;
import java.util.Formatter;
public class files {
   
    Formatter output;

    public void OpenFile(String FileName) {
        try {
            output = new Formatter(FileName);
        } catch (FileNotFoundException e) {
            System.err.println("ERORR: file not found mf\n " + e);
        }
    }

    public void writefile(Customer p) {
        try {
            output.format("%s \n", p.toString());
        } catch (Exception e) {
        }

    }
public void closfile(){
    if(output!= null)
    output.close();
}

}
