/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Aspire5
 */

import java.util.ArrayList;
import Model.DataDummy;
import Model.Reservasi;
import Service.ReservasiService;
import Controller.ReservasiController;

public class MainMenu {
    public static void main(String[] args) {
        ArrayList<Reservasi> data = DataDummy.getDummyData();
        ReservasiService service = new ReservasiService(data);
        ReservasiController controller = new ReservasiController(service);
        controller.menuUtama();
    }
}

