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
public class JumpingZombie_Agus_Salim_H_1941723007 extends Zombie_Agus_Salim_H_1941723007{
    
    public JumpingZombie_Agus_Salim_H_1941723007(int mHealth, int mLevel){
    this.mHealth = mHealth;
    this.mLevel = mLevel;
}

    @Override
    public void heal_Agus_Salim_H_1941723007() {
        switch(this.mLevel){
            case 1: this.mHealth += (30/100 * this.mHealth);break;
            case 2: this.mHealth += (40/100 * this.mHealth);break;
            case 3: this.mHealth += (50/100 * this.mHealth);break;
        }
    }

    @Override
    public void destroyed_Agus_Salim_H_1941723007() {
        this.mHealth -= (10 * this.mHealth / 100);
    }

    @Override
    public String getZombieInfo_Agus_Salim_H_1941723007() {
        String info = super.getZombieInfo_Agus_Salim_H_1941723007();
        return "Jumping Zombie Data = \n"
        + info;
    }
}
