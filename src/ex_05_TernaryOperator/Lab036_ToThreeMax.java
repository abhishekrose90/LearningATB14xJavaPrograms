package ex_05_TernaryOperator;

public class Lab036_ToThreeMax {
    public static void main(String[] args) {

        int n1 = 2;
        int n2 = 9;
        int n3 = -11;

//      LBF ->  Logic Building Formula

//        Step 1 -> Find the inputs and outputs datatype
//        I/O -> n1, n2, n3 -> int
//        O/P -> int - max number  or string we can message with max number

//        Step 2 -> Rough Logic, Think about it
//        n1 > n2 && n1 > n3 -> n1
//        n2 > n3 && n2 > n1 -> n2
//        n3
 
//        Dry Run - Program

        int max = (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);
        System.out.printf("max is %d", max);
    }
}
