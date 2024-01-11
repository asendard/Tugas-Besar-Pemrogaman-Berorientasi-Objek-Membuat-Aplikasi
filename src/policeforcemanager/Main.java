package policeforcemanager;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CrimpsonTrack crimpsonTrack = new CrimpsonTrack("admin", "password");
        
        
        System.out.println("===================================");
        System.out.println("           CrimpsonTrack            ");
        System.out.println("    Sistem Informasi Kepolisian    ");
        System.out.println("===================================\n");
        
        
        System.out.println("Silahkan Login !");
         
        // Login
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        System.out.println();
       
        if (crimpsonTrack.loginAdmin(username, password)) {
            int pilihan;

            do {
                
                System.out.println("======== Selamat Datang Admin ======");
                System.out.println("          Menu Administrasi         ");
                
                 
                System.out.println("1. Tambah Narapidana");
                System.out.println("2. Tampilkan Daftar Narapidana");
                System.out.println("3. Edit Informasi Narapidana");
                System.out.println("4. Keluar");
                System.out.print("Pilih menu: ");
                pilihan = scanner.nextInt();
                scanner.nextLine(); // Membersihkan newline dari buffer

                System.out.println(); //untuk spasi biar rapi
                
                switch (pilihan) {
                    case 1:

                        tambahNarapidana(crimpsonTrack, scanner);
                        break;
                    case 2:
                        crimpsonTrack.tampilkanDaftarNarapidana();
                        break;
                    case 3:
                        editInformasiNarapidana(crimpsonTrack, scanner);
                        break;
                    case 4:
                        System.out.println("====Terimakasih dan Sampai Jumpa===");
                        System.out.println("          Salam Presisi        ");
                        break;
                }
            } while (pilihan != 4);
        } else {
            System.out.println("Login Gagal. Coba lagi.");
        }
    }

    private static void tambahNarapidana(CrimpsonTrack crimpsonTrack, Scanner scanner) {
    System.out.println("          Silahkan isi Biodata Narapidana                ");
    System.out.print("Nama: ");
    
    
    String nama = scanner.nextLine();
    System.out.print("NIK/ID: ");
    String nik = scanner.nextLine();
    System.out.print("Jenis Kelamin (L/P): ");
    String jenisKelamin = scanner.nextLine();

    // Display choices for jenisKasus
    System.out.println("Pilihan Kasus:");
    System.out.println("1. Pelecehan Seksual");
    System.out.println("2. UU IT");
    System.out.println("3. Pembunuhan");
    System.out.println("4. Pemerkosaan");
    System.out.println("5. Pencurian Mobil");
    System.out.println("6. Penganiayaan");
    System.out.println("7. Narkotika");
    System.out.println("8. Pengeroyokan");
    System.out.println("9. Pencurian Motor");
    System.out.println("10. Korupsi");
    System.out.println("11. Penggelapan");
    System.out.println("12. Mengisi Sendiri");

    // Get user input for pilihanKasus
    System.out.print("Pilihan Kasus (1-12): ");
    int pilihanKasus = scanner.nextInt();
    scanner.nextLine(); // Clear the newline from the buffer

    String jenisKasus;
    switch (pilihanKasus) {
        case 1:
            jenisKasus = "Pelecehan Seksual";
            break;
        case 2:
            jenisKasus = "UU IT";
            break;
        case 3:
            jenisKasus = "Pembunuhan";
            break;
        case 4:
            jenisKasus = "Pemerkosaan";
            break;
        case 5:
            jenisKasus = "Pencurian Mobil";
            break;
        case 6:
            jenisKasus = "Penganiayaan";
            break;
        case 7:
            jenisKasus = "Narkotika";
            break;
        case 8:
            jenisKasus = "Pengeroyokan";
            break;
        case 9:
            jenisKasus = "Pencurian Motor";
            break;
        case 10:
            jenisKasus = "Korupsi";
            break;
        case 11:
            jenisKasus = "Penggelapan";
            break;
        case 12:
            System.out.print("Jenis Kasus: ");
            jenisKasus = scanner.nextLine();
            break;
        default:
            System.out.println("Pilihan tidak valid. Mengisi Sendiri dipilih.");
            jenisKasus = "Mengisi Sendiri";
            break;
    }

    System.out.print("Lama Hukuman (Bulan): ");
    int lamaHukuman = scanner.nextInt();
    scanner.nextLine(); // Clear the newline from the buffer
    System.out.print("Tanggal Kejahatan (DD): ");
    String tanggalKejahatanDD = scanner.nextLine();

    System.out.print("Bulan (1-12)(MM): ");
    String tanggalKejahatanMM = scanner.nextLine();

    if (!tanggalKejahatanMM.matches("[1-9]|1[0-2]")) {
        System.out.println("Input Bulan tidak valid. Harap masukkan angka antara 1 dan 12.");
        System.out.print("Bulan (1-12)(MM): ");
        tanggalKejahatanMM = scanner.nextLine();
    }

    System.out.print("Tahun (YYYY): ");
    String tanggalKejahatanYYYY = scanner.nextLine();

    String tanggalKejahatan = tanggalKejahatanDD + "/" + tanggalKejahatanMM + "/" + tanggalKejahatanYYYY;

    Narapidana narapidana = new Narapidana(nama, nik, jenisKelamin, jenisKasus, lamaHukuman, tanggalKejahatan);
    crimpsonTrack.tambahNarapidana(narapidana);
    System.out.println();
    
    
    // Input data polisi setelah narapidana
        System.out.println("\nMasukkan Data Polisi Yang Bertanggungjawab");
        System.out.print("Nama: ");
        String polisiNama = scanner.nextLine();
        System.out.print("NIK/ID: ");
        String polisiNik = scanner.nextLine();
        System.out.print("Pangkat: ");
        String pangkat = scanner.nextLine();

        // Contoh penggunaan PoliceOfficer
        PoliceOfficer policeOfficer = new PoliceOfficer(polisiNama, polisiNik, pangkat);
        crimpsonTrack.tambahNarapidana(policeOfficer);

        System.out.println();
    }




