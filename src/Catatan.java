/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Catatan {
    private int id;
    private String judul;
    private String isi;
    private String tanggal;

    // Constructor, getter, dan setter
public Catatan(int id, String judul, String isi, String tanggal) {
        this.id = id;
        this.judul = judul;
        this.isi = isi;
        this.tanggal = tanggal;
    }

    public int getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public String getIsi() {
        return isi;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    @Override
    public String toString() {
        return judul;
    }
}
