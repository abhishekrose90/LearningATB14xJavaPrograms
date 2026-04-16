package ex_05_TernaryOperator;

public class Lab037_RealAgeClassification {
    public static void main(String[] args) {

        String user_input = args[0]; //68
//        String user_input = Abhishek_args[];
        System.out.println(user_input);
        System.out.println(user_input instanceof String);

        // Input - String
        //String - Int

        int age = Integer.parseInt(user_input);

        String result = (age < 18) ? "Minor" : (age <= 60) ? "Adult" : "Sr. Citizen";
        System.out.println(result);
    }
}
