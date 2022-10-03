package day02;

public class Q01_Modulus {
//verilen 12345 sayısının rakamlarını yukardan aşağıya doğru yazdır
    //input 12345
    //output 1
//  2
//  3
//  4
//  5

    public static void main(String[] args) {
int x=12345;
int birler=x%10;
int onlar=(x/10)%10;

        int yuzler =(x/100) %10 ; //3
        int binler = (x/1000) %10; //2
        int onBinler = (x/10000); //1
        System.out.println(onBinler + "\n" + binler + "\n" +yuzler + "\n" + onlar + "\n" + birler );


    }
}
