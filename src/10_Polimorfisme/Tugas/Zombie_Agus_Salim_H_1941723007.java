/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod10_Agus_Salim_H_1941723007.Tugas;

/**
 *
 * @author Rian
 */
public abstract class Zombie_Agus_Salim_H_1941723007 implements IDestroyable_Agus_Salim_H_1941723007{
    protected int mHealth;
    protected int mLevel;
    
    public abstract void heal_Agus_Salim_H_1941723007();
    public abstract void destroyed_Agus_Salim_H_1941723007();
    

    public String getZombieInfo_Agus_Salim_H_1941723007(){
        return "Health = " + this.mHealth + "\n"
        + "Level = " + this.mLevel + "\n";
    };
    
    

}
