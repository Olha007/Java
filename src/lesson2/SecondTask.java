package lesson2;

public class SecondTask {
    public static void main(String[] args) {

        int day = 28;
        int month = 9;
        float result = (month % day == 0) ? (month / (day + 1.0f)) : (month / (float) day);

        System.out.println("result = " + result);

        int fbin = Float.floatToRawIntBits(result);
        String fbins = String.format("%32s%n", Integer.toBinaryString(fbin)).replace(' ', '0');

        System.out.println(fbins);
        System.out.println("Sign = " + (fbin < 0 ? '-' : '+'));
        System.out.println("Exponent = " + fbins.substring(1, 9));
        System.out.println("Mantissa = " + fbins.substring(9, 32));

    }
}

