import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BankOCR {
    private static final Map<String, Integer> CELL_VALUES = new HashMap<String, Integer>();

    static {
        CELL_VALUES.put(" _ | ||_|", 0);
        CELL_VALUES.put("     |  |", 1);
        CELL_VALUES.put(" _  _||_ ", 2);
        CELL_VALUES.put(" _  _| _|", 3);
        CELL_VALUES.put("   |_|  |", 4);
        CELL_VALUES.put(" _ |_  _|", 5);
        CELL_VALUES.put(" _ |_ |_|", 6);
        CELL_VALUES.put(" _   |  |", 7);
        CELL_VALUES.put(" _ |_||_|", 8);
        CELL_VALUES.put(" _ |_| _|", 9);
    }

    /**
     * Reads the input lines and convert it in a pattern that
     * identify each number un one line.
     *
     * @param input Is all the text conformed by pipes and
     *              underscores in three lines tha form numbers.
     * @return An strings array with the number in one line.
     */
    public String[] get_numbers(String input) {
        String[] numbers = new String[]{"", "", "", "", "", "", "", "", ""};

        final int[] counter = {0};
        IntStream.rangeClosed(1, input.length())
                .forEach(index -> {
                    numbers[counter[0]] += input.charAt(index - 1);
                    if (index % 3 == 0) counter[0]++;
                    if (index % 27 == 0) counter[0] = 0;
                });

        return numbers;
    }

    /**
     * Based on the number code returns the real number in integer format.
     *
     * @param input The string that contains the number with pipes and underscores.
     * @return an integers array of all the numbers read.
     */
    public Integer[] parse_account_number(String input) {
        String[] numbers = get_numbers(input);
        return Stream.of(numbers).map(CELL_VALUES::get).collect(Collectors.toList()).toArray(new Integer[9]);
    }
}
