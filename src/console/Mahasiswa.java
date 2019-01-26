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
public class Mahasiswa {
    public static void menuMahasiswa(){
        while(true){
            System.out.println("no, nim, nama");
            for(int i = 0; i < logic.Mahasiswa.arrayMahasiswa.size(); i++){
                logic.Mahasiswa mahasiswa = logic.Mahasiswa.arrayMahasiswa.get(i);
                System.out.println((i+1) + ", " + mahasiswa.getNim() + ", " + mahasiswa.getNama());
            }
            System.out.println();
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("3. Edit");
            System.out.println("0. Kembali");
            System.out.println("Pilihan : ");

            String pilihan = input.nextLine();
            if (pilihan.equals("1")) {
                tambahMahasiswa();
            } else if (pilihan.equals("2")) {
                hapusMahasiswa();
            } else if (pilihan.equals("3")) {
                editMahasiswa();
            } else {
               return;
            }               
        }
    }
    public static void tambahMahasiswa(){
        System.out.println("Nim : ");
        String nim = input.nextLine();
        System.out.println("Nama : ");
        String nama = input.nextLine();
        logic.Mahasiswa.tambahMahasiswa(nama, nim);
    }
    public static void hapusMahasiswa(){
        System.out.println("Masukan no (bukan NIM) : ");
        int index = input.nextInt();
        index = index - 1;
        logic.Mahasiswa.arrayMahasiswa.remove(index);
    }
    public static void editMahasiswa(){
        System.out.println("Masukan no (bukan NIM) : ");
        int index = input.nextInt();
        index = index - 1;
        logic.Mahasiswa mahasiswa = logic.Mahasiswa.arrayMahasiswa.get(index); 
        System.out.println("Nim : ");
        String nim = input.nextLine();
        System.out.println("Nama : ");
        String nama = input.nextLine();
        mahasiswa.setNamaNim(nama, nim);
    }
}
