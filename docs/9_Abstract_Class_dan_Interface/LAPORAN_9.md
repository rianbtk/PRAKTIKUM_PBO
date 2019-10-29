---
noteId: "48f29630fa3111e9b6b6e3fa68a8db43"
tags: []

---

# LAPORAN MODUL 9 Abstract_Class_dan_Interface

## KOMPETENSI
    Setelah menyelesaikan lembar kerja ini mahasiswa diharapkan mampu:
    1. Menjelaskan maksud dan tujuan penggunaan Abstract Class;
    2. Menjelaskan maksud dan tujuan penggunaan Interface;
    3. Menerapkan Abstract Class dan Interface di dalam pembuatan program.

## Abstract Class
    Abstract Class adalah class yang tidak dapat diinstansiasi namun dapat di-extend. Abstract class baru
    dapat dimanfaatkan ketika ia di-extend.

## DIAGRAM CLASS
1. PERCOBAAN 1
![Diagram](img/Main1.png)]
2. PERCOBAAN 2
![Diagram](img/Main.png)]

## PERCOBAAN 1
![](img/Percobaan1_Output_1.png)

 link kode program: 

 [Main_Program](../../src/9_Abstract_Class_dan_Interface/percobaan_1/Mod9_AgusSalimH_1941723007.java)
 <br>
 [Class_Kucing](../../src/9_Abstract_Class_dan_Interface/percobaan_1/AgusSalimH_1941723007Kucing.java)
  <br>
 [Class_Hewan](../../src/9_Abstract_Class_dan_Interface/percobaan_1/HewanAgusSalimH_1941723007.java)
   <br>
 [Class_Ikan](../../src/9_Abstract_Class_dan_Interface/percobaan_1/IkanAgusSalimH_1941723007.java)
   <br>
 [Class_Orang](../../src/9_Abstract_Class_dan_Interface/percobaan_1/OrangAgusSalimH_1941723007.java)

### SOAL PERCOBAAN
    Bolehkah apabila sebuah class yang meng-extend suatu abstract class tidak 
    mengimplementasikan method abstract yang ada di class induknya? Buktikan!

    Jawab : Boleh
![](img/Percobaan1.png)

## PERCOBAAN 2
`Percobaan 1`
![](img/Percobaan2_Output_1.png)
<br>

`Percobaan 2`
![](img/Percobaan2_Output_2.png)
<br>

`Percobaan 3`
![](img/Percobaan2_Output_3.png)
<br>

`Percobaan 4`
![](img/Percobaan2_Output_4.png)
<br>

`Percobaan 5`
![](img/Percobaan2_Output_5.png)
<br>

`Percobaan 6`
![](img/Percobaan2_Output_6.png)
<br>
 link kode program: 
 
 [Main_Program](../../src/9_Abstract_Class_dan_Interface/percobaan_2/Mod9_AgusSalimH_1941723007Per2.java)
 <br>
 [ Interface_IBerprestasi](../../src/9_Abstract_Class_dan_Interface/percobaan_2/IBerprestasi_AgusSalimH_1941723007.java)
 <br>
 [ Interface_ICumlaude](../../src/9_Abstract_Class_dan_Interface/percobaan_2/ICumlaude_AgusSalimH_1941723007.java)
 <br>
 [ Class_Mahasiswa ](../../src/9_Abstract_Class_dan_Interface/percobaan_2/Mahasiswa_AgusSalimH_1941723007.java)
 <br>
 [ Class_Rektor ](../../src/9_Abstract_Class_dan_Interface/percobaan_2/Rektor_AgusSalimH_1941723007.java)
 <br>
 [ Class_Sarjana ](../../src/9_Abstract_Class_dan_Interface/percobaan_2/Sarjana_AgusSalimH_1941723007.java)
 <br>
 [ Class_PascaSarjana](../../src/9_Abstract_Class_dan_Interface/percobaan_2/PascaSarjana_AgusSalimH_1941723007.java)
 <br>
### SOAL PERCOBAAN
    a. Mengapa pada langkah nomor 9 terjadi error? Jelaskan!
    Jawab : karena class Mahasiswa belum implements ke Icumlaude
    b. Dapatkah method kuliahDiKampus() dipanggil dari objek sarjanaCumlaude di class
    Program? Mengapa demikian?
    Jawab : Tidak, Karena bukan salah satu method dari Class Interface
    c. Dapatkah method kuliahDiKampus() dipanggil dari parameter mahasiswa di method 
    beriSertifikatCumlaude() pada class Rektor? Mengapa demikian?
    Jawab : Tidak Kecuali kalau di class interface di tambah method kuliyahDikampus()
    d. Modifikasilah method beriSertifikatCumlaude() pada class Rektor agar hasil eksekusi 
    class Program menjadi seperti berikut ini:
Jawab : 
`Modifikasi beriSertifikatCumlaude()`![](img/Percobaan2_Output_3.png)