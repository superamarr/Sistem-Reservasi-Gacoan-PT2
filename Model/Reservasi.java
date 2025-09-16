/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Aspire5
 */

public class Reservasi {
    private String nama;
    private String waktu;
    private String meja;
    private String preOrder;
    private String namaMenu;
    private String harga;

    public Reservasi(String nama, String waktu, String meja, String preOrder, String namaMenu, String harga) {
        this.nama = nama;
        this.waktu = waktu;
        this.meja = meja;
        this.preOrder = preOrder;
        this.namaMenu = namaMenu;
        this.harga = harga;
    }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getWaktu() { return waktu; }
    public void setWaktu(String waktu) { this.waktu = waktu; }

    public String getMeja() { return meja; }
    public void setMeja(String meja) { this.meja = meja; }

    public String getPreOrder() { return preOrder; }
    public void setPreOrder(String preOrder) { this.preOrder = preOrder; }

    public String getNamaMenu() { return namaMenu; }
    public void setNamaMenu(String namaMenu) { this.namaMenu = namaMenu; }

    public String getHarga() { return harga; }
    public void setHarga(String harga) { this.harga = harga; }
}


