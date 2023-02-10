/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class Penjualan {
    //Kamus Data (deklarasi variabel)
    private String nama_produk;
    private int qty;
    private int harga_total;
    
    //Membuat constructor Penjualan
    public Penjualan(String nama_produk, int qty, int harga_total){
        this.nama_produk = nama_produk;
        this.harga_total = harga_total;
        this.qty = qty;
    }
    
    //Membuat getter Nama untuk mendapatkan nilai dari variabel nama_produk
    public String getNama(){
        return nama_produk; //Mengembalikan nilai nama_produk
    }
    
    //Membuat getter TotalHarga untuk mendapatkan nilai dari variabel harga_total
    public int getTotalHarga(){
        return harga_total; //Mengembalikan nilai harga_total
    }
    
    //Membuat getter Qty untuk mendapatkan nilai dari variabel qty
    public int getQty(){
        return qty; //Mengembalikan nilai qty
    }
    
    //Membuat setter untuk memasukkan nilai dari variabel qty
    public void setQty(int qty){
        this.qty = qty;
    }
}
