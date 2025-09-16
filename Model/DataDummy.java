/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Aspire5
 */

import java.util.ArrayList;

public class DataDummy {
    public static ArrayList<Reservasi> getDummyData() {
        ArrayList<Reservasi> data = new ArrayList<>();
        data.add(new Reservasi("Taufik", "12:30", "Meja 1", "Ya", "Mie Gacoan Lv 3", 15000));
        data.add(new Reservasi("Sadikin", "15:30", "Meja 5", "Ya", "Mie Gacoan Lv 3, Udang Keju", 27000));
        return data;
    }
}

