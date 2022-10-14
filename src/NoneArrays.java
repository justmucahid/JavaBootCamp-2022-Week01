public class NoneArrays {
    public static void main(String[] args) {
        // [] bu sembol array yani dizi demektir. bu hem string hemde int için geçerlidir.
        //String [] talebeler = {"tlb1","tlb2""tlb3"}
        String [] talebe = new String[4];
        talebe[0]= "ebuBekir";
        talebe[1]= "ömer";
        talebe[2]= "osman";
        talebe[3]= "ali";  
        
        for(int i=0; i<talebe.length;i=i+1){
            System.out.println(talebe[i]);
        }
        System.out.println("-------------------");

        for(String halife:talebe){
            System.out.println(halife); 
        }



    }
}
