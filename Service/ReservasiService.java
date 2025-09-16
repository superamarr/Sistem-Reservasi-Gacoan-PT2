/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

/**
 *
 * @author Aspire5
 */

import java.util.ArrayList;
import java.util.Scanner;
import Model.Reservasi;
import View.ReservasiView;

public class ReservasiService {
    private ArrayList<Reservasi> daftarReservasi;
    private Scanner input = new Scanner(System.in);

    public ReservasiService(ArrayList<Reservasi> daftarReservasi) {
        this.daftarReservasi = daftarReservasi;
    }

    private String inputString(String pesan) {
        String data;
        while (true) {
            System.out.print(pesan);
            data = input.nextLine().trim();
            if (data.isEmpty() || !data.matches("[a-zA-Z ]+")) {
                System.out.println("Input tidak boleh kosong dan hanya huruf!");
            } else break;
        }
        return data;
    }

    private String inputAngka(String pesan) {
        String data;
        while (true) {
            System.out.print(pesan);
            data = input.nextLine().trim();
            if (data.isEmpty() || !data.matches("\\d+")) {
                System.out.println("Input harus berupa angka!");
            } else break;
        }
        return data;
    }

    public void lihatReservasi() {
        ReservasiView.tampilkanReservasi(daftarReservasi);

        System.out.print("Cari reservasi berdasarkan nama (Enter untuk skip): ");
        String keyword = input.nextLine().trim();

        if (!keyword.isEmpty()) {
            ArrayList<Reservasi> hasil = new ArrayList<>();
            for (Reservasi r : daftarReservasi) {
                if (r.getNama().toLowerCase().contains(keyword.toLowerCase())) {
                    hasil.add(r);
                }
            }
            if (hasil.isEmpty()) {
                System.out.println("Tidak ada reservasi dengan nama: " + keyword);
            } else {
                ReservasiView.tampilkanReservasi(hasil);
            }
        }
    }

    public void tambahReservasi() {
        String nama = inputString("Nama Pemesan: ");
        System.out.print("Waktu Reservasi: ");
        String waktu = input.nextLine();
        String meja = inputAngka("Nomor Meja: ");

        System.out.print("Apakah ingin pre-Order? (y/n): ");
        String preOrder = input.nextLine();
        String menu = "-";
        int totalHarga = 0;

        if (preOrder.equalsIgnoreCase("y")) {
            ReservasiView.tampilkanMenu();
            System.out.print("Pilih menu (pisahkan dengan koma): ");
            String pilihan = input.nextLine();
            StringBuilder pesanan = new StringBuilder();
            for (String p : pilihan.split(",")) {
                switch (p.trim()) {
                    case "1": pesanan.append("Mie Gacoan Lv 1, "); totalHarga += 13000; break;
                    case "2": pesanan.append("Mie Gacoan Lv 2, "); totalHarga += 14000; break;
                    case "3": pesanan.append("Mie Gacoan Lv 3, "); totalHarga += 15000; break;
                    case "4": pesanan.append("Udang Rambutan, "); totalHarga += 10000; break;
                    case "5": pesanan.append("Udang Keju, "); totalHarga += 12000; break;
                    case "6": pesanan.append("Pangsit Goreng, "); totalHarga += 11000; break;
                    default: System.out.println("Pilihan " + p + " tidak valid.");
                }
            }
            if (pesanan.length() > 0) menu = pesanan.substring(0, pesanan.length() - 2);
        }

        daftarReservasi.add(new Reservasi(nama, waktu, meja, preOrder, menu, String.valueOf(totalHarga)));
        System.out.println("Reservasi berhasil ditambahkan!");
    }
    
    public void updateReservasi() {
        if (daftarReservasi.isEmpty()) {
            System.out.println("Belum ada reservasi untuk diubah.");
            return;
        }

        for (int i = 0; i < daftarReservasi.size(); i++) {
            Reservasi r = daftarReservasi.get(i);
            System.out.println((i + 1) + ". " + r.getNama() + " - " + r.getWaktu() + " - Meja " + r.getMeja());
        }

        int index = Integer.parseInt(inputAngka("Pilih nomor reservasi yang ingin diubah: "));
        if (index < 1 || index > daftarReservasi.size()) {
            System.out.println("Nomor tidak valid!");
            return;
        }

        Reservasi r = daftarReservasi.get(index - 1);

        System.out.print("Nama Pemesan baru (" + r.getNama() + "): ");
        String nama = input.nextLine();
        if (!nama.trim().isEmpty()) r.setNama(nama);

        System.out.print("Waktu baru (" + r.getWaktu() + "): ");
        String waktu = input.nextLine();
        if (!waktu.trim().isEmpty()) r.setWaktu(waktu);

        System.out.print("Meja baru (" + r.getMeja() + "): ");
        String meja = input.nextLine();
        if (!meja.trim().isEmpty() && meja.matches("\\d+")) r.setMeja(meja);

        System.out.print("PreOrder baru (y/n) [" + r.getPreOrder() + "]: ");
        String preOrder = input.nextLine();
        if (!preOrder.trim().isEmpty()) r.setPreOrder(preOrder);

        String menu = r.getNamaMenu();
        int totalHarga = Integer.parseInt(r.getHarga());

        if (r.getPreOrder().equalsIgnoreCase("y")) {
            ReservasiView.tampilkanMenu();
            System.out.print("Masukkan menu baru (pisahkan koma, Enter untuk lewati): ");
            String pilihan = input.nextLine();

            if (!pilihan.isEmpty()) {
                StringBuilder pesanan = new StringBuilder();
                totalHarga = 0;
                for (String p : pilihan.split(",")) {
                    switch (p.trim()) {
                        case "1": pesanan.append("Mie Gacoan Lv 1, "); totalHarga += 13000; break;
                        case "2": pesanan.append("Mie Gacoan Lv 2, "); totalHarga += 14000; break;
                        case "3": pesanan.append("Mie Gacoan Lv 3, "); totalHarga += 15000; break;
                        case "4": pesanan.append("Udang Rambutan, "); totalHarga += 10000; break;
                        case "5": pesanan.append("Udang Keju, "); totalHarga += 12000; break;
                        case "6": pesanan.append("Pangsit Goreng, "); totalHarga += 11000; break;
                        default: System.out.println("Pilihan " + p + " tidak valid.");
                    }
                }
                if (pesanan.length() > 0) menu = pesanan.substring(0, pesanan.length() - 2);
            }
        } else {
            menu = "-";
            totalHarga = 0;
        }

        r.setNamaMenu(menu);
        r.setHarga(String.valueOf(totalHarga));

        System.out.println("Reservasi berhasil diperbarui!");
    }


    public void hapusReservasi() {
        ReservasiView.tampilkanReservasi(daftarReservasi);
        if (daftarReservasi.isEmpty()) return;

        int index = Integer.parseInt(inputAngka("Pilih nomor reservasi yang ingin dihapus: "));
        if (index > 0 && index <= daftarReservasi.size()) {
            Reservasi r = daftarReservasi.remove(index - 1);
            System.out.println("Reservasi atas nama " + r.getNama() + " berhasil dihapus.");
        } else {
            System.out.println("Nomor tidak valid!");
        }
    }
    
    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

}


