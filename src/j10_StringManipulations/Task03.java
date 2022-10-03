package j10_StringManipulations;

public class Task03 {
    public static void main(String[] args) {
//Alamanya stringindeki ikinci 'a' karakterinin indexini bulun

        String str="Alamanya";

        // str.indexOf('a')-> ilk a'nın index'ini verir
        System.out.println(str.indexOf('a', str.indexOf('a') + 1));



    }
}
