/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author Aspire5
 */

import java.util.ArrayList;
import Model.Reservasi;

public class ReservasiView {
    public static void tampilkanReservasi(ArrayList<Reservasi> daftar) {
        if (daftar.isEmpty()) {
            System.out.println("Belum ada reservasi.");
            return;
        }
        int no = 1;
        for (Reservasi r : daftar) {
            System.out.println("\n=======================");
            System.out.println("No.             : " + no++);
            System.out.println("Nama Pemesan    : " + r.getNama());
            System.out.println("Waktu Reservasi : " + r.getWaktu());
            System.out.println("Meja            : " + r.getMeja());
            System.out.println("PreOrder        : " + r.getPreOrder());
            System.out.println("Pesanan         : " + r.getNamaMenu());
            System.out.println("Harga           : " + r.getHarga());
            System.out.println("=======================");
        }
    }

    public static void tampilkanMenu() {
        System.out.println("=== Daftar Menu Gacoan ===");
        System.out.println("1. Mie Gacoan Lv 1 - 13000");
        System.out.println("2. Mie Gacoan Lv 2 - 14000");
        System.out.println("3. Mie Gacoan Lv 3 - 15000");
        System.out.println("4. Udang Rambutan - 10000");
        System.out.println("5. Udang Keju - 12000");
        System.out.println("6. Pangsit Goreng - 11000");
        System.out.println("==========================");
        
    }
    
    public static void menuUtama(){
        System.out.println("\n==== Sistem Reservasi Gacoan ====");
        System.out.println("1. Lihat Reservasi");
        System.out.println("2. Buat Reservasi");
        System.out.println("3. Update Reservasi");
        System.out.println("4. Hapus Reservasi");
        System.out.println("5. Keluar");
        System.out.print("Masukkan pilihan: ");
    }
}


