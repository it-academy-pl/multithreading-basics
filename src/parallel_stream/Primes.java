package parallel_stream;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class Primes {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("Number of primes in given range is: " + calculateNumberOfPrimes(1000000));
        long end = System.currentTimeMillis();
        long timeDifference = end - start;
        System.out.println("operation took " + timeDifference + " ms");
    }
    static long calculateNumberOfPrimes(long n) {
        return LongStream.rangeClosed(2, n)
                .parallel()
                .mapToObj(BigInteger::valueOf)
                .filter(i -> i.isProbablePrime(100))
                .count();
    }

}
