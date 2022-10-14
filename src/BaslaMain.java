public class BaslaMain {
    //src = kaynak ve main başlangıç metodudur.
   public static void main(String[] args) {
    System.out.println("cihad");
// Değişken ismi camelCase olmalı. Ve yine java key sensivity bir dildir.
    String nedirBu ="Doğru Nedir";
    System.out.println(nedirBu);
    int para = 1;
    System.out.println(nedirBu + "=" + para);
    //boolean enflasyon = true;

    double paraLira = 1.0;
    double paraDolar = 1.0;

    String svgok = "";
    if(paraLira>paraDolar){ //false or true or not
        svgok = "down.svg";
        System.out.println(svgok);
    } else if(paraLira<paraDolar){
        svgok = "up.svg";
        System.out.println(svgok);
    }
    else {
        svgok = "equal.svg";
        System.out.println(svgok);
    }
    //array chapter
    String[] kartlar = {"enpara","papara","garanti"};

    for (int i = 0; i < kartlar.length; i++){
        System.out.println(kartlar[i]);
    }

   }     
}
