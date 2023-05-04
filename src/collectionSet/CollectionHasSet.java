package collectionSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionHasSet {

    public static void main(String[] arg){

        Set<String> set = new HashSet<>();
        set.add("jaya");
        set.add("jaya");
        set.add(null);
        set.add("jaya");
        set.add("jaya");
        set.add(null);

        System.out.println(set.toString());




      //  Set<Integer> firstFiveEvenNumbers = new HashSet<>();

        List<Integer> firstFiveEvenNumbers = new ArrayList<>();
        firstFiveEvenNumbers.add(2);
        firstFiveEvenNumbers.add(4);
        firstFiveEvenNumbers.add(6);
        firstFiveEvenNumbers.add(8);
        firstFiveEvenNumbers.add(10);

        Set<Integer> nextFiveEvenNumbers = new HashSet<>(firstFiveEvenNumbers);

        nextFiveEvenNumbers.add(12);
        nextFiveEvenNumbers.add(14);
        nextFiveEvenNumbers.add(16);
        nextFiveEvenNumbers.add(18);
        nextFiveEvenNumbers.add(20);

        System.out.println(nextFiveEvenNumbers);


       // Set<Integer> afterFiveEvenNumbers = new HashSet<>();
        List<Integer> afterFiveEvenNumbers = new ArrayList<>();

        afterFiveEvenNumbers.add(22);
        afterFiveEvenNumbers.add(24);
        afterFiveEvenNumbers.add(26);
        afterFiveEvenNumbers.add(28);
        afterFiveEvenNumbers.add(30);

        afterFiveEvenNumbers.addAll(nextFiveEvenNumbers);

        System.out.println(afterFiveEvenNumbers);






        Set<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(1);
        evenNumbers.add(2);
        evenNumbers.add(3);
        evenNumbers.add(4);
        evenNumbers.add(5);
        evenNumbers.add(6);
        evenNumbers.add(7);
        evenNumbers.add(8);
        evenNumbers.add(9);
        evenNumbers.add(10);
        boolean result = evenNumbers.remove(1);
        System.out.println(result);
        System.out.println(evenNumbers);

        Set<Integer> remove = new HashSet<>();
        remove.add(1);
        remove.add(3);
        remove.add(5);
        remove.add(7);
        remove.add(9);

        evenNumbers.removeAll(remove);
        System.out.println(evenNumbers);





    }
}
