/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod7.agussh1941723007.Per1;

/**
 *
 * @author rian
 */
public class Perkalianku {

    /**
     * @param args the command line arguments
     */
    void perkalian(int a,int b){
        System.out.println(a*b);
    }
    void perkalian(int a,int b,int c){
        System.out.println(a*b*c);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Perkalianku P = new Perkalianku();
        P.perkalian(25, 43);
        P.perkalian(34, 23, 56);
    }
    
}
