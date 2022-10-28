package aplikasitoko;

import java.util.Scanner;

public class AplikasiToko {

    public static void main(String[] args) {
        int totalHarga, uang;
        String keputusan = "";
        String pilih, pilihPaket, beli = "", lanjutBeli = "", lanjutBelanja = "";
        Scanner Input = new Scanner(System.in);
        do {
            System.out.println("=====================");
            System.out.println("SELAMAT DATANG DI CAFFE SHOVI");
            System.out.println("=====================");
            System.out.println("Untuk memilih menu dapat menuliskan huruf nama-namaQnya terlebih dahulu");
            System.out.println("PAKET (A),PAKET (B)");
            pilih = Input.next();

            if (pilih.equals("Paketa") || pilih.equals("A") || pilih.equals("a")) {
                System.out.println("==========||==========");
                System.out.println("Pilihan Paket Makanan");
                System.out.println("==========||==========");
                System.out.println("1.COOFE LATTE");
                System.out.println("2.COFFE MOCCA");
                System.out.print("Silahkan pilih pesanan:");
                pilihPaket = Input.next();
                if (pilihPaket.equals("COFFELATTE") || pilihPaket.equals("coffelatte") || pilihPaket.equals("1")) {
                    System.out.println("Harga yang Harus Anda bayar sebesar 12.000");
                    System.out.println("Apa Anda yakin untuk membeli?");
                    beli = Input.next();

                    if (beli.equals("yakin") || beli.equals("iya") || beli.equals("ya")) {

                        System.out.print("Masukan nominal uang Anda: ");
                        uang = Input.nextInt();
                        totalHarga = (int) (uang - 12000);
                        if (totalHarga > 0) {
                            System.out.println("Kembalian anda: " + totalHarga);
                            System.out.println("Terima Kasih Telah membeli di Caffe Kami ");
                            break;
                        } else if (totalHarga == 0) {
                            System.out.print("uang Anda pas");
                            System.out.print("Terima Kasih Telah membeli di Restaurant Kami");
                            break;
                        } else if (totalHarga < 0) {
                            System.out.print("Maaf uang Anda tidak mencukupi untuk memesan makanan");
                            lanjutBeli = Input.next();

                        }
                    }
                }

                if (pilihPaket.equals("COFFEMOCCA") || pilihPaket.equals("coffemocca") || pilihPaket.equals("2")) {
                    System.out.println("Harga yang Harus Anda bayar sebesar 18.000");
                    System.out.println("Apa Anda yakin untuk membeli?");
                    beli = Input.next();

                    if (beli.equals("yakin") || beli.equals("ya")) {

                        System.out.print("Masukan nominal uang Anda: ");
                        uang = Input.nextInt();
                        totalHarga = (int) (uang - 18000);
                        if (totalHarga > 0) {
                            System.out.println("Kembalian anda: " + totalHarga);
                            System.out.println("Terima Kasih Telah membeli di Restaurant Kami ");
                            break;
                        } else if (totalHarga == 0) {
                            System.out.print("uang Anda pas");
                            System.out.print("Terima Kasih Telah membeli di Restaurant Kami");
                            break;
                        } else if (totalHarga < 0) {
                            System.out.print("Maaf uang Anda tidak mencukupi untuk memesan makanan,");
                            lanjutBeli = Input.next();
                        }
                    }
                }

                if (pilih.equals("paketb") || pilih.equals("B") || pilih.equals("b")) {
                    System.out.println("==========||==========");
                    System.out.println("Pilihan Paket Makanan");
                    System.out.println("==========||==========");
                    System.out.println("1.COFFE CAPUCINO");
                    System.out.println("2.COFFE GREENTEA");
                    System.out.print("Silahkan pilih pesanan:");
                    pilihPaket = Input.next();
                    if (pilihPaket.equals("1") || pilihPaket.equals("coffecapucino") || pilihPaket.equals("COFFECAPUCINO")) {
                        System.out.println("Harga yang Harus Anda bayar sebesar 15.000");
                        System.out.println("Apa Anda yakin untuk membeli?");
                        beli = Input.next();
                    }

                    if (beli.equals("yakin") || beli.equals("iya") || beli.equals("ya")) {

                        System.out.print("Masukan nominal uang Anda: ");
                        uang = Input.nextInt();
                        totalHarga = (int) (uang - 15000);
                        if (totalHarga > 0) {
                            System.out.println("Kembalian anda: " + totalHarga);
                            System.out.println("Terima Kasih Telah membeli di Restaurant Kami ");
                            break;
                        } else if (totalHarga == 0) {
                            System.out.print("uang Anda pas");
                            System.out.print("Terima Kasih Telah membeli di Restaurant Kami");
                            break;
                        } else if (totalHarga < 0) {
                            System.out.print("Maaf uang Anda tidak mencukupi untuk memesan makanan,");

                        }
                    }
                } else if (pilihPaket.equals("2") || pilihPaket.equals("COFFEGREENTEA") || pilihPaket.equals("coffegreentea")) {
                    System.out.println("Harga yang Harus Anda bayar sebesar 27.000");
                    System.out.println("Apa Anda yakin untuk membeli?");
                    beli = Input.next();

                    if (beli.equals("yakin") || beli.equals("iya")) {

                        System.out.print("Masukan nominal uang Anda: ");
                        uang = Input.nextInt();
                        totalHarga = uang - 27000;
                        if (uang > 27000) {
                            System.out.println("Kembalian anda: " + totalHarga);
                            System.out.println("Terima Kasih Telah membeli di Restaurant Kami ");

                        } else if (uang == 27000) {
                            System.out.print("uang Anda pas");
                            System.out.print("Terima Kasih Telah membeli di Restaurant Kami");

                        } else if (uang < 27000) {
                            System.out.print("Maaf uang Anda tidak mencukupi untuk memesan makanan,");

                        }
                    }
                }

                System.out.println("Apakah anda ingin membeli lagi?");
                keputusan = Input.nextLine();
            }
            while(keputusan.equals("ya"));
            System.out.println("jangan bosan-bosan2 ke cafe kami");
        }

    }

