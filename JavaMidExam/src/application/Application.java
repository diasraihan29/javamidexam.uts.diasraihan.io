package application;

import data.*;
import java.util.Scanner;

/**
 *
 * @author Dias_Raihan
 */
public class Application {
    public static void main(String[] args) {
        String Nama, Prosesor, Os, Storage;
        int Stok, Core, Ram;

        Scanner masukan = new Scanner(System.in);

        HP pavilion15 = new HP();
        Acer inspire3 = new Acer();

        /* test HP Pavilion 15 */
        pavilion15.hpSlogan();
        System.out.print("Nama : ");
        Nama = masukan.nextLine();
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
        masukan.nextLine();
        System.out.println("");
        pavilion15.setNama(Nama);
        pavilion15.setProsesor(Prosesor);
        pavilion15.setCore(Core);
        pavilion15.setOs(Os);
        pavilion15.setRam(Ram);
        pavilion15.setStorage(Storage);
        pavilion15.setStok(Stok);
        pavilion15.getAllLaptopData();
        System.out.println("Store Position " + pavilion15.getNama() +
                " adalah " + pavilion15.getStorePositionLaptop());
        System.out.println("==========================================");

        // ============================================================== //

        

        inspire3.acerSlogan();
        System.out.print("Nama : ");
        Nama = masukan.nextLine();
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
        masukan.nextLine();
        System.out.println("");
        inspire3.setNama(Nama);
        inspire3.setProsesor(Prosesor);
        inspire3.setCore(Core);
        inspire3.setOs(Os);
        inspire3.setRam(Ram);
        inspire3.setStorage(Storage);
        inspire3.setStok(Stok);
        inspire3.getAllLaptopData();
        System.out.println("Store Position " + inspire3.getNama() +
                " adalah " + inspire3.getStorePositionLaptop());
        System.out.println("==========================================");
    }
}