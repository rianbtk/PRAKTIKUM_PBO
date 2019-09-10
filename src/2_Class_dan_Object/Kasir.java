package perpus;
import java.util.Scanner;

/**
 *
 * @author RianBtk
 */
public class Kasir {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int jumlah;
        int harga;
        int total=0;
        int jumlahbuku1;
        String namaMHS, judul, nim;   
        System.out.println("Masukan Nama Anda : ");
        namaMHS = a.nextLine();
        System.out.println("Masukan NIM : ");
        nim = a.nextLine();
        System.out.println("Masukan Judul Buku? : ");
        judul= a.nextLine();
        System.out.println("Masukan Jumlah buku ? : ");
        jumlahbuku1 = a.nextInt();
        System.out.println("TERIMA KASIH SUDAH MEMINJAM DI PERPUSTAKAAN");
        System.out.println("BUKU AKAN DI HITUNG SEGERA");
        System.out.println("ID Buku 1 Spesial(Rp.10000/pinjam) ");
        System.out.println("ID Buku Selain 1 Free(Rp0) ");
        for (int buku=0; buku<jumlahbuku1;buku++){
            System.out.println("ID Buku 1 : ");
            jumlah = a.nextInt();
            if(jumlah==0x1){
                harga=10000;
                total=total+harga;
            }
        }
        System.out.println("Nama Buku        : "+ namaMHS);
        System.out.println("Nim Mahasiswa    : "+ nim);
        System.out.println("Jumlah Pinjam    : "+ jumlahbuku1);
        System.out.println("Judul Buku       : "+ judul);
        System.out.println("Biaya Pinjam     : "+ total);
    }
}
