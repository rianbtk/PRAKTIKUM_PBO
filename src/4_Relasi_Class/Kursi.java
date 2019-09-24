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
public class Kursi {

    private String nomor;
    private Penumpang penumpang;

    public Kursi(String nomor) {
        this.nomor = nomor;
    }

    public void setNomer(String nomor) {
        this.nomor = nomor;
    }

    public String getNomer() {
        return nomor;
    }

    public void setPenumpang(Penumpang penumpang) {
        this.penumpang = penumpang;
    }

    public Penumpang getPenumpang() {
        return penumpang;
    }

    public String info() {
        String info = "";
        info += "Nomor  : " + nomor + "\n";
        if (this.penumpang != null) {
            info += "Ktp " + penumpang.info() + "\n";
        }
        return info;
    }

}
