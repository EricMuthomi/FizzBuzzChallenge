public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("Write a program that outputs numbers from 1 to 100… with a catch:\n" +
                "\n" +
                "For multiples of 3, print Fizz instead of the number.\n" +
                "For the multiples of 5, print Buzz.\n" +
                "For numbers which are multiples of both 3 and 5, print FizzBuzz.");

        fizzBuzzTest();
    }

    private static void fizzBuzzTest() {
        for(int i = 1; i<=100; i++){
            if (i % 3 ==0 && i % 5 ==0){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }

            else {
                System.out.println(i);
            }
        }
    }
}
