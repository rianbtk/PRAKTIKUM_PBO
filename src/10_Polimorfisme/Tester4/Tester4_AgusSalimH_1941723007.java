/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod10_Agus_Salim_H_1941723007.Tester4;

import mod10_Agus_Salim_H_1941723007.Tester1.ElectricityBill_AgusSalimH_1941723007;
import mod10_Agus_Salim_H_1941723007.Tester1.IntershipEmployee_AgusSalimH_1941723007;
import mod10_Agus_Salim_H_1941723007.Tester1.PermanentEmployee_AgusSalimH_1941723007;

/**
 *
 * @author rian
 */
public class Tester4_AgusSalimH_1941723007 {
    public static void main(String[] args) {
        Owner_AgusSalimH_1941723007 ow = new Owner_AgusSalimH_1941723007();
        ElectricityBill_AgusSalimH_1941723007 eBill = new ElectricityBill_AgusSalimH_1941723007(5, "R-1");
        PermanentEmployee_AgusSalimH_1941723007 pEmp = new PermanentEmployee_AgusSalimH_1941723007("Dedik ",500);
        IntershipEmployee_AgusSalimH_1941723007 iEmp = new IntershipEmployee_AgusSalimH_1941723007("Sunarto ",5);
        
        ow.pay_AgusSalimH_1941723007(eBill);
        System.out.println("---------------");
        
//        ow.pay_AgusSalimH_1941723007(pEmp);
//        System.out.println("---------------");
        ow.pay_AgusSalimH_1941723007(pEmp);
        ow.showMyEmployee_AgusSalimH_1941723007(pEmp);
//        ow.showMyEmployee_AgusSalimH_1941723007(iEmp);
        System.out.println("---------------");
        ow.showMyEmployee_AgusSalimH_1941723007(iEmp);
        
//        ow.pay(iEmp);
        
        
    }
}
