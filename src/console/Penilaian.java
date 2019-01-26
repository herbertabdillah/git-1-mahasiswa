/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package console;

import static console.Main.input;

/**
 *
 * @author Lenovo
 */
public class Penilaian {
    public static void menuPenilaian(){
        while(true){
            System.out.println("no, nim, nama, formatif, uts, uas, total");
            for(int i = 0; i < logic.Mahasiswa.arrayMahasiswa.size(); i++){
                logic.Mahasiswa mahasiswa = logic.Mahasiswa.arrayMahasiswa.get(i);
                System.out.println((i+1) + ", " + mahasiswa.getNim() + ", " + mahasiswa.getNama() + ", " +
                        mahasiswa.getFormatif() + ", " + mahasiswa.getUts() + ", " + mahasiswa.getUas() + ", " + mahasiswa.getTotal());
            }
            System.out.println();
            System.out.println("1. Isi nilai");
            System.out.println("2. Hapus");
            System.out.println("3. Edit");
            System.out.println("0. Kembali");
            System.out.println("Pilihan : ");

            String pilihan = input.nextLine();
            if (pilihan.equals("1")) {
                isiNilai();
            } else if (pilihan.equals("2")) {
                System.out.println("Belum Di Coding Broo!");
            } else if (pilihan.equals("3")) {
                System.out.println("Belum Di Coding Broo!");
            } else {
               return;
            }              
        }

    }
    public static void isiNilai(){
        System.out.println("Masukan no (bukan NIM) : ");
        int index = input.nextInt();
        input.nextLine();
        index = index - 1;
        logic.Mahasiswa mahasiswa = logic.Mahasiswa.arrayMahasiswa.get(index); 
        System.out.println("Formatif : ");
        double formatif = input.nextDouble();
        input.nextLine();
        System.out.println("UTS : ");
        double uts = input.nextDouble();
        input.nextLine();
        System.out.println("UAS : ");
        double uas = input.nextDouble();
        input.nextLine();
        mahasiswa.setSemuaNilai(formatif, uts, uas);
    }
}
