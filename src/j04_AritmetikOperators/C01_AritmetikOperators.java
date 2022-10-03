package j04_AritmetikOperators;

import java.util.Scanner;

public class C01_AritmetikOperators {

    public static void main(String[] args) {

int a=13;
int b=17;
int c=47;
        System.out.println(b+a*c);
        System.out.println(c-a/(b-c)+a*b);

int g=2;
int h=3;
String s="JavaCAN";
//task g h s variableları kullanarak 61JavaCAN-1 prınt eden bir kod yazınız

        System.out.println(""+(g*h)+(h-g)+s+(g-h));

  Scanner scan = new Scanner(System.in);
        System.out.print("3 basamaklı bir sayı giriniz : ");

        int sayi = scan.nextInt();

        // 1 ler basamgı-> bir sayının 10 bolumunden kalan 1 ler basmagıdır..
        int birler = sayi % 10;//sayının birler basamagı
        sayi /= 10;// sayı 10 bolumunden bolumu verir 853/10->85
        int onlar = sayi % 10;// 85in 10 bolumunden kalan->5
        int yüzler = sayi / 10;// 85'in 10' a bolumu ->8

        System.out.println("Girdiginiz sayinin birler basamagi :"+birler+"\nGirdiginiz sayinin onlar basamagi : "+onlar
                +"\nGirdiginiz sayinin yuzler basamagi :"+yüzler);
    }
}