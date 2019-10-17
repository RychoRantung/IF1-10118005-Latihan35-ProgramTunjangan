/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan35.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author USER
 * NAMA : Rycho Rantung
 * KELAS : IF1
 * NIM : 10118005
 * Deskripsi Program : Berisi program yang menampilkan tunjangan gaji karyawan
 */
public class Gaji {
    Scanner sc = new Scanner(System.in);
	private double pokok, tunjangan, total;
	private String status;
	
	public void inputAwal(){
		System.out.print("Berapa gaji pokok anda perbulan? : Rp.");
		pokok = sc.nextDouble();
		System.out.print("Status anda? (Menikah/Belum) : ");
		status = sc.next();
	}
	
	public void outputAkhir(){
		hitungTotal();
		System.out.println("=====Hasil Perhitungan Gaji Anda=====");
		System.out.println("Gaji Pokok : Rp."+pokok);
		System.out.println("Tunjangan  : Rp."+tunjangan);
		System.out.println("Total Gaji : Rp."+total);
	}
	
	private void hitungTunjangan(){
		tunjangan = (status.equalsIgnoreCase("Menikah") ? 0.35*pokok : 0);
	}
	
	private void hitungTotal(){
		hitungTunjangan();
		total = tunjangan+pokok;
	}
}
