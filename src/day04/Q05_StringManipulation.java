package day04;

import java.util.Scanner;

public class Q05_StringManipulation {
    public static void main(String[] args) {


// Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun

 //* Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
                   //Output : Cesaret insana sinirlarini ogretir.

Scanner scan=new Scanner(System.in);
        System.out.println("cümle oluşturmak için bir kelime girin");
        String word1=scan.next();
        String word2=scan.next();
        String word3=scan.next();
        String word4=scan.next();
        System.out.println(word1.substring(0,1).toUpperCase()+word1.substring(1));






    }
}
