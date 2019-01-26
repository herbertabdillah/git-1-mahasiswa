/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Mahasiswa {
    public static ArrayList<Mahasiswa> arrayMahasiswa = new ArrayList<>();
    private String nama;
    private String nim;
    private double uts;
    private double uas;
    private double formatif;
    
    public Mahasiswa(){
        
    }
    
    public Mahasiswa(String nama, String nim){
        setNamaNim(nama, nim);
        setSemuaNilai(0, 0, 0);
    }
    public Mahasiswa(String nama, String nim, double formatif, double uts, double uas) {
        setNamaNim(nama, nim);
        setSemuaNilai(formatif, uts, uas);
    }
    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the nim
     */
    public String getNim() {
        return nim;
    }

    /**
     * @param nim the nim to set
     */
    public void setNim(String nim) {
        this.nim = nim;
    }

    /**
     * @return the uts
     */
    public double getUts() {
        return uts;
    }

    /**
     * @param uts the uts to set
     */
    public void setUts(double uts) {
        this.uts = uts;
    }

    /**
     * @return the uas
     */
    public double getUas() {
        return uas;
    }

    /**
     * @param uas the uas to set
     */
    public void setUas(double uas) {
        this.uas = uas;
    }

    /**
     * @return the formatif
     */
    public double getFormatif() {
        return formatif;
    }

    /**
     * @param formatif the formatif to set
     */
    public void setFormatif(double formatif) {
        this.formatif = formatif;
    }
    public void setSemuaNilai(double formatif, double uts, double uas){
        setFormatif(formatif);
        setUts(uts);
        setUas(uas);
    }
    public void setNamaNim(String nama, String nim) {
        setNama(nama);
        setNim(nim);
    }
    public double getTotal(){
        double total = (0.3 * getFormatif()) + (0.3 * getUts()) + (0.4 * getUas());
        return total;
    }
    public static void tambahMahasiswa(){
        Mahasiswa mahasiswa = new Mahasiswa();
        arrayMahasiswa.add(mahasiswa);
    }
    public static void tambahMahasiswa(String nama, String nim){
        Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
        arrayMahasiswa.add(mahasiswa);
    }
    public static void tambahMahasiswa(String nama, String nim, double formatif, double uts, double uas){
        Mahasiswa mahasiswa = new Mahasiswa(nama, nim, formatif, uts, uas);
        arrayMahasiswa.add(mahasiswa);
    }
}
