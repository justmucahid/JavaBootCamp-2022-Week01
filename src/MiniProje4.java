public class MiniProje4 {
    public static void main(String[] args) {
        
        int sayiA= 1184;
        int sayiB= 1210; 
        int totalA= 0;
        int totalB= 0;
        
        for(int i=1;i<sayiA;i++){
            if( sayiA % i ==0 ){
                //System.out.println(i);
                totalA= i+ totalA;
            }
        }
        System.out.println(totalA);

        for(int e=1;e<sayiB;e++){
            if( sayiB % e ==0 ){
                //System.out.println(e);
                totalB= e+ totalB;
            }
        }
        System.out.println(totalB);

        /*if(sayiA==totalB){
            System.out.println("kardesler");
        }else if(sayiB==totalA){
            System.out.println("bunlar da kardes");
        }else{
            System.out.println("ama bunlar kades degil");
        }*/

        //2'nci yöntem...
        if(sayiA==totalB && sayiB==totalA){
            System.out.println("bunlar knk");
        }else{
            System.out.println("ama bunlar knk değil");
         }
         //2'nci yöntem...Eğer ikisinden biri sağlanırsa.
        if(sayiA==totalB ||sayiB==totalA){
            System.out.println("galiba bunlar arkadaşlar");
        }else{
            System.out.println("galiba bunlar arkadaş değiler");
         }
                 
     }
}
