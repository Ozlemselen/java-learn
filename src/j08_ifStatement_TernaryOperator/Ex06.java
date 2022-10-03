package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex06 {
//task kullanıcının cinsiyeti kAdın ise 60 yaşından büyük ve prim günü 6000den fazla ise emekliliğini
    //kullanıcının cinsiyeti erkek ise 65 yasından büyük ve prim günü 7000den fazla ise emekliliğini
    //kontrol edip kalan yıl ve prim gününü print eden kod creat ediniz


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("cinsiyetiniz\nKADIN için K\n ERKEK için E giriniz");
        char cnsyt=sc.next().charAt(0);
        System.out.println("yasınızı giriniz");
        int yas=sc.nextInt();
        if(yas>60){
        }else System.out.println("emekliliğinize daha :" +(60-yas)+"yıl daha var");
        if (cnsyt=='K'){
        }
        System.out.println("prim gününüzü giriniz");
        int primGünü=sc.nextInt();
        if(primGünü>6000) {
            System.out.println("tebrikler emekli oldunuz");
        } else System.out.println("emekliliğiniz için"+(6000-primGünü)+"yatırmanız lazım");

        {

        }

            }


        }

