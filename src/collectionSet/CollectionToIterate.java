package collectionSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class CollectionToIterate {
    public static void main(String[] arg){
        Set<String> topProgrammingLanguages = new HashSet<>();
        topProgrammingLanguages.add("#C");
        topProgrammingLanguages.add("Java");
        topProgrammingLanguages.add("C++");
        topProgrammingLanguages.add("Python");
        topProgrammingLanguages.add("GoLang");
        //Enhanced for loop
        for (String elements: topProgrammingLanguages){
            System.out.println(elements);
        }
//
    for(Iterator<String> iterator = topProgrammingLanguages.iterator(); iterator.hasNext();){
        String topProgramming = (String) iterator.next();
        System.out.println(topProgramming);
    }
    //
        Iterator<String> iterator = topProgrammingLanguages.iterator();
        while (iterator.hasNext()){
            String string = iterator.next();

            System.out.println(">>>>>>>>> "+string);
       }
        //
topProgrammingLanguages.forEach((element)->System.out.println("Foreach Loop : "+element));
//
        topProgrammingLanguages.stream().filter(element1->!"Java".equals(element1))
                .forEach(element1->System.out.println("    :"+element1));


    }
}
