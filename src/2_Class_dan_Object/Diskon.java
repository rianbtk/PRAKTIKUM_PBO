
import java.util.Scanner;

/*
 */

/**
 *
 * @author RianBtk
 */
public class Diskon {
    Scanner btk = new Scanner(System.in);
    public int hargaDasar;
    public int total;
    public int kode;
    public String namaBarang;
    float diskon;
    int hitungHargaJual;
    
    public void tampilData(){
        System.out.println("Diskon = 15%");
        System.out.println("Tambahan Diskon 5%\n Total Diskon = 20%\n Total Bayar = " +total);
        System.out.println("Total Bayar = Rp."+total);
    }    
}
