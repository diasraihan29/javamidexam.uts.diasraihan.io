package data;

import java.util.Scanner;

public class LaptopApp {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        String Nama, Brand, Prosesor, Os, Storage;
        int Stok, Core, Ram;

        System.out.print("Nama : ");
        Nama = masukan.nextLine();
        System.out.print("Brand : ");
        Brand = masukan.nextLine();
        System.out.print("Prosesor : ");
        Prosesor = masukan.nextLine();
        System.out.print("Jumlah Core : ");
        Core = masukan.nextInt();
        masukan.nextLine();
        System.out.print("Operating System : ");
        Os = masukan.nextLine();
        System.out.print("Ukuran RAM(GB): ");
        Ram = masukan.nextInt();
        masukan.nextLine();
        System.out.print("Jenis Storage : ");
        Storage = masukan.nextLine();
        System.out.print("Stok : ");
        Stok = masukan.nextInt();
        masukan.close();

        System.out.println("=====================================");

        Laptop spesifikasi = new Laptop(Nama, Brand, Prosesor, Core, Os, Ram, Storage, Stok);
        spesifikasi.getAllLaptopData();
    }
}