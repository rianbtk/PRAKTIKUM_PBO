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
public class IntershipEmployee_AgusSalimH_1941723007 extends Employee_AgusSalimH_1941723007{
    private int lenght;

    public IntershipEmployee_AgusSalimH_1941723007(String name,int lenght) {
        this.name = name;
        this.lenght = lenght;
    }
    public int getLenght_AgusSalimH_1941723007() {
        return lenght;
    }

    public void setLenght_AgusSalimH_1941723007(int lenght) {
        this.lenght = lenght;
    }
    @Override
    public String getEmployeeInfo_AgusSalimH_1941723007(){
        String info = super.getEmployeeInfo_AgusSalimH_1941723007()+"\n";
        info += "Registered ad intership employee for "+lenght+" month/s\n";
        return info;
    }
    
    
}
