import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EratosthenesPrimeSiever implements PrimeSiever {
    private int upperLimit;

    public EratosthenesPrimeSiever(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    @Override
    public boolean isPrime(int p) {
        if (p <= 1) {
            return false;
        }
        if (p == 2 || p == 3) {
            return true;
        }
        if (p % 2 == 0 || p % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= p; i += 6) {
            if (p % i == 0 || p % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void printPrimes() {
        for (int i = 0; i < upperLimit; i++) {
            if (isPrime(i) == true) {
                System.out.println(i  + " ist eine Primzahl");
            }
        }
    }
}
