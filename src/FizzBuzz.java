/**
 * Created by Christoph on 12/28/14.
 */
abstract class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz.run();
    }

    private static void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
