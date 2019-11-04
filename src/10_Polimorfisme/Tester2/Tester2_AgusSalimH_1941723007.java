/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod10_Agus_Salim_H_1941723007.Tester2;

import mod10_Agus_Salim_H_1941723007.Tester1.Employee_AgusSalimH_1941723007;
import mod10_Agus_Salim_H_1941723007.Tester1.PermanentEmployee_AgusSalimH_1941723007;

/**
 *
 * @author rian
 */
public class Tester2_AgusSalimH_1941723007 {
    public static void main(String[] args) {
        PermanentEmployee_AgusSalimH_1941723007 pEmp = new PermanentEmployee_AgusSalimH_1941723007("Dedik",500);
        Employee_AgusSalimH_1941723007 e;
        e = pEmp;
        System.out.println(""+e.getEmployeeInfo_AgusSalimH_1941723007());
        System.out.println("-------------------");
        System.out.println(""+pEmp.getEmployeeInfo_AgusSalimH_1941723007());
    }
}
