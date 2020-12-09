import java.util.ArrayList; // Puudus import

public class sorteerimisliin1 {

    public ArrayList sorteeri(int[] apples) {

        ArrayList out  = new ArrayList<>();
        ArrayList<Integer> small = new ArrayList<>();
        ArrayList<Integer> medium = new ArrayList<>();
        ArrayList<Integer> big = new ArrayList<>(); 
        
     
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
        out.add(small);
        out.add(medium);
        out.add(big);
        return out;
    }
}