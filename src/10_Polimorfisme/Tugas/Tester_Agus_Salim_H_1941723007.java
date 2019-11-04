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
public class Tester_Agus_Salim_H_1941723007 {
    public static void main(String[] args) {
        WalkingZombie_Agus_Salim_H_1941723007 wz = new WalkingZombie_Agus_Salim_H_1941723007(100, 1);
        JumpingZombie_Agus_Salim_H_1941723007 jz = new JumpingZombie_Agus_Salim_H_1941723007(100, 2);
        Barrier_Agus_Salim_H_1941723007 b = new Barrier_Agus_Salim_H_1941723007(100);
        Plant_Agus_Salim_H_1941723007 p = new Plant_Agus_Salim_H_1941723007();
        System.out.println(""+wz.getZombieInfo_Agus_Salim_H_1941723007());
        System.out.println(""+jz.getZombieInfo_Agus_Salim_H_1941723007());
        System.out.println(""+b.getBarrierInfo_Agus_Salim_H_1941723007());
        System.out.println("---------------------");
        for (int i = 0; i < 4; i++) {//Destroy the enemis 4 times
            p.doDestroy_Agus_Salim_H_1941723007(wz);
            p.doDestroy_Agus_Salim_H_1941723007(jz);
            p.doDestroy_Agus_Salim_H_1941723007(b);
        }
        System.out.println(""+wz.getZombieInfo_Agus_Salim_H_1941723007());
        System.out.println(""+jz.getZombieInfo_Agus_Salim_H_1941723007());
        System.out.println(""+b.getBarrierInfo_Agus_Salim_H_1941723007());
    }
}
