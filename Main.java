package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("----------kelas Kotak-----------");
        Kotak main = new Kotak();
        main.setPanjang(3.47);
        main.setLebar(9.10);

        System.out.println("panjang: " + main.getPanjang());
        System.out.println("lebar: " + main.getLebar());
        System.out.println("luas: " + main.getPanjang() * main.getLebar());
        System.out.println("keliling: " + main.getPanjang() * main.getLebar() * main.getPanjang() * main.getLebar());

        System.out.println("----------------kelas Mahasiswa---------------");
        Mahasiswa Mahasiswa = new Mahasiswa();

        Mahasiswa.nama = "Mardianah";
        Mahasiswa.nim = "D0217338";
        Mahasiswa.alamat = "pambussuang";
        Mahasiswa.golonganDarah = "A+";
        Mahasiswa.status = "Mahasiswa";
        Mahasiswa.tinggiBadan = "165";
        Mahasiswa.beratBadan = "66";

        System.out.println("nama: " + Mahasiswa.getNama());
        System.out.println("nim: " + Mahasiswa.getNim());
        System.out.println("alamat: " + Mahasiswa.getAlamat());
        System.out.println("golongan darah: " + Mahasiswa.getGolonganDarah());
        System.out.println("status: " + Mahasiswa.getStatus());
        System.out.println("tinggi badan: " + Mahasiswa.getTinggiBadan());
        System.out.println("berat badan: " + Mahasiswa.getBeratBadan());

        System.out.println("---------------kelas node---------------");
        node node = new node();
        node.Label = "Jilbab";
        node.Value = 7;

        System.out.println("Nama Label: " + node.getLabel());
        System.out.println("Jumlah Label: " + node.getValue());

        System.out.println("-------------kelas stack-------------");
        stack stack = new stack();

        stack.value[0] ="mardianah";
        stack.value[1] = "zheerah";
        stack.value[2] = "dian";
        stack.value[3] = "ana";


        stack.setValueAt(6, "kaccul");

        for (int i = 0; i < stack.value.length; i++) {
            System.out.println(stack.value[i]);};

        }

    }