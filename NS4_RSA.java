import java.math.BigInteger;
import java.math.BigDecimal;

public class NS4_RSA {
    public static void main(String[] args) {
        int p, q, n, z, d = 0, e, i;
        int msg = 12;
        double c;
        BigInteger msgback;
        p = 3;
        q = 11;
        n = p * q;
        z = (p - 1) * (q - 1);
        System.out.println("The value of z = " + z);

        e = calculatePublicKeyExponent(z);
        System.out.println("The value of e = " + e);

        d = calculatePrivateKeyExponent(e, z);
        System.out.println("The value of d = " + d);

        c = encryptMessage(msg, e, n);
        System.out.println("Encrypted message is: " + c);

        msgback = decryptMessage(c, d, n);
        System.out.println("Decrypted message is: " + msgback);
    }

    static int calculatePublicKeyExponent(int z) {
        int e = 2;
        while (e < z) {
            if (gcd(e, z) == 1) {
                break;
            }
            e++;
        }
        return e;
    }

    static int calculatePrivateKeyExponent(int e, int z) {
        int d = 0;
        for (int i = 0; i <= 9; i++) {
            int x = 1 + (i * z);
            if (x % e == 0) {
                d = x / e;
                break;
            }
        }
        return d;
    }

    static int gcd(int e, int z) {
        if (e == 0)
            return z;
        else
            return gcd(z % e, e);
    }

    static double encryptMessage(int msg, int e, int n) {
        return (Math.pow(msg, e)) % n;
    }

    static BigInteger decryptMessage(double c, int d, int n) {
        BigInteger N = BigInteger.valueOf(n);
        BigInteger C = BigDecimal.valueOf(c).toBigInteger();
        return C.pow(d).mod(N);
    }
}
