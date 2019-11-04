/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod10_Agus_Salim_H_1941723007.Tester1;

/**
 *
 * @author rian
 */
public class Tester1_AgusSalimH_1941723007_Percobaan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PermanentEmployee_AgusSalimH_1941723007 pEmp = new PermanentEmployee_AgusSalimH_1941723007("Dedik ",500);
        IntershipEmployee_AgusSalimH_1941723007 iEmp = new IntershipEmployee_AgusSalimH_1941723007("Sunarto ",5);
        ElectricityBill_AgusSalimH_1941723007 eBill = new ElectricityBill_AgusSalimH_1941723007 (5,"A-1");
        Employee_AgusSalimH_1941723007 e;
        Payable_AgusSalimH_1941723007 p;
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;
//        e = eBill;
//        p = iEmp;
    }
    
}
