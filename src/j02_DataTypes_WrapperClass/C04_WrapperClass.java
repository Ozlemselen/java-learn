package j02_DataTypes_WrapperClass;

public class C04_WrapperClass {


    public static void main(String[] args) {

      String name="Haluk";
      int yas=33;
        System.out.println(name.toUpperCase());

        // non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
// ancak primitive data turlerinin boyle bir ozelligi yoktur
// primitive data turleri sadece degerleri saklarlar (container) ve hwerhangi bir özellik(method) vs bulundurmaz.
//Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
// olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
// ara çözüm imkanı sunmuştur.


        //TASK id ve tc string değerlerinin toplamını print eden kod yazınız

        String tc="1234455";
        String id="98765";

        System.out.println(tc+id);//concat birleştirme
        int yenitc=Integer.valueOf(tc); //tc string değerini integera çevirdi ve yeni tcye atandı
        System.out.println("yenitc = " + yenitc);
        int yeniId=Integer.valueOf(id);//id değerini integera çevirdi
        System.out.println("yeniId = " + yeniId);
        System.out.println(yeniId+yenitc);

        //String okulNo="234543A";

       // int yeniOkulNo=Integer.valueOf(okulNo);

      //  System.out.println("yeniOkulNo = " + yeniOkulNo);

        //TASK byte short int maximum ve minimum değerlerini print eden kod yazın

      byte maxbytedegeri=  Byte.MAX_VALUE;
      byte minbytedegeri=  Byte.MIN_VALUE;
        System.out.println("maxbytedegeri = " + maxbytedegeri);
        System.out.println("minbytedegeri = " + minbytedegeri);
      int maxintdegeri=  Integer.MAX_VALUE;
      int minintdegeri=  Integer.MIN_VALUE;
        System.out.println("maxintdegeri = " + maxintdegeri);
        System.out.println("minintdegeri = " + minintdegeri);


    }
}
