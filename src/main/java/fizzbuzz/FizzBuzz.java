package fizzbuzz;

public class FizzBuzz {
    public static String convert(int input){
        if (input == 3) return "fizz";
        if (input == 5) return "buzz";
        return String.valueOf(input);
    }
}
