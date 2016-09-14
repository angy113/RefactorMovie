package org.fundacionjala.EANCode;

import java.util.stream.IntStream;

public class EANValidator {

    /**
     * Compares if the thirteenth digit of the code is the correct.
     *
     * @param number Is the String of thirteen numbers.
     * @return true if the digit is correct, otherwise returns false.
     */
    public static boolean validate(String number) {
        final int correctCheckSum = obtainCheckSum(number);
        return Character.getNumericValue(number.charAt(number.length()-1)) == correctCheckSum;
    }

    /**
     * Sums the numbers of the string following this rule:
     * If the number is in pair position, it is converted to the
     * same number multiplied per three.
     * If the number is in odd position, its value is maintained.
     * At the end the new numbers are summed.
     *
     * @param number Is the String of thirteen numbers.
     * @return The total sum of the numbers till the twelve position.
     */
    private static int calculateSum(String number) {
        return (int) IntStream.range(1, number.length())
                .limit(number.length()-1)
                .mapToDouble(index -> index % 2 == 0 ? Character.getNumericValue(number.charAt(index - 1)) * 3 : Character.getNumericValue(number.charAt(index - 1)))
                .sum();
    }

    /**
     * Calculates the real value of the thirteenth position of the
     * number string based in the sum of the twelve digits before.
     * If the sum is divisible by ten the checksum is 0, otherwise
     * is ten minus the sum mod 10.
     *
     * @param number Is the String of thirteen numbers.
     * @return The result of the checksum (thirteenth digit).
     */
    private static int obtainCheckSum(String number) {
        final int digitsSum = calculateSum(number);
        return digitsSum % 10 == 0 ? 0 : 10 - (digitsSum % 10);
    }
}
