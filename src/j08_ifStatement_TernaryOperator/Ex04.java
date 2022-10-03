package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex04 {
    //TASK -> girilen iki sayıyı seçilen dört işlemden birine uygulayıp sonucu print eden kod yzınız


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("birinci sayıyı girin");
        double sayı1 = sc.nextDouble();
        System.out.println("ikinci sayıyı girin");
        double sayı2 = sc.nextDouble();
        System.out.println("+ için 1,-için 2,* için 3,/için 4 seçiniz");
        int secim = sc.nextInt();
        if (secim == 1) {
            System.out.println(sayı1+sayı2);

        }else if (secim==2){
            System.out.println(sayı1-sayı2);
        }else if (secim==3){
            System.out.println(sayı1*sayı2);
        }else if (secim==4){
            System.out.println(sayı1/sayı2);
        }
    }
}













