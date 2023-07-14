package lesson2;

public class FifthTask {
    public static void main(String[] args) {

        short a = 1994;
        short b = 28 * 9;

        int result = (int) (Math.pow(a + b, 2) / (Math.pow(a, 2) + 3 * Math.pow(b, 2)));
        System.out.println("result =" + result);

        int numerator = (int) Math.pow(a + b, 2);
        System.out.println("\nnumerator = " + numerator);
        int denominator = (int) (Math.pow(a, 2) + 3 * Math.pow(b, 2));
        System.out.println("denominator = " + denominator);
        int result1 = (int) numerator / denominator;
        System.out.println("result = " + result1);


        float resultF = (float) numerator / denominator;
        System.out.println("\nresultFloat =" + resultF);

        double resultD = (double) numerator / denominator;
        System.out.println("\nresultDouble =" + resultD);
    }
}
