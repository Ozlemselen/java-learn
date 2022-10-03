package j02_DataTypes_WrapperClass;

public class C02_DataTypes {
    public static void main(String[] args) {

/* javada 2 farklı data type vardır.
a)boolean:sadece true veya false değerlerini alabilr.
b)char:tek characterli ?,*,+ gibi semboller için kullanılır.
c)byte:-128 ....+127 ye kadar olan değerlerdir.
d)short:-32000 değerleri
e)int:bütün büyük tam sayı değrleri
f)long:intten daha büyük tam sayı değerleri
g)float :ondalıklı sayılar için kullanılır.bir ondalıklı sayının float olduğunu belirlemek için sonuna f konur
h)double:büyük ondalıklı sayılar için kullanılır


//TASK 1999 yılında doğan birinin yaşını yazdırınız.



 */int dtarihi=1999;
        int buyil=2022;
        int yas=buyil-dtarihi;
        System.out.println(2022-1999);

        float f1=12.45f;
        float f2=23.56f;
        double boy=1.85;
        System.out.println(f1*f2);
        //TASK iki farklı byte tanımlayıp toplam farkı print edinz.
byte a=23 ;
byte b=44;
        System.out.println(a+b);

        //task iki farklı tam sayı türünde sayı tanımlayıp toplam farkı print et
int x=100;
byte y=22;
        System.out.println(y-x);
        //task tam sayı ve ondalıklı sayı tanımlayıp toplamı print ediniz

        int n=100;
        double m=17.99;
        System.out.println(n+m);
        //TASK Tam sayı ve char data type taanımlayıp toplamı print et

        int sayı=63;
        char money='$';
        System.out.println(sayı+money);
        //TASK ad soyad yasınızı print edin
    String adınız ="özlem";
     String soyadınız="çalık";
      int yasınız=34;
        System.out.println(adınız+soyadınız+yasınız);


    }



}
