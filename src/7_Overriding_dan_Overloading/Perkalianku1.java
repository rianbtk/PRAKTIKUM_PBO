/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod7.agussh1941723007.Per2;

/**
 *
 * @author rian
 */
public class Perkalianku {
    void perkalian(int a,int b){
        System.out.println(a*b);
    }
    void perkalian(double a,double b){
        System.out.println(a*b);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Perkalianku Pe = new Perkalianku();
        Pe.perkalian(25, 43);
        Pe.perkalian(34.56, 23.7);
    }
}
