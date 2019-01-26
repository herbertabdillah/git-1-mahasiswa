/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package console;

import java.util.Scanner;
import logic.Mahasiswa;

/**
 *
 * @author Lenovo
 */
public class Main {
    static Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        while(true){
            menuUtama();
        }
    }
    public static void menuUtama(){
        System.out.println("Menu Utama");
        System.out.println("1. Mock Data");
        System.out.println("2. Mahasiswa");
        System.out.println("3. Penilaian");
        System.out.println("Pilihan : ");
        
        String pilihan = input.nextLine();
        if (pilihan.equals("1")) {
            mock.MahasiswaDanNilai.mock();
        } else if (pilihan.equals("2")) {
            console.Mahasiswa.menuMahasiswa();
        } else if (pilihan.equals("3")) {
            console.Penilaian.menuPenilaian();
        } else {
           System.exit(0);
        }       
    }
}
