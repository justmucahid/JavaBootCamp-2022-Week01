public class Switch {
    public static void main(String[] args) {
        char grade ='C';

        switch (grade) {
         case'A':
            System.out.println("gectin1");
            break;
         case'B':
         case'C':
            System.out.println("gectin2");
            break;
          
         case'F':
            System.out.println("kaldın");
            break; 
            default:
            System.out.println("geçersiz");
        }
        }
}
