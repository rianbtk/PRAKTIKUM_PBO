/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agussalim1941723007.percobaan4;

/**
 *
 * @author rian
 */
public class Percobaan4 {

    public static void main(String[] args) {
        Gerbong gerbong = new Gerbong("A", 10);
        Penumpang p = new Penumpang("12345", "Mr. Krab");
        gerbong.setPenumpang(p, 1);
        System.out.println(gerbong.info());
    }
}
