/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116147.latihan40.warnakepribadian;

/**
 *
 * @author
 * NAMA      : Garry Prang
 * KELAS     : PBO-2
 * NIM       : 10116147
 * Deskripsi : Program untuk menampilkan hasil kepribadian dari warna yang dipilih.
 *
 */
public class Warna 
{
    public static void hasilTestKepribadian(String warna, String nama)
    {
        String normal   = "\u001b[0m";
        String merah    = "\u001b[31m";
        String hijau    = "\u001b[32m";
        String kuning   = "\u001b[33m";
        String biru     = "\u001b[34m";
        String ungu     = "\u001b[35m";
        
        if(warna.equals("MERAH")) 
        {
            System.out.println("======= HASIL TES KEPRIBADIAN " + nama + " =======");
            System.out.println("Warna favoritmu adalah warna " + merah + warna + normal);
            System.out.println("1. Periang");
            System.out.println("2. Pemberani");
            System.out.println("3. Berani mengambil risiko dalam setiap langkah");
            System.out.println("4. Menyukai tantangan");
            System.out.println("5. Kurang sabar");
            System.out.println("6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol");
            System.out.println("7. Memiliki energi kehangatan dan cinta");
        } 
        else if(warna.equals("HIJAU")) 
        {
            System.out.println("======= HASIL TES KEPRIBADIAN " + nama + " =======");
            System.out.println("Warna favoritmu adalah warna " + hijau + warna + normal);
            System.out.println("1. Romantis");
            System.out.println("2. Menyukai hal yang berbau alami dan keindahan");
            System.out.println("3. Teguh dan prinsip");
            System.out.println("4. Menginginkan kesempurnaan");
            System.out.println("5. Mudah cemburu");
            System.out.println("6. Mudah merasa iri");
            System.out.println("7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan");
        } 
        else if(warna.equals("KUNING")) 
        {
            System.out.println("======= HASIL TES KEPRIBADIAN " + nama + " =======");
            System.out.println("Warna favoritmu adalah warna " + kuning + warna + normal);
            System.out.println("1. Optimis");
            System.out.println("2. Suka bergaul");
            System.out.println("3. Periang");
            System.out.println("4. Senang menolong");
            System.out.println("5. Lincah dan aktif");
            System.out.println("6. Tidak suka meremehkan orang lain");
            System.out.println("7. Loyal");
            System.out.println("8. Hangat");
            System.out.println("9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil");
            System.out.println("10. Cenderung penakut");
        } 
        else if(warna.equals("BIRU")) 
        {
            System.out.println("======= HASIL TES KEPRIBADIAN " + nama + " =======");
            System.out.println("Warna favoritmu adalah warna " + biru + warna + normal);
            System.out.println("1. Menyenangkan");
            System.out.println("2. Bijaksana");
            System.out.println("3. Pembawaan diri tenang saat menghadapi masalah");
            System.out.println("4. Dinamis");
            System.out.println("5. Senang berbagi");
            System.out.println("6. Bersahabat");
            System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang");
            System.out.println("8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai");
        } 
        else if(warna.equals("UNGU")) 
        {
            System.out.println("======= HASIL TES KEPRIBADIAN " + nama + " =======");
            System.out.println("Warna favoritmu adalah warna " + ungu + warna + normal);
            System.out.println("1. Optimis");
            System.out.println("2. Tidak pernah ragu");
            System.out.println("3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat");
            System.out.println("4. Memiliki ambisi yang besar");
            System.out.println("5. Memiliki empati yang besar");
            System.out.println("6. Memiliki sisi misterius sebab seringkali menutupi perasaannya");
            System.out.println("7. Terkadang bersikap keras kepala dan angkuh");
        } 
        else 
        {
            System.out.println("======= HASIL TEST KEPRIBADIAN " + nama + " =======");
            System.out.println("Oops... Belum Teridentifikasi!");
        }
    }
}
