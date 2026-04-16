package ex_06_IncrementDecrementOperator;

public class Lab029_Ex1 {
    public static void main(String[] args) {

        int a = 12;
        int b = ++a;
        int c = a++ + --b;
        System.out.println(c);
    }
}
