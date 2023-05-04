package hasMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hasMapImpl {

    public static void main(String[] arg){

        Map<Integer, Student> names = new HashMap<Integer,Student>();
        names.put(1,new Student("jaya","sekhar"));
        names.put(2, new Student("reddy","jaya"));
        names.put(3, new Student("sri","murali"));
        names.put(4, new Student("sri","murali"));

        System.out.println(   names);
        System.out.println(names.values());

        System.out.println("   jayaaaaaaaaaaaaaa");


        System.out.println("newwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww");

        System.out.println("newwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww");



    }
}
