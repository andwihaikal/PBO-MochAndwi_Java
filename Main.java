
// Kelas Mobil
class Mobil {
    String namaMobil;

    // Constructor untuk kelas Mobil
    public Mobil(String nama) {
        namaMobil = nama; // Tidak menggunakan `this`
    }

    // Metode untuk menampilkan informasi kendaraan
    public void infoKendaraan() {
        System.out.println("Ini adalah mobil: " + namaMobil);
    }

    // Metode untuk menyalakan mesin mobil
    public void nyalakanMesin() {
        System.out.println("Mesin mobil " + namaMobil + " sedang dinyalakan.");
    }
}

// Kelas SepedaMotor
class SepedaMotor {
    String namaMotor;

    // Constructor untuk kelas SepedaMotor
    public SepedaMotor(String nama) {
        namaMotor = nama; // Tidak menggunakan `this`
    }

    // Metode untuk menampilkan informasi kendaraan
    public void infoKendaraan() {
        System.out.println("Ini adalah sepeda motor: " + namaMotor);
    }

    // Metode untuk menyalakan mesin sepeda motor
    public void nyalakanMesin() {
        System.out.println("Mesin sepeda motor " + namaMotor + " sedang dinyalakan.");
    }
}

// Kelas Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek Mobil
        Mobil mobilSaya = new Mobil("Toyota");
        mobilSaya.infoKendaraan(); // Menampilkan informasi kendaraan
        mobilSaya.nyalakanMesin(); // Menyalakan mesin mobil

        System.out.println(); // Menambah garis kosong untuk pemisah

        // Membuat objek SepedaMotor
        SepedaMotor motorSaya = new SepedaMotor("Honda");
        motorSaya.infoKendaraan(); // Menampilkan informasi kendaraan
        motorSaya.nyalakanMesin(); // Menyalakan mesin sepeda motor
    }
}
