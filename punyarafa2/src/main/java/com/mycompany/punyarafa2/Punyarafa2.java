package com.mycompany.punyarafa2;
import java.util.Scanner;
public class Punyarafa2 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        
//1.   Angka Ganjil
//        System.out.println("Masukkann Angka:");
//        int angka = input.nextInt();
//        
//        if (angka % 2 != 0){
//            System.out.println("Benar, ini adalah angka ganjil");
//        }else{
//            System.out.println("Salah, ini adalah angka genap");
//        }

//2.   Diskon Barang
//         System.out.print("Masukkan jumlah barang: ");
//         int jumlah = input.nextInt();
//         
//         System.out.print("Masukkan harga satuan barang: ");
//         double harga = input.nextDouble();
//         double total = jumlah * harga;
//         
//         if (jumlah > 10){
//            double diskon = total * 0.05;
//            total -= diskon;
//            System.out.println("anda mendapat diskon 5%");
//        } 
//        System.out.println("Total harga: "+ total);

//3. Bonus barang setiap 5 pembelian
        System.out.print("Masukkan jumlah yang ingin dibeli");
        int jumlah = input.nextInt();
        int bonus = jumlah / 5;
        int totalBarang = jumlah + bonus;
        
        System.out.println("Anda dapat bonus "+ bonus +" barang");
        System.out.println("Total baang yang di dapat: "+ totalBarang);
                
    }
}