private static void editInformasiNarapidana(CrimpsonTrack crimpsonTrack, Scanner scanner) {
    System.out.print("Masukkan NIK/ID Narapidana yang akan diubah: ");
    String nik = scanner.nextLine();

    System.out.print("Nama: ");
    String nama = scanner.nextLine();
    System.out.print("NIK/ID: ");
    String newNik = scanner.nextLine();
    System.out.print("Jenis Kasus: ");
    String jenisKasus = "";

    System.out.println("(Silahkan pilih jika ingin merubahnya)");
    System.out.println("1. Pelecehan Seksual");
    System.out.println("2. UU IT");
    System.out.println("3. Pembunuhan");
    System.out.println("4. Pemerkosaan");
    System.out.println("5. Pencurian Mobil");
    System.out.println("6. Penganiayaan");
    System.out.println("7. Narkotika");
    System.out.println("8. Pengeroyokan");
    System.out.println("9. Pencurian Motor");
    System.out.println("10. Korupsi");
    System.out.println("11. Penggelapan");
    System.out.println("12. Mengisi Sendiri");
    
   
    System.out.println("Masukan pilihann angka(1-12) jika ingin merubah jenis kasus :");
    int pilihanKasus = scanner.nextInt();
    scanner.nextLine();
  

    if (pilihanKasus == 12) {
        System.out.print("Jenis Kasus (Mengisi Sendiri): ");
        jenisKasus = scanner.nextLine();
    } else if (pilihanKasus >= 1 && pilihanKasus <= 11) {
        // Pilihan valid, sesuaikan jenis kasus berdasarkan pilihan
        switch (pilihanKasus) {
            case 1:
                jenisKasus = "Pelecehan Seksual";
                break;
            case 2:
                jenisKasus = "UU IT";
                break;
            case 3:
                jenisKasus = "Pembunuhan";
                break;
            case 4:
                jenisKasus = "Pemerkosaan";
                break;
            case 5:
                jenisKasus = "Pencurian";
                break;
            case 6:
                jenisKasus = "Penganiayaan";
                break;
            case 7:
                jenisKasus = "Narkotika";
                break;
            case 8:
                jenisKasus = "Pengeroyokan";
                break;
            case 9:
                jenisKasus = "Pencurian Motor";
                break;
            case 10:
                jenisKasus = "Korupsi";
                break;
            case 11:
                jenisKasus = "Penggelapan";
                break;
        }
    } else {
        System.out.println("Pilihan tidak valid. Mengisi Sendiri dipilih.");
        jenisKasus = "Mengisi Sendiri";
    }

    System.out.print("Tanggal Kejahatan (DD): ");
    String tanggalKejahatanDD = scanner.nextLine();
    System.out.print("Bulan (1-12)(MM): ");
    String tanggalKejahatanMM = scanner.nextLine();
    System.out.print("Tahun (YYYY): ");
    String tanggalKejahatanYYYY = scanner.nextLine();
    System.out.print("Lama Hukuman (Bulan): ");
    int lamaHukuman = scanner.nextInt();
    scanner.nextLine(); // Membersihkan newline dari buffer

    String tanggalKejahatan = tanggalKejahatanDD + "/" + tanggalKejahatanMM + "/" + tanggalKejahatanYYYY;

    Narapidana newInfo = new Narapidana(nama, newNik, "", jenisKasus, lamaHukuman, tanggalKejahatan);

    crimpsonTrack.editInformasiNarapidana(nik, newInfo);
    }
}