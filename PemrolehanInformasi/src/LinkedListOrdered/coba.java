/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedListOrdered;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class coba {
    public static void main(String[] args) {
        double harga, jmlh, disc, total;
        
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        
        System.out.print("harga ");
        harga = myObj.nextDouble();
        
        System.out.print("jmlh ");
        jmlh = myObj.nextDouble();
        
        double d = 20/100;
        disc = (harga * 20/100);
        total = harga - disc;
        
        System.out.println("sebelum " + harga);
        System.out.println("disc " + disc);
        System.out.println("setelah " + total);
    }
}
