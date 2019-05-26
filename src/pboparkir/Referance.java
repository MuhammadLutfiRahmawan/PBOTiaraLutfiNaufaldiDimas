/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboparkir;

/**
 *
 * @author laptop
 */
public class Referance {
    String nopol, kode;
    public Referance(String nopol, String kode){
        this.kode=kode;
        this.nopol=nopol;
    }

    @Override
    public String toString() {
        return nopol +"/"+ kode ;
    }
}
