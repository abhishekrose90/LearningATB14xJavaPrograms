package ex_03_TypeCasting;

public class Lab032_Narrowing {
    public static void main(String[] args) {

        int val = 300;
        // first 300 will be converted into binary number in 0 and 1 form. then it will take the last 8 digit of binary number
       // byte b = val; //Narrowing -> Implicit Casting - valid? No
        byte b = (byte) val; // Narrowing -> Explicit Casting -> valid
        System.out.println(b);
    }
}
