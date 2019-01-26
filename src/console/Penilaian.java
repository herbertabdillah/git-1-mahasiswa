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
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("3. Edit");
            System.out.println("0. Kembali");
            System.out.println("Pilihan : ");

            String pilihan = input.nextLine();
            if (pilihan.equals("1")) {
                System.out.println("Belum Di Coding Broo!");
            } else if (pilihan.equals("2")) {
                System.out.println("Belum Di Coding Broo!");
            } else if (pilihan.equals("3")) {
                System.out.println("Belum Di Coding Broo!");
            } else {
               return;
            }              
        }

    }    
}
