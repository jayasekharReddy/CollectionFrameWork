package dumiClass;

public class reverseAll {

    public static void main(String args[]) {

        int number = 12345;
        int remainder, revNumber = 0;

        while (number>0){

            remainder = number%10;

            number = number/10;

            revNumber = (revNumber*10)+remainder;

        }
        System.out.println("print reverse int  " + revNumber);


//        int number = 123456789;
//        int remainder, revNumber =0;
//
//        while (number>0){
//            remainder = number%10;
//            number = number/10;
//
//            revNumber = (revNumber*10)+remainder;
//        }
//
//         System.out.println(revNumber);


        String input = "Geeks for Geeks";

        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(input);

        // reverse StringBuilder input1
        input1.reverse();

        // print reversed String
        System.out.println(input1);

        String input5 = "jaya sekhar Reddy";

        StringBuilder inpu1 = new StringBuilder();

        inpu1.append(input5);

        inpu1.reverse();

        System.out.println(inpu1);





        String str = "jaya";

        StringBuilder nw1 = new StringBuilder();
// append a string into StringBuilder input1
        nw1.append(str);
        // reverse StringBuilder input1
        nw1.reverse();

        System.out.println(nw1);



        String try1 = "jayasekharreddy";

        char[] try2 = try1.toCharArray();

        for (int i=try2.length-1;i>=0;i--){

            System.out.print( try2[i]);

        }


        System.out.println();
        String input2 = "GeeksForGeeks";

        // convert String to character array
        // by using toCharArray
        char[] try3 = input2.toCharArray();

        for (int i = try3.length - 1; i >= 0; i--)
            System.out.print(try3[i]);
    }

    }

