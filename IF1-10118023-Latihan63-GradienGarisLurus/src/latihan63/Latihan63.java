/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan63;

/**
 * @author Zaenal PC
 * NAMA              : Zaenal Anzarry
 * KELAS             : IF-01
 * NIM               : 10118023
 * Deskripsi Program : Gradien Garis Lurus
 */
public class Latihan63 {

    public static void main(String[] args) {
        Koordinat koordinat = new Koordinat(2, 10, 5, 7);
        System.out.println("Garis yang melalui titik " + "(" + koordinat.getX1() + "," +
                koordinat.getY1() + ")" + " dan " + "(" + koordinat.getX2() + "," + koordinat.getY2() + ")");
        System.out.println("memiliki gradien sebesar " +  koordinat.hitungGradien());
        
        Koordinat koordinat1 = new Koordinat(5, 1, 3, 12);
        System.out.println("Garis yang melalui titik " + "(" + koordinat1.getX1() + "," +
                koordinat1.getY1() + ")" + " dan " + "(" + koordinat1.getX2() + "," + koordinat1.getY2() + ")");
        System.out.println("memiliki gradien sebesar " +  koordinat1.hitungGradien());
    }
    
}
