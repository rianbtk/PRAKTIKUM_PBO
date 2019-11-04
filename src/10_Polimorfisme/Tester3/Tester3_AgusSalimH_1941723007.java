/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod10_Agus_Salim_H_1941723007.Tester3;
import mod10_Agus_Salim_H_1941723007.Tester1.ElectricityBill_AgusSalimH_1941723007;
import mod10_Agus_Salim_H_1941723007.Tester1.Employee_AgusSalimH_1941723007;
import mod10_Agus_Salim_H_1941723007.Tester1.IntershipEmployee_AgusSalimH_1941723007;
import mod10_Agus_Salim_H_1941723007.Tester1.PermanentEmployee_AgusSalimH_1941723007;
import mod10_Agus_Salim_H_1941723007.Tester1.Payable_AgusSalimH_1941723007;

/**
 *
 * @author rian
 */
public class Tester3_AgusSalimH_1941723007 {
    public static void main(String[] args) {
        PermanentEmployee_AgusSalimH_1941723007 pEmp = new PermanentEmployee_AgusSalimH_1941723007("Dedik ",500);
        IntershipEmployee_AgusSalimH_1941723007 iEmp = new IntershipEmployee_AgusSalimH_1941723007("Sunarto ",5);
        ElectricityBill_AgusSalimH_1941723007 eBill = new ElectricityBill_AgusSalimH_1941723007 (5,"A-1");
        Employee_AgusSalimH_1941723007 e[] = {pEmp,iEmp};
        Payable_AgusSalimH_1941723007 p[] = {pEmp, eBill};
//        Employee_AgusSalimH_1941723007 e2[] = {pEmp, iEmp, eBill};
    }
}