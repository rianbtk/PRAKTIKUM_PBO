/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author RianBtk
 */
public class MotorNinja {
    private int kecepatan = 0;
    private boolean kunciOn = false;
    
    public void hidupkanMesin(){
        kunciOn = true;
    }
    public void matikanMesin(){
        kunciOn=false;
        kecepatan=0;
    }
    public void tambahSpeed(){
        if (kunciOn == true){
            kecepatan+=50;
        }
        else{
            System.out.println("Nyalakan Mesin Dulu \n");
        }
    }
    public void kurangiSpeed(){
        if (kunciOn==true){
            kecepatan-=20;
        }
        else{
            System.out.println("Nyalakan Mesin Dulu \n");
        }
    }
    public void cetakSpeed(){
        if (kunciOn==true){
            System.out.println("Kontak On ");
        }
        else{
            System.out.println("Kontak Off");
        }
        System.out.println("Speed "+kecepatan+"\n");
    }
    
}
