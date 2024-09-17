public class EratosthenesPrimeSiever implements PrimeSiever{
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

    }
}
