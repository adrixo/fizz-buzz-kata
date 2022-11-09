package fizzbuzz;

public class FizzBuzz {
    public static String convert(int input){
        if (input % 3 == 0) return "fizz";
        if (input % 5 == 0) return "buzz";
        return String.valueOf(input);
    }
}
