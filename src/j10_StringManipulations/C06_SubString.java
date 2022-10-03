package j10_StringManipulations;

import java.util.Scanner;

public class C06_SubString {
    public static void main(String[] args) {
/*
substring()
Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
indexi'e kadar parçayı return eder
baslangic indexi ==> inclusive/dahil
bitis indexi ==> eclusive/haric
 */

        String str = "Java bilenin sırtı yere gelmez:)";
        System.out.println(str.substring(10));
//str datasının son 10 karakterini yazdırınız..
        System.out.println(str.substring(str.length() - 10));
//str datasının ilk 10 karakterini print ediniz
        System.out.println(str.substring(0, 10));
//str datasının ilk karakterini bulun
        System.out.println(str.substring(0, 1));

//girilen 4 harfli kelimeyi tersten print eden bir kod creat ediniz

        Scanner scan = new Scanner(System.in);
        System.out.print("dört harfli bir kelime giriniz");
        String kelime = scan.next();
        if (kelime.length() != 4) {
            System.out.println("4 harfli bir kelime girmelisiniz");
        }else{
            System.out.println(kelime.substring(kelime.length() - 1));
            System.out.println(kelime.substring(2,3));
            System.out.println(kelime.substring(1,2));
            System.out.println(kelime.substring(0,1));
        }


    }


    }