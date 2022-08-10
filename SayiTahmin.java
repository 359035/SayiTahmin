/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sayitahmin;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class SayiTahmin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        int hak = 5;

        while (hak > 0) {

            Random rand = new Random();
            int number = rand.nextInt(100);

            System.out.print("Tahmin Ettiginiz Sayiyi Giriniz: ");
            int tahmin = input.nextByte();
            if (number == tahmin) {
                System.out.println("Tebrikler!Tahmininiz Doğru\nTahmin Ettiginiz Sayi:" + number);
                break;
            } else {
                if (tahmin < 0 && tahmin > 99) {
                    System.out.println("Lutfen 0 ile 100 Arasinda Rakam Giriniz!");
                }
                System.out.println("Tahmininiz Yanlis!");
                System.out.println("Dogru Sayi:" + number);
                hak--;
                System.out.println("Kalan Hakkiniz:" + hak);

            }

        }

    }

}
