/*
 * To change this license header, choose btkicense Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agussalim1941723007.percobaan1;

/**
 *
 * @author rian
 */
public class Percobaan1 {

    public static void main(String[] args) {
        Processor p = new Processor("intel i7", 1);
        Laptop btk = new Laptop("ASUSE", p);

        btk.info();

        Processor p1 = new Processor();
        p1.setMerk("Intel i7");
        p1.setCache(2);
        Laptop btk1 = new Laptop();
        btk1.setMerk("ASUSE");
        btk1.setProc(p1);
        btk1.info();

    }

}
