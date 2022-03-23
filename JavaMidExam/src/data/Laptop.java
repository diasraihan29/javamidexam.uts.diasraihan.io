package data;

public class Laptop {
    private String Nama, Brand, Prosesor, Os, Storage;
    private int Stok, Core, Ram;

    public Laptop(String Nama, String Brand, String Prosesor, int Core,
            String Os, int Ram, String Storage, int Stok) {

        this.Nama = Nama; // Nama Laptop
        this.Brand = Brand; // Merk Laptop
        this.Prosesor = Prosesor; // Prosessor pada Laptop
        this.Core = Core; // Jumlah Core pada Laptop
        this.Os = Os; // OS laptop
        this.Ram = Ram; // Jumlah Ram(GB) Laptop
        this.Storage = Storage; // Jenis Storage Laptop
        this.Stok = Stok; // Stok Laptop
    }

    /* Overloading Constructor */
    public Laptop() {
        this.Nama = "unidentified"; // Nama Laptop
        this.Brand = "unidentified"; // Merk Laptop
        this.Prosesor = "unidentified"; // Prosessor pada Laptop
        this.Core = 0; // Jumlah Core pada Laptop
        this.Os = "unidentified"; // OS laptop
        this.Ram = 0; // Jumlah Ram(GB) Laptop
        this.Storage = "unidentified"; // Jenis Storage Laptop
        this.Stok = 0; // Stok Laptop Tersedia
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getProsesor() {
        return Prosesor;
    }

    public void setProsesor(String Prosesor) {
        this.Prosesor = Prosesor;
    }

    public String getOs() {
        return Os;
    }

    public void setOs(String Os) {
        this.Os = Os;
    }

    public String getStorage() {
        return Storage;
    }

    public void setStorage(String Storage) {
        this.Storage = Storage;
    }

    public int getStok() {
        return Stok;
    }

    public void setStok(int Stok) {
        this.Stok = Stok;
    }

    public int getCore() {
        return Core;
    }

    public void setCore(int Core) {
        this.Core = Core;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int Ram) {
        this.Ram = Ram;
    }

    public void getAllLaptopData() {
        System.out.println("Nama : " + Nama);
        System.out.println("Brand : " + Brand);
        System.out.println("Prosesor : " + Prosesor);
        System.out.println("Jumlah Core : " + Core);
        System.out.println("Operating System : " + Os);
        System.out.println("Ukuran RAM(GB) : " + Ram);
        System.out.println("Jenis Storage : " + Storage);
        System.out.println("Stok Tersedia : " + Stok);
    }
}