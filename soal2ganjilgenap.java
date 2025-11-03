package LatihanUjianKenaikanLevel;

import java.util.Scanner;

public class soal2ganjilgenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //meminta input angka dari pengguna
        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();

        //menentukan ganjil atau genap
        if (angka % 2== 0) {
            System.out.println(angka + " adalah angka genap.");
        } else {
            System.out.println(angka + " adalah angka ganjil.");
        }
    }
}
