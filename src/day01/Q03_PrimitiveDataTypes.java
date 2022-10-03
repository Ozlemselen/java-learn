package day01;

public class Q03_PrimitiveDataTypes {

    public static void main(String[] args) {
     /*byte short int long double float veri tiplrinin min max degerlerini yazdır
       */
        byte byteMin= Byte.MIN_VALUE;
        System.out.println("byteMin = " + byteMin);
        byte byteMax=Byte.MAX_VALUE;
        System.out.println("byteMax = " + byteMax);
        short shortMin=Short.MIN_VALUE;
        System.out.println("shortMin = " + shortMin);
        short shortMax=Short.MAX_VALUE;
        System.out.println("shortMax = " + shortMax);
        int intMin=Integer.MIN_VALUE;
        System.out.println("intMin = " + intMin);
        int intMax=Integer.MAX_VALUE;
        System.out.println("intMax = " + intMax);
        long longMin=Long.MIN_VALUE;
        System.out.println("longMin = " + longMin);
        long longMax=Long.MAX_VALUE;
        System.out.println("longMax = " + longMax);

/*her veri türüyle bir tane olmak üzere 4 değişken oluşturun(float,double,char,boolean)
değişkenler için anlamlı isimler kullanıp yazdıralım
 */

float laptopfiyat=9999.99f;
double kilometre=123.5;
char cinsiyet='E';
boolean dogruMu=true;
        System.out.println("kilometre = " + kilometre);
        System.out.println("laptopfiyat = " + laptopfiyat);
        System.out.println("cinsiyet = " + cinsiyet);
        System.out.println("dogruMu = " + dogruMu);

    }
}
