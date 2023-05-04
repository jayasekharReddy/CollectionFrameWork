package sortingExpinJava;

import com.sun.source.tree.LambdaExpressionTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortList {

public static void main(String[] arg) {
    List<EmployeeList> employeeLists = new ArrayList<EmployeeList>();
    employeeLists.add(new EmployeeList(1, "jaya", 23, 10000));
    employeeLists.add(new EmployeeList(2, "sekhar", 24, 20000));
    employeeLists.add(new EmployeeList(3, "reddy", 25, 30000));
    employeeLists.add(new EmployeeList(4, "swathi", 26, 40000));
    employeeLists.add(new EmployeeList(5, "sri", 27, 50000));

    Collections.sort(employeeLists, new Mysort());
    System.out.println(employeeLists);


    Collections.sort(employeeLists, new Comparator<EmployeeList>() {
        @Override
        public int compare(EmployeeList o1, EmployeeList o2) {
            return (int) (o1.getName().compareTo(o2.getName()));
        }


    });


    System.out.println("Lam  : " + employeeLists  );


    Collections.sort(employeeLists,((o1, o2) ->  (int) (o1.getName().compareTo(o2.getName()))));
    System.out.println("LambdaExpression :" +employeeLists);


    Collections.sort(employeeLists,((o1, o2) ->  (int) (o2.getSalary() - o1.getSalary())));
System.out.println("LambdaExpression :" +employeeLists);

}



}




 class Mysort implements Comparator<EmployeeList>{


    @Override
    public int compare(EmployeeList o1, EmployeeList o2) {
        //return (int) (o1.getSalary() - o2.getSalary());    Ascending Order
        return (int) (o2.getSalary() - o1.getSalary());    // Descending Order

    }

}