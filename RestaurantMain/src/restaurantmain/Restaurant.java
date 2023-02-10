/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurantmain;

/**
 *
 * @author Asri
 * @version 1.0
 * @since 07/02/2023
 * 
 */
public class Restaurant {
    public class Menu{
        //Kamus Data (deklarasi variabel)
        //Mengganti access modifier semua variabel menjadi private
        private String[] nama_makanan;
        private double[] harga_makanan;
        private int[] stok;
        private static byte id=0;
        
        //Membuat getter Nama untuk mendapatkan nilai dari variabel nama_makanan
        public String[] getNama(){
            return nama_makanan; //Mengembalikan nilai nama_makanan
        }
        
        //Membuat getter Harga untuk mendapatkan nilai dari variabel harga_makanan
        public double[] getHarga(){
            return harga_makanan; //Mengembalikan nilai harga_makanan
        }
        
        //Membuat getter Stok untuk mendapatkan nilai dari variabel stok
        public int[] getStok(){
            return stok; //Mengembalikan nilai stok
        }
        
        //Membuat getter Id untuk mendapatkan nilai dari variabel id
        public static byte getId(){
            return id; //Mengembalikan nilai id
        }
    }
    
    //Deklarasi array bernama menu yang memiliki tipe data Menu
    private Menu[] menu;
    
    //Membuat constructor Restaurant
    public Restaurant(){
        menu = new Menu[10];
        for(int i=0; i<10; i++){
            menu[i] = new Menu();
            menu[i].nama_makanan = new String[10];
            menu[i].harga_makanan = new double[10];
            menu[i].stok = new int[10];
        }
    }
    
    //Membuat method tambahMenuMakanan untuk menambahkan menu
    public void tambahMenuMakanan(String nama, double harga, int stok){
        menu[Menu.getId()].nama_makanan[Menu.getId()] = nama;
        menu[Menu.getId()].harga_makanan[Menu.getId()] = harga;
        menu[Menu.getId()].stok[Menu.getId()] = stok;
        
        Menu.getId();
    }
    
    //Membuat method tampilMenuMakanan untuk menampilkan menu
    public void tampilMenuMakanan(){
        System.out.println("        Menu Makanan");
        System.out.println("-------------------------------");
        for(int i = 0; i<=Menu.getId(); i++){
            if(!isOutOfStock(i)){
                System.out.println(menu[i].nama_makanan[i] +"["+menu[i].stok[i]+"]"+"\tRp. "+menu[i].harga_makanan[i]);
            }
        }
    }
    
    //Membuat method isOutOfStock untuk mengecek apakah stok masih tersedia atau tidak
    public boolean isOutOfStock(int id){
        if(menu[id].stok[id] == 0){
            return true;
        } else {
            return false;
        }
    }
    
    //Membuat method nextId untuk menambahkan id
    public static void nextId(){
        Menu.id++;
    }
    
    //Membuat method baru bernama pesanMenuMakanan untuk memesan makanan serta menampilkan rincian pesanan ketika stok sudah berkurang
    public void pesanMenuMakanan(String namaMakanan, int jumlahPesanan){
        for(int i=0; i<=Menu.getId(); i++){
            //Jika nama makanan dan jumlah stok sesuai atau memenuhi maka proses pemesanan berhasil dilakukan
            if(menu[i].nama_makanan[i].equalsIgnoreCase(namaMakanan)&&menu[i].stok[i] >= jumlahPesanan){
                System.out.println("\n      Rincian Pesanan");
                System.out.println("-------------------------------");
                System.out.println("Menu Makanan : " + menu[i].nama_makanan[i]);
                System.out.println("Jumlah Pesanan : " + jumlahPesanan+" buah");
                System.out.println("Total : Rp. " + menu[i].harga_makanan[i]*jumlahPesanan);
                //Mengurangi jumlah stok makanan setelah dipesan
                menu[i].stok[i] -= jumlahPesanan;
                //Menampilkan menu makanan serta jumlah stok yang sudah berkurang
                System.out.println("\n");
                tampilMenuMakanan();
                return;
            }
        }
        //Jika nama makanan dan jumlah stok tidak sesuai atau tidak memenuhi maka akan tampil output berikut
        System.out.println("\nMaaf, proses pemesanan anda gagal");
    }
}
