/**
 * Created by Christoph on 12/28/14.
 */
abstract class PrimeFactorGenerator {
    public static void main(String[] args) {
        System.out.println("List of Prime Factors when n = 1");
        PrimeFactorGenerator.generate(1);
        System.out.println("List of Prime Factors when n = 30");
        PrimeFactorGenerator.generate(30);
        System.out.println("List of Prime Factors when n = 1000");
        PrimeFactorGenerator.generate(1000);
    }

    private static void generate(int i) {
        for (int j = 2; j < i; j++) {
            boolean isPrime = true;

            for (int k = 2; k < j; k++) {
                if (j % k == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                System.out.print(j + " ");
            }
        }
        System.out.println(" ");
    }
}
