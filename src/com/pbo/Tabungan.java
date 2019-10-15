package com.pbo;

/*
 * #Author
 * Nama  : Agung Sepruloh
 * NIM   : 10118902
 * Kelas : IF-11K
 * Deskripsi Program : program ini berguna untuk menghitung jumlah saldo pada tabungan
 *
 */

public class Tabungan {
    private static int saldo = 3500000;

    public static int hitungSaldo() {
        return saldo + (saldo * 8 / 100);
    }

    public static void main(String[] args) {
        int i = 0;
        while (saldo < 6000000) {
            saldo = hitungSaldo();
            System.out.println(String.format("Tabungan di bulan ke-%d Rp. %,3d", ++i, saldo).replace(",", "."));
        }
    }
}
