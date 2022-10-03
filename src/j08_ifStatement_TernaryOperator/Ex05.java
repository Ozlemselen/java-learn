package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex05 {
    //girilen bir karakterin harf olup olmadıgını kontrol eden kod yaz
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("bir karakter giriniz");
        char krktr=sc.nextLine().charAt(0);

        if ((krktr>='A'&&krktr<='Z')||(krktr>='a'&&krktr<='z')){
            System.out.println("giridiginiz karakter harfdir :)");
         }else System.out.println("girdiğiniz  karakter harf değildir :(");


    }
}




