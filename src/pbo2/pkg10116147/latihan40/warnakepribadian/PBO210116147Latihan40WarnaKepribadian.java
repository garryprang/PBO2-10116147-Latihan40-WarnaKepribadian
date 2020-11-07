/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116147.latihan40.warnakepribadian;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA      : Garry Prang
 * KELAS     : PBO-2
 * NIM       : 10116147
 * Deskripsi : Program untuk menampilkan hasil kepribadian dari warna yang dipilih.
 *
 */
public class PBO210116147Latihan40WarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Warna wrn       = new Warna();
        Scanner scanner = new Scanner(System.in);
        
        String warna, nama;
        String normal   = "\u001b[0m";
        String merah    = "\u001b[31m";
        String bmerah   = "\u001b[41m";
        String hijau    = "\u001b[32m";
        String bhijau   = "\u001b[42m";
        String kuning   = "\u001b[33m";
        String bkuning  = "\u001b[43m";
        String birumuda = "\u001b[36m";
        String ungu     = "\u001b[35m";
        String bungu    = "\u001b[45m";
        String biru     = "\u001b[34m";
        String bbiru    = "\u001b[44m";
        String putih    = "\u001b[37m";

        System.out.println(merah + "YUK " + hijau + "CEK " + kuning + "KEPRIBADIAN " + birumuda + "DARI " + ungu + "WARNA " + biru + "FAVORITMU" + normal);
        System.out.print("\n");
        System.out.println(bmerah + putih + "         MERAH        " + normal);
        System.out.println(bhijau + putih + "         HIJAU        " + normal);
        System.out.println(bkuning + putih + "         KUNING       " + normal);
        System.out.println(bbiru + putih + "         BIRU         " + normal);
        System.out.println(bungu + putih + "         UNGU         " + normal);
        System.out.print("\n");
        System.out.print("PILIH WARNA FAVORITMU: ");
        warna = scanner.next();
        warna = warna.toUpperCase();
        
        System.out.print("NAMA KAMU: ");
        nama = scanner.next();
        nama = nama.toUpperCase();
        
        System.out.println();
        
        wrn.hasilTestKepribadian(warna, nama);
    }
    
}
