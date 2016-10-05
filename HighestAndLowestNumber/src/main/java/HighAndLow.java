import java.util.Arrays;

public class HighAndLow {
    /**
     * Given numbers in a string; this method parse all the
     * String to convert it a numbers to finally obtain the
     * max and min numbers.
     *
     * @param numbers Are the numbers in string format like
     *                "1 2 -9 5"
     * @return The max and min number like "5 -9"
     */
    public static String highestAndLowest(String numbers) {
        return Arrays.asList(numbers.split(" ")).stream().mapToInt(element -> Integer.parseInt(element)).max().getAsInt() + " " +
                Arrays.asList(numbers.split(" ")).stream().mapToInt(element -> Integer.parseInt(element)).min().getAsInt();
    }

}
