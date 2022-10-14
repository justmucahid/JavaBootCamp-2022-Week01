public class Loops {
    public static void main(String[] args) {
        int j= 5;
        String doWhile = "Do While döngüsü bitti";
        //Do-while şart uymasa bile 1 kere çalışır.
        do{
            System.out.println(j);
            j++;
        }while(j<4);
        System.out.println(doWhile);
        //While loop
        int n=1;
        String whileloop = "While döngüsü bitti";
        while(n<5){
          System.out.println(n);
            n++;
        }
        System.out.println(whileloop);

        //for loop;
          String forloop = "for döngüsü bitti";
          String forloop1 = "for tek sayı döngüsü bitti";
        for(int i=1;i<5;i++){
          System.out.println(i);
        } 
        System.out.println(forloop);
        //i teksayı olarak artırmak istersek
        for(int i=1;i<10;i+=2){
           System.out.println(i);
        }
        System.out.println(forloop1);
    }
}