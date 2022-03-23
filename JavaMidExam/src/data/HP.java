package data;

public class HP extends Laptop {
    public HP(String Nama, String Prosesor, int Core,
            String Os, int Ram, String Storage, int Stok) {

        super(Nama, "HP", Prosesor, Core, Os, Ram, Storage, Stok);
    }

    public HP() {
        super();
        super.setBrand("HP");
    }

    public void hpSlogan() {
        System.out.println("");
        System.out.println("=======================");
        System.out.println("HP");
        System.out.println("Style Meets Performance");
        System.out.println("=======================");

    }

    @Override
    public void getAllLaptopData() {
        hpSlogan();
        super.getAllLaptopData();
        System.out.println("");
    }

    @Override
    public void setRam(int angka) {
        if (angka < 0) {
            System.out.println("");
            System.out.println("Ukuran RAM tidak dapat lebih kecil dari nol!");
            System.out.println("Ukuran RAM diatur ke default (4 GB)");
            System.out.println("");
            super.setRam(4);
        }
    }

    @Override
    public void setCore(int angka) {
        if (angka < 0) {
            System.out.println("");
            System.out.println("Jumlah Core tidak dapat lebih kecil dari nol!");
            System.out.println("Jumlah Core diatur ke default (Dual-Core)");
            System.out.println("");
            super.setCore(2);
        }
    }

    @Override
    public void setStok(int angka) {
        if (angka < 0) {
            System.out.println("");
            System.out.println("Jumlah Stok Laptop tidak dapat lebih kecil dari nol!");
            System.out.println("Jumlah Stok diatur ke default (0 pcs)");
            System.out.println("");
            super.setStok(0);
        }
    }

    // Posisi Pada Etalase Toko
    public String getStorePositionLaptop() {
        String storage = super.getStorage().toLowerCase().replaceAll("\\s+", "");
        switch (storage) {
            case "ssdm.2" -> {
                return "Best";
            }
            case "ssdsata" -> {
                return "Good";
            }
            case "hdd" -> {
                return "Middle";
            }
            default -> {
                return "unidentified";
            }
        }
    }
}