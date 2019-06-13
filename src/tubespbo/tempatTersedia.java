package tubespbo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import pboparkir.Referance;
import pboparkir.Welkom1;
import tubespbo.*;

public class tempatTersedia {
    BufferedWriter tulis;
    ArrayList<Referance> tempat = new ArrayList();
    ArrayList<Integer> tersedia = new ArrayList();
    Welkom1 w = new Welkom1();

    public tempatTersedia(ArrayList tempat) {
        this.tempat = tempat;
        tersedia.add(20);
        tersedia.add(20);
        tersedia.add(20);
    }

    public void tersedia(ArrayList tempat, int i) {
        if (i == 1) {
            tersedia.set(0, (20-tempat.size()));
        } else if (i == 2) {
            tersedia.set(1, (20-tempat.size()));
        } else if (i == 3) {
            tersedia.set(2, (20-tempat.size()));
        }
        tulis();
    }

    public void tulis() {
        Object[] data = tersedia.toArray();

        File file = new File("src/dataPengunjung/ParkirTersisa.txt");
        try {
            tulis = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < data.length; i++) {
                tulis.write(data[i].toString()+"/");
            }
            tulis.close();
        } catch (Exception e) {
        }
    }

}
