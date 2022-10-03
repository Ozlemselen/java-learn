package Day03;

import java.util.Scanner;

public class Q07_SwitchCase {
    public static void main(String[] args) {
//girilen üç haneli bir sayının okunuşunu yazı ile yazdırınız

       Scanner scan=new Scanner(System.in);
        System.out.println("3 basamaklı pozitif bir sayı giriniz");
        int sayı=scan.nextInt();
        int yüzlerbas=sayı/100,onlarbas=(sayı/10)%10,birlerbas=sayı%10;
        if (sayı>99&&sayı<1000){
            switch(yüzlerbas){
                case 0:
                    System.out.println("");
                case 1: System.out.println("yuz"); break;
                case 2: System.out.println("ikiyuz"); break;
                case 3: System.out.println("ucyuz"); break;
                case 4: System.out.println("dortyuz"); break;
                case 5: System.out.println("besyuz"); break;
                case 6: System.out.println("altiyuz"); break;
                case 7: System.out.println("yediyuz"); break;
                case 8: System.out.println("sekizyuz"); break;
                case 9: System.out.println("dokuzyuz"); break;
            }
            }
        }

    }

