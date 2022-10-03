package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C06_NestedTernaryOperator {
/*
 TASK :
Kullanicidan bir sayi aliniz
Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
 */

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("sayı gir");
        int sayı= sc.nextInt();
        System.out.println(sayı >= 0 ? (sayı < 10 ? "Rakam" : "Pozitif Sayi") : "Negatif Sayi");


    }

}
