/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod9_agussalimh_1941723007.per2;

/**
 *
 * @author rian
 */
public class Mahasiswa_AgusSalimH_1941723007 implements ICumlaude_AgusSalimH_1941723007{
    protected String nama;
    public Mahasiswa_AgusSalimH_1941723007 (String nama){
        this.nama = nama;
    }
    public void kuliahDikampus_AgusSalimH_1941723007(){
    }

    @Override
    public void lulus_AgusSalimH_1941723007() {
        System.out.println("Aku mahasiswa, namaku "+ this.nama);
    }

    @Override
    public void meraihIPKTertinggi_AgusSalimH_1941723007() {
        System.out.println("Aku berkuliyah di kampus.");
    }
    
}
