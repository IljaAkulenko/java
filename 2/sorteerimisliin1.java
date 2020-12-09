import java.util.ArrayList;

public class sorteerimisliin1 {

    public ArrayList sorteeri(int[] apples) {

        ArrayList out  = new ArrayList<>();
        ArrayList<Integer> small = new ArrayList<>();
        ArrayList<Integer> medium = new ArrayList<>();
        ArrayList<Integer> big = new ArrayList<>(); 
        
     
        for (int i = 0; i < apples.length; i++) {
           Integer apple = apples[i]; 
         if (apple <= 50) {
            small.add(apple); 
         } else if (apple >= 71) {
             big.add(apple); 
         } else {
             medium.add(apple);
         }
        }
        out.add(small);
        out.add(medium);
        out.add(big);
        return out;
    }
}
