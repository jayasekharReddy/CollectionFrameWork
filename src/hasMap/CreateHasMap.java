package hasMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CreateHasMap {
    public static void main(String[] arg){


        Map<String,Integer> numberMapping = new HashMap<>();
        numberMapping.put("one",1);
        numberMapping.put("two",2);
        numberMapping.put("three",3);
        numberMapping.put("four",4);
        numberMapping.put("five",5);
        numberMapping.put(null,6);
        numberMapping.put("seven",null);

        System.out.println(numberMapping);
        System.out.println(numberMapping.isEmpty());
        System.out.println(numberMapping.size());


        if(numberMapping.containsKey("four")){
            System.out.println("exit ");
        }else {
            System.out.println("not exit");
        }

        if (numberMapping.containsValue(1)){
            System.out.println("exit ");
        }else {
            System.out.println("not exit");
        }

        System.out.println(numberMapping.get("one"));

        System.out.println(numberMapping.get(null));

        System.out.println(numberMapping.remove(null));
        System.out.println(numberMapping);

        System.out.println(numberMapping.remove("two",2));
        System.out.println(numberMapping);



        numberMapping.keySet();
        System.out.println(numberMapping);

        Set<String> keys = numberMapping.keySet();
        System.out.println(">>>>>> Keys : " +keys);


        for (Map.Entry<String,Integer> entry : numberMapping.entrySet()) {

            System.out.println("key>> : " + entry.getKey()+"  value : " + entry.getValue());

        }

        Set<Map.Entry<String,Integer>> entries = numberMapping.entrySet();

        Iterator<Map.Entry<String,Integer>> iterator = entries.iterator();

        while (iterator.hasNext()){
            Map.Entry<String,Integer>  enty = iterator.next();
            System.out.println("key>> : " + enty.getKey()+"  value : " + enty.getValue());

        }

        numberMapping.forEach((K,V) ->{
            System.out.println("key---     -> :  " + K + "  value--> : " +V);

        });



    }
}
