/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod7oo.agussalimh1941723007;

/**
 *
 * @author rian
 */
public class Manager extends Karyawan {

    private double tunjangan;
    private String bagian;
    private Staff st[];

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    public String getBagian() {
        return bagian;
    }

    public void setSt(Staff[] st) {
        this.st = st;
    }

    public void viewStaff() {
        for (int i = 0; i < st.length; i++) {
            st[i].lihatInfo();
        }
        System.out.println("----------------");
    }
    public void lihatInfo(){
        System.out.println("Manager     : "+this.getBagian());
        System.out.println("NIP         : "+this.getNip());
        System.out.println("Nama        : "+this.getNama());
        System.out.println("Golongan    : "+this.getGolongan());
        System.out.println("Tunjangan   :%.Of\n"+this.getTunjangan());
        System.out.println("Gaji        :%.Of\n"+this.getGaji());
        System.out.println("Bagian      : "+this.getBagian());
    }
    @Override
    public double getGaji(){
        return super.getGaji()+tunjangan;
    }

}
