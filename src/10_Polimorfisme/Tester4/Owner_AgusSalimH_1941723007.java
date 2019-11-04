/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod10_Agus_Salim_H_1941723007.Tester4;

import mod10_Agus_Salim_H_1941723007.Tester1.ElectricityBill_AgusSalimH_1941723007;
import mod10_Agus_Salim_H_1941723007.Tester1.Employee_AgusSalimH_1941723007;
import mod10_Agus_Salim_H_1941723007.Tester1.PermanentEmployee_AgusSalimH_1941723007;
import mod10_Agus_Salim_H_1941723007.Tester1.Payable_AgusSalimH_1941723007;

/**
 *
 * @author rian
 */
public class Owner_AgusSalimH_1941723007 {
    public void pay_AgusSalimH_1941723007(Payable_AgusSalimH_1941723007 p){
        System.out.println("Total payment = "+p.getPaymentAmount_AgusSalimH_1941723007());
        if (p instanceof ElectricityBill_AgusSalimH_1941723007){
            ElectricityBill_AgusSalimH_1941723007 eb = (ElectricityBill_AgusSalimH_1941723007) p;
            System.out.println(""+eb.getBillInfo_AgusSalimH_1941723007());
        }else if (p instanceof PermanentEmployee_AgusSalimH_1941723007){
            PermanentEmployee_AgusSalimH_1941723007 pe = (PermanentEmployee_AgusSalimH_1941723007) p;
            pe.getEmployeeInfo_AgusSalimH_1941723007();
            System.out.println(""+pe.getEmployeeInfo_AgusSalimH_1941723007());
        }
    }
    public void showMyEmployee_AgusSalimH_1941723007(Employee_AgusSalimH_1941723007 e){
        System.out.println(""+e.getEmployeeInfo_AgusSalimH_1941723007());
        if(e instanceof PermanentEmployee_AgusSalimH_1941723007)
            System.out.println("You have the pay her/him monthly!!!");
        else
            System.out.println("no need to pay /him/her :)");
    }
    
}
