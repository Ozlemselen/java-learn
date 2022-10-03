package j02_DataTypes_WrapperClass;

public class C03_Concatenation {

    public static void main(String[] args) {


        String adınız ="özlem";
        String soyadınız="çalık";

        int a=7;
        int b=11;
        //birden çok string veriablelar ile farklı data type veriablelar +ile işleme alınırsa java birleştirme yaparak yeni bir string oluşturur
        System.out.println(adınız+soyadınız+a+b);
        System.out.println(a+adınız+soyadınız+b);
        System.out.println(a+b+adınız+soyadınız);
        System.out.println(" "+a+b);
        System.out.println( adınız+soyadınız+(a+b));
        System.out.println((a+b)+adınız+soyadınız);
        System.out.println(adınız+(a-b)+(a-b));


        char ch='1';
        System.out.println(adınız+ch);
        System.out.println(a+ch+adınız);
        System.out.println(adınız+(ch+b));
        System.out.println(a+adınız+ch);

    }
}
