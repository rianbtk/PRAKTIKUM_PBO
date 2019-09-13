/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RianBtk
 */
public class Manusia {
    private String nama;
    private int tinggi=18;
    private int jumlah=0;
    
    public String btk1Nama(){
        return nama;
    }
    public void btkNama (String newNama){
        nama = newNama;
    }
    public int btk1Tinggi(){
        return tinggi;
    }
    public void btkTinggi (int newTinggi){
            if(tinggi==0x1){
                tinggi=30;
                jumlah=tinggi+tinggi;
            }
        }
    }
