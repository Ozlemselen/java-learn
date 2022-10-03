package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_ScannerClass {

    public static void main(String[] args) {

// kullanıcıdan veri almak içinn şu adım takip edilir
        //1. adım-> Scanner class'dan obj create edilir.

       // Scanner classından scan isminde değerini System içinden alan bir obj.

        // 2 adım->Kullanıcıdan istenen veri için bildirimde bulunulur->sout("...");
        System.out.println("adınızı giriniz :");

        // 3. adım-> kuulanıcının girdigi veri data type'ne göre bir variable atanır.
        // kullanıcıdan gelen String tipinde isim verisi scan obj'ni nextLine() methodu ile atandı

        //System.out.println("isim = " + isim);

//TASK Kullanıcının girdiği değere göre kare alanı ve çevresini hesaplayan bir kod  creat ediniz




        Scanner scan = new Scanner(System.in);
        System.out.print("isminizi giriniz");

        char ch= scan.nextLine().charAt(0);//kullanıcıdan gelen string ifadenin sıfırıncı yani ilk
        //karaterini alır.
        System.out.println("isminizin ilk karakteri"+ch);

        }
    }













