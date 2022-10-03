package j11_MethodCreation;

import java.util.Locale;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
  //girilen ad ve soyadın ilk harfleri büyük diğerlerini küçük yazdıran method creat ediniz,

        Scanner scan=new Scanner(System.in);
        System.out.println("adınızı giriniz");
        System.out.println("soyadınızı giriniz");
String ad= scan.next();
String soyad= scan.next();



        isimSoyisimHarfKontrol(ad, soyad);
        System.out.println(isimSoyisimHarfKontrol2(ad, soyad));

    }//main sonu

    private static void isimSoyisimHarfKontrol(String ad, String soyad) {

        ad=ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase();
        soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();
        System.out.println("ad  soyad = " + ad + " " + soyad);
    }

    private static String isimSoyisimHarfKontrol2(String ad, String soyad) {//return typle method

        ad=ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase();
        soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();

        return ad+" "+soyad;
    }
}



