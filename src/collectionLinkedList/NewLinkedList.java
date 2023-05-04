package collectionLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class NewLinkedList {

    public static void main(String[] arg){
        LinkedList<String> topProgrammingLanguages = new LinkedList<>();
        topProgrammingLanguages.add("#C");
        topProgrammingLanguages.add("Java");
        topProgrammingLanguages.add("C++");
        topProgrammingLanguages.add("Python");
        topProgrammingLanguages.add("GoLang");


        Iterator<String> iterator = topProgrammingLanguages.iterator();

        while (iterator.hasNext()){
            String  prog = (String) iterator.next();

            System.out.println(prog);
        }

        topProgrammingLanguages.forEach((element) ->{
            System.out.println(">>>>>> "+element);
        });

        for (String prog1 : topProgrammingLanguages){
            System.out.println(">>>>>> "+prog1);
        }
    }
}
