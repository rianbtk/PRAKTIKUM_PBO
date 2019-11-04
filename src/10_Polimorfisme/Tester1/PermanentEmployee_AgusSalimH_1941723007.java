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
public class PermanentEmployee_AgusSalimH_1941723007 extends Employee_AgusSalimH_1941723007 implements Payable_AgusSalimH_1941723007{
    private int salary;

    public PermanentEmployee_AgusSalimH_1941723007(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public int getSalary_AgusSalimH_1941723007() {
        return salary;
    }

    public void setSalary_AgusSalimH_1941723007(int salary) {
        this.salary = salary;
    }
    
    @Override
    public int getPaymentAmount_AgusSalimH_1941723007() {
        return (int) (salary*0.05+salary);
    }
    @Override
    public String getEmployeeInfo_AgusSalimH_1941723007(){
        String info = super.getEmployeeInfo_AgusSalimH_1941723007()+"\n";
        info += "Registered ad intership employee for "+salary+" month/s\n";
        return info;
    }
    
}
