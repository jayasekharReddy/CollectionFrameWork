import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Collection<String> collection = new ArrayList<>();
        collection.add("jaya");
        collection.add("sekhar");
        collection.add("reddy");
        System.out.println(collection);

        collection.remove("reddy");
        System.out.println(collection);

        collection.forEach((element) ->{
            System.out.println(element);
        });

// List

        List<String> list = new ArrayList<>();
        list.add("Element1");
        list.add("Element1");
        list.add("Element2");
        list.add("Element3");
        System.out.println(list);

        list.add(null);
        list.add(null);
        System.out.println(list);

        // insertion order

        List<String> list1 = new ArrayList<>();
        list1.add("Element1");
        list1.add("Element2");
        list1.add("Element4");
        list1.add("Element3");
        list1.add("Element5");

        System.out.println(list1);

        // access elements in list

        System.out.println(list1.get(0));
        System.out.println(list1.get(3));



        List<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(400);
        list2.add(600);
        list2.add(300);
        list2.add(200);
        list2.add(500);

        System.out.println(list2);


        Collections.sort(list2);
        System.out.println(list2);

        Collections.reverse(list2);
        System.out.println(list2);




    }
}