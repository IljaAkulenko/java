import java.util.ArrayList; // Puudus import

public class OunaSorteerija {
    public static void main(String[] args) {

        // https://www.w3schools.com/java/java_arrays.asp
        int [] apples = {29, 70, 85, 77, 55, 44, 33, 98, 90, 47, 22, 44, 55, 37, 65};

        // https://www.w3schools.com/java/java_arraylist.asp
        ArrayList<Integer> small = new ArrayList<>(); 
        ArrayList<Integer> medium = new ArrayList<>();
        ArrayList<Integer> big = new ArrayList<>(); 

         ArrayList test = new ArrayList<>(); // valikuline. (Saab sisaldada ka muud)
        // https://www.w3schools.com/java/java_for_loop.asp
        for (int i = 0; i < apples.length; i++) {
            Integer apple = apples[i]; // Apple muutuja tüüp oli puudu Integer
            if (apple <= 50) {
                small.add(apple); // Add meetod vajab midagi mida lisada,
            } else if (apple >= 71) {
                big.add(apple); // Add meetod vajab midagi mida lisada,
            } else {
                medium.add(apple); // Add meetod vajab midagi mida lisada,
            }
        }
        test.add(small);
        test.add(medium);
        test.add(big);
        System.out.println("Test" + test);
        System.out.println("Small " + small);
        System.out.println("Medium " + medium);
        System.out.println("Big " + big);
        System.out.println(test);
   }
}

// PS Koodistiil peaks olema selline, et on kensti loetav. 