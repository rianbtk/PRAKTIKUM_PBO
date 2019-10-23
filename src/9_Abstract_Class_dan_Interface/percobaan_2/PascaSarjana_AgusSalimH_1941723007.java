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
public class PascaSarjana_AgusSalimH_1941723007 extends Mahasiswa_AgusSalimH_1941723007 implements ICumlaude_AgusSalimH_1941723007,IBerprestasi_AgusSalimH_1941723007{

    public PascaSarjana_AgusSalimH_1941723007(String nama) {
        super(nama);
    }

    @Override
    public void lulus_AgusSalimH_1941723007() {
        System.out.println("Aku mahasiswa, namaku "+ this.nama);
        System.out.println("Aku berkuliyah Di Kampus");
        System.out.println("Aku sudah menyelesaikan TESIS");
    }

    @Override
    public void meraihIPKTertinggi_AgusSalimH_1941723007() {
        System.out.println("IPK-KU Lebih dari 3,71");
    }

    @Override
    public void menjuariKompetisi_AgusSalimH_1941723007() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIOANL");
    }

    @Override
    public void membuatPublikasiIlmiah_AgusSalimH_1941723007() {
        System.out.println("Saya menerbitkan artikel di jurnal INTERNASIOANAL");
    }
    
}
