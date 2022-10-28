
package aplikasitoko;

import java.util.Scanner;

public class caffe {
    public static void main (String[]args){
        int totalHarga, uang;
        String keputusan;
        String pilih, pilihPaket, beli, lanjutBeli, lanjutBelanja;
        Scanner Input = new Scanner(System.in);
        do {
            System.out.println("");
            System.out.println("=====================");
            System.out.println("SELAMAT DATANG DI CAFFE SHOVI");
            System.out.println("=====================");
            System.out.println("Untuk memilih menu dapat menuliskan huruf nama-namanya terlebih dahulu");
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
                        System.out.println("");
                        System.out.print("Masukan nominal uang Anda: ");
                        uang = Input.nextInt();
                        totalHarga = uang - 12000;
                     
                        if (uang > 12000) {
                            System.out.println("Kembalian anda: " +totalHarga);
                            System.out.println("Terima Kasih Telah membeli di Caffe Kami ");

                        } else if (uang == 12000) {
                            System.out.println("uang Anda pas");
                            System.out.println("Terima Kasih Telah membeli di Restaurant Kami");

                        } else if (uang < 12000) {
                            System.out.println("Maaf uang Anda tidak mencukupi untuk memesan makanan");

                        }
                    }
                }

                if (pilihPaket.equals("COFFEMOCCA") || pilihPaket.equals("coffemocca") || pilihPaket.equals("2")) {
                    System.out.println("Harga yang Harus Anda bayar sebesar 18.000");
                    System.out.println("Apa Anda yakin untuk membeli?");
                    beli = Input.next();

                    if (beli.equals("yakin") || beli.equals("ya")) {
                        System.out.println("");
                        System.out.print("Masukan nominal uang Anda: ");
                        uang = Input.nextInt();
                        totalHarga = uang - 18000;
                        int kembalian = uang- totalHarga;
                        if (uang > 18000) {
                            System.out.println("Kembalian anda: " + kembalian);
                            System.out.println("Terima Kasih Telah membeli di Restaurant Kami ");

                        } else if (uang == 18000) {
                            System.out.println("uang Anda pas");
                            System.out.println("Terima Kasih Telah membeli di Restaurant Kami");

                        } else if (uang < 18000) {
                            System.out.println("Maaf uang Anda tidak mencukupi untuk memesan makanan,");

                        }
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

                    if (beli.equals("yakin") || beli.equals("iya") || beli.equals("ya")) {
                        System.out.println("");
                        System.out.print("Masukan nominal uang Anda: ");
                        uang = Input.nextInt();
                        totalHarga = 15000;
                        int kembalian = uang- totalHarga;
                        if (uang > 15000) {
                            System.out.println("Kembalian anda: " + kembalian);
                            System.out.println("Terima Kasih Telah membeli di Restaurant Kami ");

                        } else if (uang == 15000) {
                            System.out.println("uang Anda pas");
                            System.out.println("Terima Kasih Telah membeli di Restaurant Kami");

                        } else if (uang < 15000) {
                            System.out.println("Maaf uang Anda tidak mencukupi untuk memesan makanan,");

                        }
                    }
                }

                if (pilihPaket.equals("2") || pilihPaket.equals("COFFEGREENTEA") || pilihPaket.equals("coffegreentea")) {
                    System.out.println("Harga yang Harus Anda bayar sebesar 27.000");
                    System.out.println("Apa Anda yakin untuk membeli?");
                    beli = Input.next();

                    if (beli.equals("yakin") || beli.equals("iya") || beli.equals("ya")) {
                        System.out.println("");
                        System.out.print("Masukan nominal uang Anda: ");
                        uang = Input.nextInt();
                        totalHarga = uang - 27000;
                        int kembalian = uang- totalHarga;
                        if (uang > 27000) {
                            System.out.println("Kembalian anda: " +kembalian);
                            System.out.println("Terima Kasih Telah membeli di Restaurant Kami ");

                        } else if (uang == 27000) {
                            System.out.println("uang Anda pas");
                            System.out.println("Terima Kasih Telah membeli di Restaurant Kami");

                        } else if (uang < 27000) {
                            System.out.println("Maaf uang Anda tidak mencukupi untuk memesan makanan,");

                        }
                    }
                }
            }

            System.out.println("");
            System.out.println("Apakah anda ingin membeli lagi?");
            keputusan = Input.next();

        } while (keputusan.equals("iya"));
        System.out.println("");
        System.out.println("TERIMA KASIH");
        System.out.println("jangan bosan-bosan ke cafe kami");
    }
}

    
        
    

