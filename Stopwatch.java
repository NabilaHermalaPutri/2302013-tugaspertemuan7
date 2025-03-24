/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.nabilah2302013.tugaspertemuan7;

/**
 *
 * @author Lenovo
 */
public class Stopwatch {
    private long waktuMulai;
    private long waktuSelesai;

    // Konstruktor tanpa argumen, otomatis mengatur waktuMulai ke waktu saat ini
    public Stopwatch() {
        this.waktuMulai = System.currentTimeMillis();
    }

    // Metode untuk mendapatkan waktu mulai
    public long getWaktuMulai() {
        return waktuMulai;
    }

    // Metode untuk mendapatkan waktu selesai
    public long getWaktuSelesai() {
        return waktuSelesai;
    }

    // Metode untuk memulai stopwatch
    public void mulai() {
        this.waktuMulai = System.currentTimeMillis();
    }

    // Metode untuk menghentikan stopwatch
    public void berhenti() {
        this.waktuSelesai = System.currentTimeMillis();
    }

    // Metode untuk menghitung selisih waktu yang berlalu
    public long getWaktuBerjalan() {
        return waktuSelesai - waktuMulai;
    }
}

