/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agussalim1941723007.percobaan3;

/**
 *
 * @author rian
 */
public class Percobaan3 {

    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("010203", "Rian");
        Pegawai asisten = new Pegawai("030405", "Hafid");
        KeretaApi keretaApi = new KeretaApi("   RJK JKT", "   EKSEKUTIF", masinis, asisten);

        System.out.println(keretaApi.info());
    }
}
