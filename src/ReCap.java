public class ReCap {
    public static void main(String[] args) {
        double[] torba = {1.1,1.5,7.8,9.99};
        double max = torba[0];
        double total = 0;

        for(double list:torba){
            System.out.println(list);
            total = list + total;

            if(max<list){
                max = list;
            }
            

        }
        System.out.println("toplam sayı = " + total);
        System.out.println("enbüyük = " + max);
    }
}
