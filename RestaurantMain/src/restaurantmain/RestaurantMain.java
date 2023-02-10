/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurantmain;

/**
 *
 * @author Asri
 * @version 1.0
 * @since 07/02/2023
 * 
 */
public class RestaurantMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        
        //Menambahkan menu makanan yang tersedia
        menu.tampilMenuMakanan();
        
        //Menampiilkan rincian pemesanan
        menu.pesanMenuMakanan("Gehu", 15);
    }
    
}
