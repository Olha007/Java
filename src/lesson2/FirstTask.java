package lesson2;

public class FirstTask {
    public static void main(String[] args) {

        int day = 28;
        int month = 9;
        int sum = day + month;

        System.out.println("sum=" + sum);
        System.out.printf("sumdec= %d, sumhex= %x, sumbin= %s%n",
                sum, sum, Integer.toBinaryString(sum));

        int negativeSum = -sum;
        System.out.printf("negativeSumdec= %d, negativeSumhex= %x, negativeSumbin=%s%n",
                negativeSum, negativeSum, Integer.toBinaryString(negativeSum));
    }
}
