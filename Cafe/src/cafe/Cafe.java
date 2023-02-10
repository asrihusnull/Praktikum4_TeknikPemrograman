/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cafe;

import java.util.Scanner;
/**
 *
 * @author Asri
 * @version 1.0
 * @since 09/02/2023
 * 
 */
public class Cafe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Membuat scanner baru bernama input
        Scanner input = new Scanner(System.in);
        //Membuat objek menu yang merupakan array dari objek Produk yang memiliki ukuran 10
        Produk[] menu = new Produk[10];
        //Membuat objek pesanan yang merupakan array dari objek Penjualan memiliki ukuran 10
        Penjualan[] pesanan = new Penjualan[10];
        
        //Inisialisasi objek menu
        menu[0] = new Produk("Steak             ", 30000, 40);
        menu[1] = new Produk("Spaghetti         ", 20000, 30);
        menu[2] = new Produk("Kentang Goreng    ", 15000, 25);
        menu[3] = new Produk("Nasi Taichan      ", 25000, 35);
        menu[4] = new Produk("Chicken Katsu     ", 20000, 30);
        menu[5] = new Produk("Air Mineral       ", 5000, 15);
        menu[6] = new Produk("Cappucino         ", 15000, 25);
        menu[7] = new Produk("Teh Tarik         ", 5000, 15);
        menu[8] = new Produk("Lemon Tea         ", 10000, 20);
        menu[9] = new Produk("Milkshake        ", 15000, 25);
        
        //Deklarasi variabel
        int jumlah_pesanan = 0;
        int pilihan;
        int qty;
        int harga_total = 0;
        
        //Proses untuk melakukan pemesanan menu
        //Proses akan dilakukan sekali dan selama user memilih untuk melakukan pemesanan kembali
        do{
            //Menampilkan daftar menu yang ada di cafe
            System.out.println("\n            Daftar Menu Cafe");
            System.out.println("-----------------------------------------------");
            for(int i=0; i<menu.length; i++){
                System.out.println((i + 1) + ". " + menu[i].getNama() + "["+menu[i].getQty()+"]" + "\tRp " + menu[i].getHargaProduk());
            }
            
            System.out.println("\n              Pilih Menu");
            System.out.println("-----------------------------------------------");
            
            System.out.print("Menu nomor berapa? ");
            pilihan = input.nextInt();
            System.out.print("Berapa banyak? ");
            qty = input.nextInt();
            
            if(qty > menu[pilihan - 1].getQty()){
                //Jika jumlah produk lebih banyak dari stok yang tersedia, maka akan muncul tampilan seperti berikut
                System.out.println("Maaf, pesanan tidak tersedia");
            } else {
                pesanan[jumlah_pesanan] = new Penjualan(menu[pilihan - 1].getNama(), qty, (int) menu[pilihan - 1].getHargaProduk());
                jumlah_pesanan++;
                menu[pilihan - 1].setQty(menu[pilihan - 1].getQty() - qty);
                harga_total += qty * menu[pilihan - 1].getHargaProduk();
            }
            
            //Menampilkan pesan untuk memastikan bahwa user akan melakukan pemesanan kembali atau tidak
            System.out.print("\nPesan kembali? (y/n) ");
        }while(input.next().equals("y"));
        
        //Menampilkan rincian pemesanan
        System.out.println("\n             Rincian Pesanan");
        System.out.println("-----------------------------------------------");
        for(int i=0; i<jumlah_pesanan; i++){
                System.out.println((i + 1) + ". " + pesanan[i].getNama() + " " + pesanan[i].getQty() + " buah    " + " Rp " + pesanan[i].getTotalHarga());
        }
        System.out.println("-----------------------------------------------");
        //Menampilkan total  harga yang harus dibayar
        System.out.println("Total Harga:                     Rp " + harga_total);
        
        //Menutup stream input
        input.close();
    }
}
