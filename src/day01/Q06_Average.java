package day01;

public class Q06_Average {
    public static void main(String[] args) {

        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 23000;
      //  bu sayıların ortalamasını alın..hepsini toplayıp sayı kadara bölüm ortalmayı verir


        double sum = (num1 + num2 + num3 + num4 + num5);
        double Average=sum/5;
        System.out.println("Average = " + Average);

    }
}
