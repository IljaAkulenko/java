import java.util.ArrayList; // Impordi java.util.ArrayList selleks, et kasutada arrayList teegi.

public class OunaSorteerija {
    public static void main(String[] args) {

        // https://www.w3schools.com/java/java_arrays.asp
        int [] apples = {29, 70, 85, 77, 55, 44, 33, 98, 90, 47, 22, 44, 55, 37, 65};

        // https://www.w3schools.com/java/java_arraylist.asp
        ArrayList<Integer> small = new ArrayList<>(); 
        ArrayList<Integer> medium = new ArrayList<>();
        ArrayList<Integer> big = new ArrayList<>(); 

    
        // https://www.w3schools.com/java/java_for_loop.asp
        for (int i = 0; i < apples.length; i++) {
            Integer apple = apples[i]; // Lisame  muutuja nimega apple selleks, et hiljem võrrelda numbriga.
            if (apple <= 50) {
                small.add(apple); // Add meetod võimaldab lisada elemendi massiivi.
            } else if (apple >= 71) {
                big.add(apple);
            } else {
                medium.add(apple); 
            }
        }
        System.out.println("Small " + small); // Prindime välja massiivi väärtused
        System.out.println("Medium " + medium);
        System.out.println("Big " + big);
        System.out.println(test);
   }
}

// PS Koodistiil peaks olema selline, et on kensti loetav. 
