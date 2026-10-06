package no.ninni.logikk.tasks;

import java.math.BigInteger;

public class LargestPrimeFactorTask {
    public int getLargestPrimeFactor(BigInteger requestedNumber) {
        long[] factorData = getLargestPrimeFactorData(requestedNumber.longValue());
        long largestFactor = factorData[1];
        long factor = factorData[0];

        for (long i = 3; i * i <= factor; i += 2) {
            while (factor % i == 0) {
                largestFactor = i;
                factor /= i;
            }
        }

        if (factor > 1) {
            largestFactor = factor;
        }

        return (int) largestFactor;
    }

    private long[] getLargestPrimeFactorData(long factor) {
        long largestFactor = 0;
        while (factor % 2 == 0) {
            largestFactor = 2;
            factor /= 2;
        }
        return new long[] { factor, largestFactor };
    }
}
