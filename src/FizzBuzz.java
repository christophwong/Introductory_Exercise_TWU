/**
 * Created by Christoph on 12/28/14.
 */
abstract class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz.run();
    }

    private static void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 == 0){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
