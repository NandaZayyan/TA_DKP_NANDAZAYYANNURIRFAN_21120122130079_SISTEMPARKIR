/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasakhirdkp;

import java.text.SimpleDateFormat;
import javax.swing.JTextArea;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TugasAkhirDKP {
    public static String WaktuKeluar(int WaktuKeluar) {
        Date date = new Date();
        LocalDate Tanggal = LocalDate.now();
        DayOfWeek hari = Tanggal.getDayOfWeek();
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        String jam = timeFormat.format(date);
        
        DayOfWeek hariSelanjutnya = hari.plus(WaktuKeluar);
        LocalDate tanggalSelanjutnya = Tanggal.plusDays(WaktuKeluar);
        String pesan = "Hari masuk : " + hariSelanjutnya + "\nJam              : " + jam + "\nTanggal     : " + tanggalSelanjutnya;
       
        return pesan;
        }
    public static String Time() {
        // Mengambil tanggal, hari, dan waktu saat ini
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String tanggal = dateFormat.format(date);

        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
        String hari = dayFormat.format(date);

        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        String jam = timeFormat.format(date);

        String pesan = "Hari masuk : " + hari + "\nJam              : " + jam + "\nTanggal       : " + tanggal;
        System.out.println(pesan);
        
        return pesan;
    }
    public static String Waktukeluar(int WaktuKeluar) {
        Date date = new Date();
        LocalDate Tanggal = LocalDate.now();
        DayOfWeek hari = Tanggal.getDayOfWeek();
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        String jam = timeFormat.format(date);
        
        DayOfWeek hariSelanjutnya = hari.plus(WaktuKeluar);
        LocalDate tanggalSelanjutnya = Tanggal.plusDays(WaktuKeluar);
        String pesan = "Hari masuk : " + hariSelanjutnya + "\nJam              : " + jam + "\nTanggal     : " + tanggalSelanjutnya;
       
        return pesan;
        }
    
    public static String coba(int waktukeluar) {
        // Mendapatkan tanggal sekarang
        Date date = new Date();

        // Menambahkan 5 hari ke tanggal sekarang
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, waktukeluar);
        Date futureDate = calendar.getTime();

        // Format tanggal menggunakan SimpleDateFormat
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String tanggal = dateFormat.format(futureDate);

        // Format hari menggunakan SimpleDateFormat
        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
        String hari = dayFormat.format(futureDate);

        // Menampilkan hasil
        String pesan = "Hari setelah 5 hari : " + hari + "\nTanggal setelah 5 hari : " + tanggal;
        System.out.println(pesan);
        return pesan;
    }
    
    public static void main(String[] args) {
        System.out.println(Time());
        Waktukeluar(1);
        System.out.println(WaktuKeluar(1));
        coba(1);
    }   
}