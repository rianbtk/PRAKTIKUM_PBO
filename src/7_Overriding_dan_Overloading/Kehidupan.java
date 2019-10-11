/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod7.agussh1941723007.overidding.kehidupan;

/**
 *
 * @author rian
 */
class Manusia {

        public void bernafas() {
            System.out.println("Manusia Bernafas");
        }

        public void Makan() {
            System.out.println("Manusia");
        }

    }

    class Dosen extends Manusia {

        @Override
        public void Makan() {
            System.out.println("Nasi");
        }

        public void Lembur() {
            System.out.println("Tugas");
        }
    }

    class Mahasiswa extends Manusia {

        @Override
        public void Makan() {
            System.out.println("3 Kali Sehari");
        }

        public void Tidur() {
            System.out.println("Istirahat");
        }
    }

public class Kehidupan {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
       Manusia M=new Manusia();
       Manusia MM=new Mahasiswa();
       M.Makan();
       M.bernafas();
       MM.Makan();
       MM.bernafas();
    }

}
