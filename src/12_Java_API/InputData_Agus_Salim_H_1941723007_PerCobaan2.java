/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod12_PercobaanEmpat_agus_salim_h_1941723007;

/**
 *
 * @author rian
 */
import java.util.ArrayList;
public class InputData_Agus_Salim_H_1941723007_PerCobaan2 {
    ArrayList<Mahasiswa_Agus_Salim_H_1941723007_PerCobaan2> ListMahasiswa;

    public InputData_Agus_Salim_H_1941723007_PerCobaan2(){
        ListMahasiswa = new ArrayList();
    }
    public void isiData_Agus_Salim_H_1941723007_PerCobaan2(String Nim, String Nama, String Alamat){
        Mahasiswa_Agus_Salim_H_1941723007_PerCobaan2 mhs = new Mahasiswa_Agus_Salim_H_1941723007_PerCobaan2(Nim, Nama, Alamat);
        ListMahasiswa.add(mhs);
    } 
    public ArrayList<Mahasiswa_Agus_Salim_H_1941723007_PerCobaan2> getData(){
        return ListMahasiswa;
    }

    
}