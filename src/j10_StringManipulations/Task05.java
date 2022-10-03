package j10_StringManipulations;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        /* Task->
Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("adınızı giriniz");
        String ad = scan.nextLine();
        System.out.println("soyad giriniz");
        String soyad = scan.nextLine();
        System.out.println(ad.substring(0, 1).toUpperCase() + ad.substring(1));
    }
}