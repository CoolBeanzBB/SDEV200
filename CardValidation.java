import java.util.Scanner;

public class CardValidation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a credit card number as a long integer: ");
        long creditCardNumber = input.nextLong();

        if (isValid(creditCardNumber)) {
            System.out.println(creditCardNumber + " is valid");
        } else {
            System.out.println(creditCardNumber + " is invalid");
        }
        input.close();
    }
    
    public static boolean isValid(long number) {
        int total = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        return (total % 10 == 0) &&
                (prefixMatched(number, 4, 1) ||
                prefixMatched(number, 5, 1) ||
                prefixMatched(number, 37, 2) ||
                prefixMatched(number, 6, 1));
    }

    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        String numStr = Long.toString(number);

        for (int i = numStr.length() - 2; i >= 0; i -= 2) {
            int digit = Integer.parseInt(String.valueOf(numStr.charAt(i)));
            sum += getDigit(digit * 2);
        }
        return sum;
    }
    public static int getDigit(int number) {
        if (number < 10) {
            return number;
        } else {
            return (number % 10) + (number / 10);
        }
    }
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        String numStr = Long.toString(number);

        for (int i = numStr.length() - 1; i >= 0; i -= 2) {
            int digit = Integer.parseInt(String.valueOf(numStr.charAt(i)));
            sum += digit;
        }
        return sum;
    }
    public static boolean prefixMatched(long number, int prefix, int k) {
        String numStr = Long.toString(number);
        String prefixStr = Integer.toString(prefix);

        if (k > numStr.length()) {
            return false;
        }
        String numPrefix = numStr.substring(0, k);
        return numPrefix.equals(prefixStr);
    }
}
