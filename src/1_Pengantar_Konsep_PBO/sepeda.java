package com.mycompany.sepeda;

/**
 * @author RianBtk
 */
public class sepeda {
    private String brand; private  int speed; private int maxspeed; private String nama; private int nim;
    
    public void setBrand (String newValue) {
        brand = newValue;
    } 
    public void maxSpeed(int newValue) {
        maxspeed =newValue;
    } 
    public void xSpeed(int increment) {
        speed = speed + increment;
    } 
        public void pmlkNama(String newValue)
    {
        nama = newValue;
    }
    public void idNim(int increment)
    {
        nim = nim + increment;
    }
    public void suspensi(int decrement) {
        speed = speed + decrement;
    }
    public void cetakStatus() {
        System.out.println("Nama : " + nama);
        System.out.println("Nim : "+ nim);
        System.out.print("Brand : "+brand);
        System.out.println("Speed :"+speed);
        System.out.println("Max Speed : "+maxspeed);
        System.out.println("Berhasil");
    }
}
