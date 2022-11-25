/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedListOrdered;

/**
 *
 * @author ASUS
 */
public class cek {
            public static int g(int n){
            if (n ==1) {
                return 2;
            }else{
                return 3 * g(n/2) + g(n/2) +5;
            }
        }
    public static void main(String[] args) {
            System.out.println(g(8));
    }
}
