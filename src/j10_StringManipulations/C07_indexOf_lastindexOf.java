package j10_StringManipulations;

import java.util.Scanner;

public class C07_indexOf_lastindexOf {
    public static void main(String[] args) {
/* indexOf()
 * char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
 * Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
  contains den farkı indexini verir, contains ise true false

*/
        String str = "Good";
        System.out.println("ilk görülen o nun index nosu:" + str.indexOf('o'));
        System.out.println("d nin index nosu:" + str.indexOf("d"));
        System.out.println(str.indexOf("D"));//olmayan karakter indexi sorgulanırsa -1 return eder
        System.out.println(str.indexOf("od"));

/** lastIndexOf()
 *  String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
 *  indexOf un sondan olan hali fakat index numaraları değişmez.
 *  lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
 *  indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
 */

        String isim = "mustafa nizamoğlu";
        System.out.println(isim.indexOf('a'));
        System.out.println(isim.lastIndexOf("a"));
        System.out.println(isim.lastIndexOf("fa"));

        //girilen cümlenin aşagıdaki durumları saglayacak kod create edin
        //girilen cümle java içermiyor
        //girilen cümle bir tane java içeriyor
        //girilen cümle birden fazla java içeriyor

        Scanner scan = new Scanner(System.in);
        System.out.println("kafi miktar bir cümle giriniz");
        String cumle = scan.nextLine().toLowerCase();
        if (cumle.indexOf("java") == -1) {
            System.out.println("girilen cümle java içermiyor");

        } else if (cumle.indexOf("java") == cumle.lastIndexOf("java"));
        {
            System.out.println("girilen cümle bir tane java içeriyor");
        }







    }
}























