/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafe;

/**
 *
 * @author Asri
 * @version 1.0
 * @since 07/02/2023
 * 
 */
public class Produk {
    //Kamus Data (deklarasi variabel)
    private String nama_produk;
    private int harga_produk;
    private int qty;
    
    //Membuat constructor Produk
    public Produk(String nama_produk, int harga_produk, int qty){
        this.nama_produk = nama_produk;
        this.harga_produk = harga_produk;
        this.qty = qty;
    }
    
    //Membuat getter Nama untuk mendapatkan nilai dari variabel nama_produk
    public String getNama(){
        return nama_produk; //Mengembalikan nilai nama_produk
    }
    
    //Membuat getter HargaProduk untuk mendapatkan nilai dari variabel harga_produk
    public double getHargaProduk(){
        return harga_produk; //Mengembalikan nilai harga_produk
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
