import java.util.ArrayList; // Puudus import
public class OunaSorteerija2 {
    public static void main(String[] args) {
        int [] apples = {29, 70, 85, 77, 55, 44, 33, 98, 90, 47, 22, 44, 55, 37, 65};
        int [] apples2 = {29, 70, 85, 77, 55, 44, 33};
        sorteerimisliin1 sorteerija = new sorteerimisliin1();
        
         ArrayList<Integer> values = sorteerija.sorteeri(apples);
        System.out.println(values);

        ArrayList<Integer> values2 = sorteerija.sorteeri(apples2);

        System.out.println("Values2 > " + values2);
   }
}
