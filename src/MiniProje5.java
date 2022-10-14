public class MiniProje5 {
    public static void main(String[] args) {
        int[]number = new int[]{1,3,5,7,9};
        int bul =1;

        /*for(int list:number){
            //System.out.println(list);
            if(list==bul){
                System.out.println("var"); 
            
            }else{System.out.println("yok");}

        }*/

        //2'nci yol...
        boolean end = false;
        for(int list:number){
            if(list==bul){
                end = true;
                break;
            }
        }

        if(end){
            System.out.println("var");
        }else{System.out.println("yok");}
        
    }
}
