package j10_StringManipulations;

import java.util.Scanner;

public class C09_Replace_ReplaceAll {
    public static void main(String[] args) {


/** replace()
 * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini (update -set) saglar. Sonuc String'dir..
 *

 */
String str="javacanlara selam olsun java ile bolcana offeer";
        System.out.println(str.replace('a','@'));

//task  Girilen ismini, soyismini ve 16 haneli kredi karti no bilgilerini aşağıdaki formatta print eden code create ediniz.
// isim-soyisim : M***** B*******
// kart no : **** **** **** 1234


        Scanner sc=new Scanner(System.in);
        String isim="Çiğdem";
        String soyad="Şen";
        long kartno=1234567890123456789l;
        String s = isim.charAt(0) + isim.substring(1).replaceAll("\\w ", "*");


    }
}
