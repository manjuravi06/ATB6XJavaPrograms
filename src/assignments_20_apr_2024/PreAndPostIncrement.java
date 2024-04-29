package assignments_20_apr_2024;

public class PreAndPostIncrement {

    public static void main(String[] args) {

        int a = 10;

        System.out.println(++a + a++ + a++);

        /*
        First operation : result = 11 , value of a = 11;
        Second operation : result = 11 , value of a = 12;
        Third operation : result = 12 , value of a = 13;
        Final value of result : 11+11+12 = 34;
         */

    }


}
