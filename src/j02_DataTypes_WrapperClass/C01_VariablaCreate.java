package j02_DataTypes_WrapperClass;

public class C01_VariablaCreate {

    public static void main(String[] args) {
       //1.yol best practice(recomended)tavsiye edilen
       int yas=34;
       int maas=33000;
        System.out.println(yas);//34
        System.out.println(maas);//33000;
       // System.out.println("nur hanım başlangıç maaşı : "+maas);//33000;//
        int boy;

       boy=175;
        System.out.println(boy);

        int yevmiye,age,kilo;

        yevmiye=1000;
        age=33;
        kilo=56;
        System.out.println();
                int gunluk =1500 ,yil=2022 ,agırlık=99;
//TRICK BİR veriable sadece bir kez tanımlanabilir
        System.out.println(gunluk);
        System.out.println(yil);
        System.out.println(agırlık);
        gunluk=1800;//yeni degeri
        System.out.println("gunluk son degeri "+gunluk);
        System.out.println("gunlukdegeri:"+gunluk+"yıldegeri:");


        int a=100;
        System.out.println(a);
    }


}
