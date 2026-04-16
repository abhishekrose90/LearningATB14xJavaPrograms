package ex_04_Operators;

public class Lab023_ConcatenationInterview {
    public static void main(String[] args) {

        String first_name = "abhishek";
        String last_name = "rose";

        int a = 15;
        int b = 12;

        System.out.println(first_name + last_name + a + b);
        System.out.println(a +b + first_name + last_name);

        System.out.println(first_name + last_name + (a+b));
    }
}
