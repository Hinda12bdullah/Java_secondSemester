/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.javasemster2;

/**
 *
 * @author hind
 */
public final class ID {
    
    private String name;
    private int id;
    private String country;
    private String city;

    //CONSTRUCTOR
    public ID(String name, String country, String city,int id) {
        this.name = name;
        this.country = country;
        this.city = city; 
    this.id=id;}

    //GETTER
    public String getName() {
        return name; }
   
    public String getCountry() {
        return country; }
   
    public String getCity() {
        return city; }

    //SETTER
    public void setName(String name) {
        this.name = name; }

    public void setCountry(String country) {
        this.country = country; }
   
    public void setCity(String city) {
        this.city = city;  }
  
    
    
   public String toString(){
       return String.format("%s , %d , %s , %s",name,id,country,city);
   }
   
   
   
}
