/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nabilah2302013.tugaspertemuan7;

import java.util.Random;

public class UjiStopwatch {
    // Metode untuk mengurutkan angka dengan Selection Sort
    public static void selectionSort(int[] data) {
        int panjang = data.length;
        for (int i = 0; i < panjang - 1; i++) {
            int indeksTerkecil = i;
            for (int j = i + 1; j < panjang; j++) {
                if (data[j] < data[indeksTerkecil]) {
                    indeksTerkecil = j;
                }
            }
            // Menukar elemen terkecil dengan elemen saat ini
            int sementara = data[indeksTerkecil];
            data[indeksTerkecil] = data[i];
            data[i] = sementara;
        }
    }

    public static void main(String[] args) {
        int[] angka = new int[100000];
        Random acak = new Random();

        // Mengisi array dengan angka acak
        for (int i = 0; i < angka.length; i++) {
            angka[i] = acak.nextInt(1000000);
        }

        Stopwatch stopwatch = new Stopwatch(); // Membuat objek Stopwatch
        stopwatch.mulai(); // Memulai stopwatch

        selectionSort(angka); // Melakukan sorting

        stopwatch.berhenti(); // Menghentikan stopwatch

        System.out.println("Waktu eksekusi pengurutan: " + stopwatch.getWaktuBerjalan() + " milidetik");
    }
}
