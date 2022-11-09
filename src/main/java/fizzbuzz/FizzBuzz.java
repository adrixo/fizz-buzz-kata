package fizzbuzz;

public class FizzBuzz {
    public static String convert(int input){
        if (isMultipleOf3(input)  && isMultipleOf5(input))
            return "fizzbuzz";
        if (isMultipleOf3(input))
            return "fizz";
        if (isMultipleOf5(input))
            return "buzz";
        return String.valueOf(input);
    }

    private static boolean isMultipleOf5(int input) {
        return input % 5 == 0;
    }

    private static boolean isMultipleOf3(int input) {
        return input % 3 == 0;
    }
}
