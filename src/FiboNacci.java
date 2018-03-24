import java.math.BigInteger;

public class FiboNacci {
    /**
     * @param args
     */
    public static void main(String[] args) {

        BigInteger fibannoci1= new BigInteger("1");
        BigInteger fibannoci2= new BigInteger("1");
        BigInteger fibannocisum1= new BigInteger("0");
        BigInteger fibannocisum2= new BigInteger("0");
        int zaehler = 1;
        System.out.println(zaehler + ". Fibonacciahl " + fibannoci1);
        zaehler++;
        while (zaehler < 1000000) {
            fibannocisum1 = fibannoci1.add(fibannoci2);
            System.out.println(zaehler + ". Fibonacciahl " + fibannocisum1);
            zaehler++;
            fibannoci1 = fibannocisum1;

            fibannocisum2 = fibannoci1.add(fibannoci2);
            System.out.println(zaehler + ". Fibonacciahl " + fibannocisum2);
            zaehler++;
            fibannoci2 = fibannocisum2;


        }
    }

}
//bi3 = bi1.add(bi2);