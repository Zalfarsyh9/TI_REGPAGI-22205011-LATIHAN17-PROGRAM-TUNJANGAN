/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.program.tunjangan.java;
import java.util.Scanner;
/**
 *
 * @author User
 Nama : Zalfa Rosiyah Riski 
 Nim : 22205011
 Prodi : Teknik Informatika 
 */
public class ProgramTunjanganJava {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Input gaji pokok//
        System.out.println("========Program Tunjangan========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        double gajiPokok = scanner.nextDouble();

        //Input status pernikahan
        System.out.print("Status Anda? (Menikah/Belum) :");
        String statusMenikah = scanner.next();

        //Input tunjangan
        double tunjangan = 0;
        if (statusMenikah.equalsIgnoreCase("Menikah")) {
            tunjangan = gajiPokok * 0.35;
        }

        //Tampilkan Tunjangan
        double totalGaji = gajiPokok + tunjangan;

        System.out.println("--------Hasil Perhitungan Gaji Anda------");
        System.out.println("Gaji Pokok : Rp. " + gajiPokok);
        System.out.println("Tunjangan : Rp. " + tunjangan);
        System.out.println("Total Gaji : Rp. " + totalGaji);
        
    }
}
