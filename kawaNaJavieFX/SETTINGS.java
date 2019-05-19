public class SETTINGS {

    static String[] names = {
            "LAVAZZA QUALITA ORO 1KG",
            "LA BRASIIIANA MARFISA 1KG",
            "Kawa Kopi Luwak Sumatra 150g",
            "Aerobie AeroPress",
            "Bialetti MOKA EXPRESS 6TZ",
            "Chemex Glass Handle",
            "BOSCH MKM 6003 CZARNY",
            "Młynek do kawy SENCOR SCG 2051BK",
            "Comandante C40 MK3 Nitro Iron Heart"
    };

    static double[] prices = {
            50.47,
            69.9,
            145,
            99,
            92,
            139.30,
            65,
            74.99,
            980
    };

    //inStock[0] = number of Items
    static int[] inStock = {100, 100, 100, 100, 100, 100, 100, 100, 100};

    static void returnToStock(int index){
        inStock[index] = inStock[index] + 1;
    }

    public static void takeFromStock(int index){
        inStock[index] = inStock[index] - 1;
    }

    static void printstock(){
        for (int i:inStock
             ) {
            System.out.print(i + ", ");
        }
    }



}
