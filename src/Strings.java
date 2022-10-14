public class Strings {
    public static void main(String[] args) {
        String ad ="Mücahid Cihad ";
        System.out.println(ad);
        
        System.out.println("kaç harfli = " +ad.length());
        System.out.println("orta harf = " +ad.charAt(3));
        System.out.println(ad.concat("GÖKÇE"));
        //boloan başlangıcı ve sonu doğrumu. dikkat java büyük harf küçüç harf duyarlı.
        System.out.println(ad.startsWith("M"));
        System.out.println(ad.endsWith("D"));
        //hece ayırma.
        char[] harf = new char[7];
        ad.getChars(2, 7, harf, 0);
        System.out.println(harf);
        //harf kaçıncı sırada.
        System.out.println(ad.indexOf("a"));
        System.out.println(ad.lastIndexOf("a"));

        String yeniHiza = ad.replace(' ', '_');
        System.out.println(yeniHiza);

        String cahid = ad.substring(2, 7);
        System.out.println(cahid);

        //split ile ayırırken splite("BOŞLUK") KULLANMAK GEREK
        for(String kelime : ad.split(" ")){
            System.out.println(kelime);
        }
        //BÜYÜK harfle yaz küçük harfle yaz.
        System.out.println(ad.toLowerCase());
        System.out.println(ad.toUpperCase());


        // Trim başındaki ve sonundaki boşlukları siler.
        String adFull ="       _Mücahid   Cihad   GÖKÇE_       ";
        System.out.println(adFull.trim());
    }
}
