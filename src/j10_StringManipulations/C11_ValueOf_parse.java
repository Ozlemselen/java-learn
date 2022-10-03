package j10_StringManipulations;

public class C11_ValueOf_parse {
    public static void main(String[] args) {

//task string type verilen iki adet bagış miktarını toplayan kod creat edin

        String bagis1 = "1500";
        String bagis2 = "2500";


        int bagisDegeri1=  Integer.valueOf(bagis1);//bagis1 string içindeki sayı değerini int'e cavirdi bagisDegeri1'e atadı
        int bagisDegeri2=  Integer.valueOf(bagis2);//bagis2 string içindeki sayı değerini int'e cavirdi bagisDegeri2'e atadı

        System.out.println("toplam bagis miktarı : "+(bagisDegeri1+bagisDegeri2));//bagısDegerleri toplanıp perint edildi:4000

        int fetih=Integer.valueOf("1453");
        System.out.println(fetih);//1453


        System.out.println("toplam bagıs : "+(Integer.parseInt(bagis1) + Integer.parseInt(bagis2)));//4000


        int tc=1234567;
        String strTc = String.valueOf(tc);
        System.out.println("strTc = " + strTc);//1234567
        System.out.println("strTc+tc = " + (strTc + tc));//

        String  fiyat="$150";
        int yeniFiyat=  Integer.valueOf(fiyat);
        System.out.println("yeniFiyat = " + yeniFiyat);











    }
}
