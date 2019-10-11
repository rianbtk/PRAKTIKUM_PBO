/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod7oo.agussalimh1941723007;

/**
 *
 * @author rian
 */
public class MainClassMod7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Program Testing Class Manager & Staff");
        Manager M[]=new Manager[2];
        Staff S[]=new Staff[2];
        Staff SS[]=new Staff[3];
        
        M[0]=new Manager();
        M[0].setNama("Agus");
        M[0].setNip("101");
        M[0].setGolongan("1");
        M[0].setTunjangan(500000);
        M[0].setBagian("Administration");
        
        
        M[1]=new Manager();
        M[1].setNama("Rian");
        M[1].setNip("102");
        M[1].setGolongan("1");
        M[1].setTunjangan(2500000);
        M[1].setBagian("Pemasaran");
        
        S[0]=new Staff();
        S[0].setNama("Hafid");
        S[0].setNip("003");
        S[0].setGolongan("2");
        S[0].setGajiLembur(10);
        S[0].setGajiLembur(10000);
        
        S[1]=new Staff();
        S[1].setNama("Duta");
        S[1].setNip("004");
        S[1].setGolongan("3");
        S[1].setLembur(10);
        S[1].setGajiLembur(55000);
        
        SS[0]=new Staff();
        SS[0].setNama("Pamungkas");
        SS[0].setNip("0004");
        SS[0].setGolongan("3");
        SS[0].setLembur(15);
        SS[0].setGajiLembur(5500);
        
        SS[1]=new Staff();
        SS[1].setNama("Pandu");
        SS[1].setNip("006");
        SS[1].setGolongan("4");
        SS[1].setLembur(5);
        SS[1].setGajiLembur(100000);
        
        SS[2]=new Staff();
        SS[2].setNama("Daya");
        SS[2].setNip("0001");
        SS[2].setGolongan("3");
        SS[2].setLembur(6);
        SS[2].setGajiLembur(20000);
        
        M[1].setSt(SS);    
        M[0].lihatInfo();
        M[1].lihatInfo();
        S[0].lihatInfo();
        S[1].lihatInfo();
        SS[0].lihatInfo();
        SS[1].lihatInfo();
        
        
        
        
    }
    
}
