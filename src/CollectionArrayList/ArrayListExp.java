package CollectionArrayList;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListExp {
    public static void main(String[] arg){


        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);

        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);

        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);

        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);


        System.out.println(firstTenPrimeNumbers);


        List<String> topProgrammingLanguages = new ArrayList<>();

        System.out.println(">>>>>>>> ::"+topProgrammingLanguages.isEmpty());

        topProgrammingLanguages.add("#C");
        topProgrammingLanguages.add("Java");
        topProgrammingLanguages.add("C++");
        topProgrammingLanguages.add("Python");
        topProgrammingLanguages.add("GoLang");

        System.out.println("Here are the top  " + topProgrammingLanguages.size() + "   Programming Languages");


        String secondTopProgrammingLanguage = topProgrammingLanguages.get(3);

        System.out.println("secondTopProgrammingLanguage  :: " + secondTopProgrammingLanguage);

      //  topProgrammingLanguages.set(4,"java");

        topProgrammingLanguages.add(2,"javaaaaaaaaaaaa");

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>"+topProgrammingLanguages);


        List<String> courses = Arrays.asList("#c", "java", "Python");

        for(int i = 0; i<courses.size();i++){
            System.out.println(courses.get(i));
        }

        for (String course : courses){

            System.out.println(course);
        }


        topProgrammingLanguages.add(null);
        topProgrammingLanguages.add(null);

        System.out.println(">>>>>>>>>>>>>>>>>>> "+topProgrammingLanguages);

}



















    }

