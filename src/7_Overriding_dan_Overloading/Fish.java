/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod7.agussh1941723007.Fish;

/**
 *
 * @author rian
 */
class Ikan{
    public void swim(){
        System.out.println("Ikan Bisa Berenang");
    }
}
class Piranha extends Ikan{
    @Override
    public void swim(){
        System.out.println("Piranha Bisa Makan");
    }
}
public class Fish {
    public static void main(String[] args) {
        Ikan I = new Ikan();
        Ikan II = new Piranha();
        I.swim();
        II.swim();
    }
  
}
