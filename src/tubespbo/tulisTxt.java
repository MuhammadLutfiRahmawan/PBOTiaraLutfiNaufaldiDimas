/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import pboparkir.Referance;

/**
 *
 * @author asus
 */
public class tulisTxt {
//    ArrayList<Object> e;
    String address;
    ArrayList<Referance> tempat = new ArrayList();
    int index=0;
    public tulisTxt (ArrayList tempat, String alamat){
        this.tempat=tempat;
        this.address=alamat;
    }
    public void parkingArea(){
        String nopol = JOptionPane.showInputDialog(null, "Masukkan nopol kendaraan Anda");
        String kode = JOptionPane.showInputDialog(null, "Masukkan kode unik Anda");
//        Referance [] tempat = new Referance[100];
        Referance data = new Referance(nopol, kode);
        tempat.add(data);
        index++;
        tulisTxt tulis = new tulisTxt(tempat, address);
        tulis.tulis(tempat, address);
    }
    public void tulis (ArrayList tempat, String address){
        this.tempat=tempat;
        this.address=address;
        Object [] data = tempat.toArray();
    }
}
