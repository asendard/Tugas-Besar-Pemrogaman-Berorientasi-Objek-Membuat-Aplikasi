package policeforcemanager;

import java.util.Scanner;


// Kelas Narapidana merupakan contoh implementasi konsep Inheritance sebagai parent class
class Narapidana implements KejadianHukum {
    protected String nama;
    protected String nik;
    protected String jenisKelamin;
    protected String jenisKasus;
    protected int lamaHukuman;
    protected String tanggalKejahatan;

    public Narapidana(String nama, String nik, String jenisKelamin, String jenisKasus, int lamaHukuman, String tanggalKejahatan) {
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.jenisKasus = jenisKasus;
        this.lamaHukuman = lamaHukuman;
        this.tanggalKejahatan = tanggalKejahatan;
        
        if (jenisKelamin.equalsIgnoreCase("L")) {
            this.jenisKelamin = "Laki-laki";
        } else if (jenisKelamin.equalsIgnoreCase("P")) {
            this.jenisKelamin = "Perempuan";
        } else {
            this.jenisKelamin = jenisKelamin;
        }
    }

    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getJenisKasus() {
        return jenisKasus;
    }

    public int getLamaHukuman() {
        return lamaHukuman;
    }

    public String getTanggalKejahatan() {
        return tanggalKejahatan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setJenisKasus(String jenisKasus) {
        this.jenisKasus = jenisKasus;
    }

    public void setLamaHukuman(int lamaHukuman) {
        this.lamaHukuman = lamaHukuman;
    }

    public void setTanggalKejahatan(String tanggalKejahatan) {
        this.tanggalKejahatan = tanggalKejahatan;
    }
    
}

 