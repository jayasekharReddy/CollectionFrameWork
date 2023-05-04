package collectionLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CreateLinkedList {

    public static void main (String[] arg){
        LinkedList<String> topProgrammingLanguages = new LinkedList<>();
        topProgrammingLanguages.add("#C");
        topProgrammingLanguages.add("Java");
        topProgrammingLanguages.add("C++");
        topProgrammingLanguages.add("Python");
        topProgrammingLanguages.add("GoLang");


        System.out.println(">>>>>>>> :: "+topProgrammingLanguages);


        topProgrammingLanguages.add(2,"sql");

        System.out.println(">>>>>>>> ::1"+topProgrammingLanguages);

        topProgrammingLanguages.addFirst("sap");
        System.out.println(">>>>>>>> ::2"+topProgrammingLanguages);

        topProgrammingLanguages.addLast("sql++");
        System.out.println(">>>>>>>> ::2"+topProgrammingLanguages);


     String programmingLang =  topProgrammingLanguages.getFirst();
        System.out.println(">>>>>>>> ::3 "+programmingLang);

        String programmingLang1 =  topProgrammingLanguages.getLast();
        System.out.println(">>>>>>>> ::4 "+programmingLang1);

        String programmingLang2 =  topProgrammingLanguages.getLast();
        System.out.println(">>>>>>>> ::5 "+programmingLang2);


        String programmingLang3 =  topProgrammingLanguages.get(2);
        System.out.println(">>>>>>>> ::4 "+programmingLang3);

        for(String element : topProgrammingLanguages){
            System.out.println(">>>>>>>> ::5 "+element);
        }


        String new1 = topProgrammingLanguages.remove();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>::"+new1);
        System.out.println(topProgrammingLanguages);


        String new2 = topProgrammingLanguages.removeFirst();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>11111111111  ::   "+new2);

        System.out.println("111::"+topProgrammingLanguages);

        String new3 = topProgrammingLanguages.removeLast();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>2222222222222  ::   "+new3);

        System.out.println("222::"+topProgrammingLanguages);


        topProgrammingLanguages.remove("java");

        topProgrammingLanguages.clear();

        System.out.println("5555555555::"+topProgrammingLanguages);

//        String new4 = topProgrammingLanguages.removeAll(t);
//        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>2222222222222  ::   "+new3);
//
//        System.out.println("222::"+topProgrammingLanguages);





    }
}
