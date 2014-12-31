/**
 * Created by Christoph on 12/28/14.
 */
abstract class PrimeFactorGenerator {
    public static void main(String[] args) {
        PrimeFactorGenerator.generate(30);
    }

    private static void generate(int i) {
        for (int j = 0; j < i; j++) {
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
    }
}
