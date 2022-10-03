package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C02_TypeCasting {

    public static void main(String[] args) {

        boolean basarılı = true;
       boolean basarı=basarılı;//bunu string yapamazsın doğal uyumu yok
       System.out.println("basarılı = " + basarılı);
        System.out.println("basarı = " + basarı);
        double d = 17;//doublea integer atandı.küçükbüyüğe atanır

        System.out.println("d = " + d);
        int sayi1=33;
        int sayi2=7;

        System.out.println(sayi1/sayi2);// 4
        /*
        java iki int sayiyi biribirine böldugunuzde sonucu int verir
         eğer bölme işleminde ondalık sonuç çıkarsa ondalık kısmı siler
         */

        byte b=127;
        int i=b;
        System.out.println("i = " + i);

        int num=1453;
        double d1=17;
        System.out.println("d1 = " + d1);

        double db=d1/num;
        System.out.println("db = " + db);

        double d2=14.53;
        int num2= (int) d2;
        System.out.println("num2 = " + num2);

        int num3=150;
        byte b1= (byte) num3;
        System.out.println("b1 = " + b1);

        double d3=333;
        long l= (long) d3;


        double d4=571.4444;
        long l2= (long) d4;
        System.out.println("l2 = " + l2);

        /*task  kullanıcıdan bir karakter girmesini isteyin ve girilen karakterin ascii değerini
        yazın
        örnek input :
        output girdiğiniz a karakterinin ascii değeri :95

         */
        Scanner scan=new Scanner(System.in);

     System.out.println("ascii değere istediğin karakteri gir");
     char ch= scan.nextLine().charAt(0);
     int chasciideğeri=ch;
     System.out.println("chasciideğeri = " + chasciideğeri);


    }



    }

