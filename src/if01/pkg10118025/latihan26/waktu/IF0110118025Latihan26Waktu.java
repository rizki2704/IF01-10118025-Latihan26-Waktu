/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan26.waktu;

import java.util.Date;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 */
public class IF0110118025Latihan26Waktu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int detik, menit, jam, hari, tanggal, bulan, tahun;
        
        String[] Bulan = {
            "Jan", "Feb", "Mar", "Apr", "Mei", "Jun", "Jul", "Agu", "Sep", "Okt", "Nov", "Des"
        };
        String[] Hari = {
            "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"
        };
        
        Date date = new Date();
        
        hari = date.getDay();
        tanggal = date.getDate();
        bulan = date.getMonth();
        tahun = date.getYear() + 1900;
        jam = date.getHours();
        menit = date.getMinutes();
        detik = date.getSeconds();
        
        System.out.println("Hari ini Adalah Hari : " + Hari[hari] + ", " + tanggal + " " + Bulan[bulan] +
                " " + tahun + " " + jam + ":" + menit + ":" + detik);
        
    }
    
}
