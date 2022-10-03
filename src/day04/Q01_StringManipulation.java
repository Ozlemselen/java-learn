package day04;

import java.util.Scanner;

public class Q01_StringManipulation {
    public static void main(String[] args) {
//kullanıcıdan ismini ve soyismini girmesini isteyin.sonrasında konsola tam ismini büyük harflerle yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi ve soy isminizi giriniz");
String firstName=scan.nextLine(),lastname=scan.nextLine();
String fullname=firstName.concat(""+lastname).toUpperCase();
        System.out.println("fullname = " + fullname);














    }


}
