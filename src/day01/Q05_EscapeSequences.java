package day01;

public class Q05_EscapeSequences {

    public static void main(String[] args) {

        /*  \n metni bir alt satırdan itibaren yazdırır
            \t metni yatayda bir tab miktarı kaydırır
            \\ ters slaş yazdırır
            \' tek tırnak yazdırır
            \"çift tırnak yazdırır
         */

     //konsola bir tab ilerde "Hello","Students  \ //"şeklinde yazdır
        //Attention kelimesini her bir harfi ayrı satıra gelecek şekilde yazdır
        //"Kaliteli" insan isiyle ugrasır
        //'bos insan'kisiyle ugrasır yazdırın
        //iki satır sonra da satır basından 2 tab ilerde de "bu sözü çok severim"yazdırın
        //bunlerı sadece bir sout kullanarak yazdırın
        System.out.println("\t\"Hello \",\"Students\t\\ // \" ");
        System.out.println("A\nt\nt\ne\nn\ne\nt\ni\no\nn");
        System.out.println("\"Kaliteli\"insan isiyle ugrasır\n\'bos insan\'kisiyle ugrasır\n\n\t\t\"bu sözü çok severim\"");


    }
}
