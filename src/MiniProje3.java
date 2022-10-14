public class MiniProje3 {
    public static void main(String[] args) {

        int number = 6;
        int total = 0;
        
        for(int i=1; i<number;i++){

            if(number % i == 0){

                total= total+i;
                System.out.println(i);
        }  
       }
       if(total==number){
        System.out.println("evet");
       }else{
        System.out.println("hayır");
       }
  }
}