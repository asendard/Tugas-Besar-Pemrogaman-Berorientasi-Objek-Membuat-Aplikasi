package policeforcemanager;
/**
 *
 * @author Aditya
 */

import java.util.ArrayList;
import java.util.List;

// Kelas CrimpsonTrack juga menggunakan konsep Encapsulation dengan mendeklarasikan variabel daftarNarapidana sebagai private
class CrimpsonTrack {
    // Atribut daftarNarapidana di-declare sebagai private untuk menerapkan encapsulation
    private List<Narapidana> daftarNarapidana = new ArrayList<>();
    // Atribut admin juga di-declare sebagai private untuk encapsulation
    private Admin admin;

    // Konstruktor untuk inisialisasi objek CrimpsonTrack dengan admin
    public CrimpsonTrack(String adminUsername, String adminPassword) {
        this.admin = new Admin(adminUsername, adminPassword);
    }

    // Metode untuk login admin, mengimplementasikan encapsulation
    public boolean loginAdmin(String username, String password) {
        return admin.login(username, password);
    }

    public void tambahNarapidana(Narapidana narapidana) {
    // Pemeriksaan apakah nama dan nik tidak boleh kosong
    if (narapidana.getNama().isEmpty() || narapidana.getNik().isEmpty()) {
        System.out.println("Nama dan NIK tidak boleh kosong. Gagal menambahkan Narapidana Maupun POlisi.");
        System.out.println();
        return;
    }

    daftarNarapidana.add(narapidana);
    System.out.println("         NARAPIDANA BERHASIL DITAMBAHKAN     ");

    System.out.println();
}

 
  // Metode untuk menampilkan daftar narapidana dengan polymorphism
  public void tampilkanDaftarNarapidana() {
    System.out.println("====================================================");
    System.out.println("       Daftar Narapidana dan Penanggungjawab       ");
    System.out.println("====================================================");

    for (Narapidana narapidana : daftarNarapidana) {
        System.out.println("┌──────────────────────────────────────┐");
        // Polymorphism: Menampilkan informasi sesuai dengan tipe narapidana atau police officer
        if (narapidana instanceof PoliceOfficer) {
            PoliceOfficer policeOfficer = (PoliceOfficer) narapidana;
            System.out.println("│ >> Data Polisi yang Menangani <<");
            System.out.println("│ >>       kasus di Atas        <<");
            System.out.println("│ Nama Polisi: " + policeOfficer.getNamaPolisi());
            System.out.println("│ NIK/ID/NRP Polisi: " + policeOfficer.getNikPolisi());
            System.out.println("│ Pangkat Polisi: " + policeOfficer.getPangkat());
        } else {
            System.out.println("│ >> Data Pribadi Narapidana <<");
            System.out.println("│ ");
            System.out.println("│ Nama: " + narapidana.getNama());
            System.out.println("│ NIK/ID: " + narapidana.getNik());
            System.out.println("│ Jenis Kelamin: " + narapidana.getJenisKelamin());
            System.out.println("│ Jenis Kasus: " + narapidana.getJenisKasus());
            System.out.println("│ Tanggal Kejahatan: " + narapidana.getTanggalKejahatan());
            System.out.println("│ Lama Hukuman: " + narapidana.getLamaHukuman() + " Bulan");
        }

            System.out.println("└──────────────────────────────────────┘");
            System.out.println();  // Baris pemisah
        }

        System.out.println("====================================");
    }



    public void editInformasiNarapidana(String nik, Narapidana newInfo) {
        for (Narapidana narapidana : daftarNarapidana) {
            if (narapidana.getNik().equals(nik)) {
                narapidana.setNama(newInfo.getNama());
                narapidana.setNik(newInfo.getNik());
                narapidana.setJenisKasus(newInfo.getJenisKasus());
                narapidana.setTanggalKejahatan(newInfo.getTanggalKejahatan());
                narapidana.setLamaHukuman(newInfo.getLamaHukuman());

                System.out.println("          INFORMASI NARAPIDANA BERHASIL DIUBAH");
                return;
                
            }
        }

        System.out.println("Narapidana Tidak ditemukan");
        
        System.out.println(); //spasi
    }
}