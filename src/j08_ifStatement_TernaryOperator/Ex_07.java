package j08_ifStatement_TernaryOperator;

import java.util.Locale;
import java.util.Scanner;

public class Ex_07 {
   // tASK -> kullanıcının ehliyetinin varlığını kontrol ediniz.ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise
    //ve aldığı mesafe 100000 km ve üzeri ise kontak anahtarını veriniz.aksi durumda tecrübe yılı ve mesafe eksiklerini
    //print eden bir kod yazınız.


    public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
        System.out.print("Ehliyetiniz varsa E yoksa H giriniz");
        char ehlyt=sc.next().toUpperCase().charAt(0);//kullanıcının girdiği karakteri büyük harf ve ilk degerini yazdırı
        if (ehlyt=='E'){
            System.out.println("kaç yıllık tecrübeniz var");
            int tcrb=sc.nextInt();
            if (tcrb>=7){
                System.out.println("yaptığınız km mesafesini giriniz");
                int km=sc.nextInt();
                if(km>=100000) {
                }else System.out.println("anahtarı almanız için önce"+(100000-km)+"yol yapmalısınız");{


                    System.out.println("anahtar sizin");
                }
            }else System.out.println("kontak anahtarı almanız için önce"+(7-tcrb)+"yıla ihiyacınız var");
        }else System.out.println("önce ehliyet alınız");







    }


}
