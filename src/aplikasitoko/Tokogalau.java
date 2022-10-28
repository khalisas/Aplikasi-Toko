
package aplikasitoko;

import java.util.Scanner;

public class Tokogalau {
    
    public static void main(String[] args){
        int diskon, totalHarga, uang;
        String pilih, pilihPaket, beli, lanjutBeli="", lanjutBelanja="";
        
        Scanner input = new Scanner(System.in);
//        do{
            System.out.println("");
            System.out.println("");
            System.out.println("Untuk memilih menu dapat menuliskan angkanya atau nama menunya tanpa spasi dulu ya :)");
            System.out.print("Beli paket (1)baper atau (2)bucin: ");
            pilih = input.next();
//
            if(pilih.equals("Baper")||pilih.equals("baper")||pilih.equals("1")){
                System.out.println("===================||====================");
                System.out.println("Pilihan Paket Baper : ");
                System.out.println("===================||====================");
                System.out.println("1. Paketbapergile:ayam gamon,es teh anget ");
                System.out.println("2. Paketbaperaja:ayam pokpok,coffe pahit sama kaya kenyataan");
                System.out.print("Silahkan pilih paket: ");
                pilihPaket = input.next(
                        
            do{
//                            System.out.print("Masukan nominal uang anda: ");
//                            uang = input.nextInt();
//                            totalHarga = uang - 30000;
//                            if(totalHarga > 0){
//                            System.out.println("Kembalian anda: "+ totalHarga);
//                            System.out.print("maaciw udah mampir ke toko kami yaww jan lupa kembali");
//                            }else if(totalHarga == 0){
//                                System.out.print("Uang anda pas tidak ada susuk");
//                                System.out.print("maaciw udah mampir ke toko kami yaww jan lupa kembali");
//                            }else if (totalHarga < 0){
//                                System.out.print("Maaf uang anda kurang, ketikan (iya) untuk mulai membayar lagi, tidak untuk (tidak) jadi: ");
//                                lanjutBeli = input.next();
//                            }
//                        }while(lanjutBeli.equals("iya"));
//                    }
//                }else if(pilihPaket.equals("2")||pilihPaket.equals("Paketbaperaja")||pilihPaket.equals("paketbaperaja")){
//                    System.out.println("Harga yang harus anda bayar untuk paket paket baper aja: Rp 17.000");
//                    System.out.print("Apa anda yakin untuk membeli nih ?  ");
//                    beli = input.next();
//                    if(beli.equals("yakin") || beli.equals("iya")){
//                        do{
//                            System.out.print("Masukan nominal uang anda: ");
//                            uang = input.nextInt();
//                            totalHarga = uang - 17000;
//                            if(totalHarga > 0){
//                            System.out.println("Kembalian anda: "+ totalHarga);
//                            System.out.print("Terimah Kasih Telah Belnja di Toko Kami");
//                            }else if(totalHarga == 0){
//                                System.out.print("Uang anda pas tidak ada susuk");
//                                System.out.print("maaciw udah mampir ke toko kami yaww jan lupa kembali");
//                            }else if (totalHarga < 0){
//                                System.out.print("Maaf uang anda kurang, ketikan (iya) untuk mulai membayar lagi, tidak untuk (tidak) jadi beli: ");
//                                lanjutBeli = input.next();
//                            }
//                        }while(lanjutBeli.equals("iya"));
//                   
//            }else if(pilih.equals("Paketbucin")||pilih.equals("paketbucin")||pilih.equals("2")){
//                System.out.println("=================||========================");
//                System.out.println("paket bucin ");
//                System.out.println("=================||========================");
//                System.out.println("1. Paketbucinpol:mie rasa yang pernah ada,es tehrimalah cintaku"); 
//                System.out.println("2. Paketbucinsd:mocca kamu jadi pacarku");
//                System.out.println("Silahkan pilih paket: ");
//                pilihPaket = input.next();
//                        switch (pilihPaket) {
//                            case "1":
//                            case "paketbucinpol":
//                            case "Paketbucinpol":
//                                System.out.println("Harga yang harus anda bayar untuk paket 23.000 ");
//                                System.out.print("Apa anda yakin untuk membeli nih?  ");
//                                beli = input.next();
//                                if(beli.equals("yakin") || beli.equals("iya")){
//                                    do{
//                                        System.out.print("Masukan nominal uang anda: ");
//                                        uang = input.nextInt();
//                                        totalHarga = (int) (uang - 23.000);
//                                        if(totalHarga > 0){
//                                            System.out.println("Kembalian anda: "+ totalHarga);
//                                            System.out.print("maaciw udah mampir ke toko kami yaww jan lupa kembali");
//                                        }else if(totalHarga == 0){
//                                            System.out.print("tidak ada susuk");
//                                            System.out.print("maaciw udah mampir ke toko kami yaww jan lupa kembali");
//                                        }else if (totalHarga < 0){
//                                            System.out.print("Maaf uang anda kurang, ketikan (iya) untuk mulai membayar lagi, tidak untuk (tidak) jadi beli: ");
//                                            lanjutBeli = input.next();
//                                        }
//                                    }while(lanjutBeli.equals("iya"));
//                                }else{
//                                    System.out.print("Maaf Inputan Anda Salah");
//                                }           break;
//                            case "2":
//                            case "paketbucinsd":
//                            case "Paketbucinsd":
//                                System.out.println("Harga yang harus anda bayar untuk paket bucin sd 12.000");
//                                System.out.print("Apa anda yakin untuk membeli nih ?  ");
//                                beli = input.next();
//                                if(beli.equals("yakin") || beli.equals("iya")){
//                                    do{
//                                        System.out.print("Masukan nominal uang anda: ");
//                                        uang = input.nextInt();
//                                        totalHarga = (int) (uang - 12.000);
//                                        if(totalHarga > 0){
//                                            System.out.println("Kembalian anda: "+ totalHarga);
//                                            System.out.print("maaciw udah mampir ke toko kami yaww jan lupa kembali");
//                                        }else if(totalHarga == 0){
//                                            System.out.print("Uang anda pas tidak ada susuk");
//                                            System.out.print("maaciw udah mampir ke toko kami yaww jan lupa kembali");
//                                        }else if (totalHarga < 0){
//                                            System.out.print("Maaf uang anda kurang, ketikan (iya) untuk mulai membayar lagi, tidak untuk (tidak) jadi beli: ");
//                                            lanjutBeli = input.next();
//                                        }
//                                    }while(lanjutBeli.equals("iya"));
//                                }           break;
//                            case "3":
//                            case "vga":
//                            case "VGA":
//                                System.out.println("Harga yang harus anda bayar untuk paket Gaming: Rp 5.000.000");
//                                System.out.print("Selamat anda mendapatkan diskon 25%");
//                                System.out.print("Apa anda yakin untuk membeli ?  ");
//                                beli = input.next();
//                                if(beli.equals("yakin") || beli.equals("iya")){
//                                    do{
//                                        System.out.print("Masukan nominal uang anda: ");
//                                        uang = input.nextInt();
//                                        totalHarga = uang - (5000000*25/100);
//                                        if(totalHarga > 0){
//                                            System.out.println("Kembalian anda: "+ totalHarga);
//                                            System.out.print("Terimah Kasih Telah Belnja di Toko Kami");
//                                        }else if(totalHarga == 0){
//                                            System.out.print("Uang anda pas");
//                                            System.out.print("Terimah Kasih Telah Belnja di Toko Kami");
//                                        }else if (totalHarga < 0){
//                                            System.out.print("Maaf uang anda kurang, ketikan (iya) untuk mulai membayar lagi, tidak untuk (tidak) jadi beli: ");
//                                            lanjutBeli = input.next();
//                                        }
//                                    }while(lanjutBeli.equals("iya"));
//                                }           break;
//                            default:
//                                break;
//                        }
//            }else{
//                System.out.println("Menu yang anda pilih belum tersedia");
//            }
//            System.out.print("Apa anda masih ingin belanja di toko kami ?");
//            lanjutBelanja = input.next();
//        }while(lanjutBelanja.equals("iya")||lanjutBelanja.equals("ya"));
//        System.out.print("Terima Kasih Telah Mampir ke toko Kami");
//            }
        }
    }
}
        
        
    

    

