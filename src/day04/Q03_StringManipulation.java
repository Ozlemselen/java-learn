package day04;

import java.util.Scanner;

public class Q03_StringManipulation {
    public static void main(String[] args) {
        //scanner kullanarak iki ayrı deger giriniz ve bu iki kelimeyi method olarak birleştiriniz
//yukardaki örnekte verilen ilk v eikinci değişkenlerin ilk harflerini atıp birleştirin

        Scanner scan=new Scanner(System.in);
        System.out.println("String1");
String str1=scan.nextLine();
        System.out.println("String2");
        String str2= scan.nextLine();
        System.out.println("1.method ile birlesim :" + str1 + " " + str2);
        System.out.println("2.method ile birlesim :" + str1.concat(" " + str2));
        String  str1Ilksiz = str1.substring(1);
        String  str2Ilksiz = str2.substring(1);
        System.out.println("ilk harfler olmadan birlesimi : " + str1Ilksiz + " " + str2Ilksiz);


    }
}
