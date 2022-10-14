public class MultiArrays {
    public static void main(String[] args) {
        String [] [] citys = new String [3] [3];

        citys [0] [0] = "İstanbul";
        citys [0] [1] = "Malatya";
        citys [0] [2] = "The Colossus of Rhodes";
        citys [1] [0] = "The Mausoleum of Halicarnassus";
        citys [1] [1] = "The Pyramids of Giza";
        citys [1] [2] = "The Temple of Artemis in Ephesus";
        citys [2] [0] = "The Statue of Zeus in Olympia";
        citys [2] [1] = "The Lighthouse of alexandria";
        citys [2] [2] = "the Hanging Gardens of Babylon";

        for(int i=0; i<=2; i++){
            System.out.println("----------------");
            for(int e=0;e<=2;e++){
                System.out.println(citys[i] [e]);
            }
        }


    }
}
