package j09_SwitchStatement;

import java.util.Scanner;

public class C02_SwitchStatement {
//kullanıcının girdiği yılın ay sırasına göre ayın ismini print eden kod creat ediniz



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ay girin");
        int ayNo= sc.nextInt();
        switch (ayNo){
            case 1:
            System.out.println("ocak");
            break;
            case 2:
                System.out.println("şubat");
                break;



        }






    }
}
