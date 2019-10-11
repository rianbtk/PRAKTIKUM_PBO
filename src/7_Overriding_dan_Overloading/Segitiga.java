/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod7.agussh1941723007.overloading.segitiga;

/**
 *
 * @author rian
 */
public class Segitiga {

    /**
     * @param args the command line arguments
     */
    private int sudut;
    
    void totalSudut(int sudutA){
        System.out.println(">>>>>>");
        System.out.println(180-(sudutA));
        System.out.println(">>>>>>");
    }
    void totalSudut(int sudutA, int sudutB){
        System.out.println(180-(sudutA+sudutB));
        System.out.println(">>>>>>");
    }
    void keliling(int sisiA,int sisiB, int sisiC){
        System.out.println(sisiA+sisiB+sisiC);
        System.out.println(">>>>>>");
    }
    void keliling(double sisiA,double sisiB){
        System.out.println(sisiA+sisiB*100/100);
        System.out.println(">>>>>>");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Segitiga S=new Segitiga();
        S.totalSudut(20);
        S.totalSudut(20, 30);
        S.keliling(10, 50);
        S.keliling(10, 50, 90);
    }
    
    
}
