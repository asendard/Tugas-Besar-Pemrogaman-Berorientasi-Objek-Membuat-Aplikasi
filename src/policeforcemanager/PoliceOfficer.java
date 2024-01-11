package policeforcemanager;


// class policeOfficer sebagai turunan dari Narapidana
// merupakan subclass dari Narapidana. Ini mencerminkan konsep inheritance
class PoliceOfficer extends Narapidana {
    private String pangkat;

    public PoliceOfficer(String nama, String nik, String pangkat) {
        super(nama, nik, "", "Police Officer", 0, ""); // Jenis kasus dan lama hukuman diset sebagai default
        this.pangkat = pangkat;
    }

    public String getPangkat() {
        return pangkat;
    }

    // Menambahkan metode untuk mendapatkan Nama dan NIK/ID
    public String getNamaPolisi() {
        return super.getNama();
    }

    public String getNikPolisi() {
        return super.getNik();
    }

}
