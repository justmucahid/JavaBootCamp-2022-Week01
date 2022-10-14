public class MiniProje1 {
    public static void main(String[] args) {
        int torba=23;
        //int remainder= torba % 2;

        //benim yazdığım kod.
        /*System.out.println(remainder);

        int i = remainder;

        if(i>=1){
            System.out.println("Sayı Asaldır");
        }else if(torba==2){
            System.out.println("2 Asal Sayıdır");
        }else{System.out.println("Asal Değildir");}*/


        boolean isPrime = true;
        //bug yani özel durum için
        if(torba==1){
            System.out.println("olmaz");
        }else if(torba<1){
            System.out.println("geçersiz");
            return;
        }
        //Kararlı Yazım
        for(int i=2; i<torba ;i++){
            if (torba % i == 0){
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println("Evet. Bu bir asal sayıdır");
        }else{System.out.println("Hayır. Bu bir asal sayı değildir");}
    }
}
 