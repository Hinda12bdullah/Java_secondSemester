/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.javasemster2;

/**
 *
 * @author hind
 * 
 */
import java.util.Scanner;
public abstract class Store {
    
    private final int Eyeliner=30;
    private final int EyeShadow=200;
    private final int Mascara=30;
    
    private final int LipGlos=25;
    private final int LipLiner=15;
    private final int LipStick=50;
    
    private final int concealer=45;
    private final int Foundation=100;
    private final int Contour=60;

    static int counter;
    
    //GETTER
    public int getEyeShadow() {return EyeShadow; }
   
    public int getMascara() {return Mascara; }
        
    public int getLipLiner() {return LipLiner;  }
        
    public int getLipStick() {return LipStick; }
         
    public int getFoundation() {return Foundation; }
        
    public int getContour() {return Contour;}
            
    public int getEyeliner() {return Eyeliner; }
        
    public int getLipGlos() {return LipGlos; }
         
    public int getConcealer() {return concealer;  }
        
    public static int getCounter() {
        return counter; }
   
    abstract void DisplayProducts();
    
   
}
    

    

