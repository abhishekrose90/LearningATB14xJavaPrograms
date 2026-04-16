package ex_05_TernaryOperator;

public class Lab034_NestedTernary {
    public static void main(String[] args) {

        int age = 22;

        String result = (age > 18) ? (age > 25 ? "you can drink" : "you can go to Goa but you can't drink") : "no";
        System.out.println(result);
    }
}
