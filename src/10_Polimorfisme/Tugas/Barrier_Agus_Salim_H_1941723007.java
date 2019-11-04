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
public class Barrier_Agus_Salim_H_1941723007 implements IDestroyable_Agus_Salim_H_1941723007{
    private int mStrength;
    
    public Barrier_Agus_Salim_H_1941723007(int mStrength) {
        this.mStrength = mStrength;
    }

    public int getmStrength_Agus_Salim_H_1941723007() {
        return mStrength;
    }

    public void setmStrength_Agus_Salim_H_1941723007(int mStrength) {
        this.mStrength = mStrength;
    }

    @Override
    public void destroyed_Agus_Salim_H_1941723007() {
        this.mStrength -= (0.1 * this.mStrength);
    }
    public String getBarrierInfo_Agus_Salim_H_1941723007(){
        return "Barrier Strength = " + this.mStrength;
    }
}
