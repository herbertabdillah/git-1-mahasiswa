/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mock;

import logic.Mahasiswa;

/**
 *
 * @author Lenovo
 */
public class MahasiswaDanNilai {
    public static void mock(){
        Mahasiswa.tambahMahasiswa("A", "11170910000001", 42, 87, 94);
        Mahasiswa.tambahMahasiswa("B", "11170910000002", 84, 95, 95);
        Mahasiswa.tambahMahasiswa("C", "11170910000003", 95, 74, 65);
        Mahasiswa.tambahMahasiswa("D", "11170910000004", 76, 67, 84);
        Mahasiswa.tambahMahasiswa("E", "11170910000005", 67, 65, 75);
        Mahasiswa.tambahMahasiswa("F", "11170910000006", 53, 95, 87);
    }
}
