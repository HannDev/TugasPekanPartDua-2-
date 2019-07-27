package com.belajar;

public class Main {
    public static void main(String[] args) {
        

        //FUNGSI

        parameter objek = new parameter();
        int hitungKecepatan = objek.kecepatanMotor(20,5);
        System.out.println("kecepatanya adalah :" + hitungKecepatan+" km/jam");



        //PROCEDURE

        objek.namaPengendara("Nomor Satu :");
        objek.namaPengendara1("Rohman");
        objek.namaPengendara2("Abdul");
        objek.setNamaPengendara3("Hani");

        objek.setNamaPengendara3("Nomor Dua :");
        objek.namaPengendara4("satu");
        objek.namaPengendara5("Dua");
        objek.namaPengendara6("Tiga");

        objek.namaPengendara6("Nomor Tiga :");
        objek.namaPengendara6("Nama  : Lili");
        objek.namaPengendara6("Nomor : 08111");
        objek.namaPengendara6("Nama  : lala");
        objek.namaPengendara6("nomor : 08122");
        objek.namaPengendara6("Nama  : Maya");
        objek.namaPengendara6("Nomor : 08133");

        objek.namaPengendara6("Nomor Empat :");
        objek.namaPengendara6("Privite class   : kelas pribadi yang dapat diakses di satu folder itu sendiri");
        objek.namaPengendara6("Publik Class    : kelas yang dapat diakses di semua kelas");
        objek.namaPengendara6("Protected class : Kelas yang hanya dapat diakses didalam kelas itu sendiri");

        objek.namaPengendara6("Nomor Lima :");
        objek.namaPengendara6("Method Adalah suatu objek yang dimana didalamnya terdapat dua option yaitu Procedure dan Fungsi");
        objek.namaPengendara6("Prosedure adalah suatu objek yang hanya bermaikan kata atau kalimat");
        objek.namaPengendara6("Fungsi Adalah suatu objek dimana hanya bermaikan angka saja");


    }
}
