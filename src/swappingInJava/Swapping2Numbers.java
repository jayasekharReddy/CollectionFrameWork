package swappingInJava;

public class Swapping2Numbers {

    public static void main(String[] args){

        int a = 10, b=20;

        System.out.println("Before swapping values " + a + "  " + b);

//        int t = a;
//        a=b;
//        b=t;

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(" After Before swapping values " + a + "  " + b);



        String str = "jaya";

//        StringBuilder stringBuilder = new StringBuilder(str);

        StringBuffer stringBuilder = new StringBuffer(str); 
        stringBuilder.reverse();
      System.out.println(stringBuilder);




    }


}
