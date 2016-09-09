package org.fundacionjala.StringSearching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchEngine {
    /**
     * Parse the haystack searching the coincidences with the needle.
     * The searching is realized following a pattern that replaces all
     * the "_" (wildcard) character with any letter.
     *
     * @param needle   Is the word with wildcards ("_") to search.
     * @param haystack Is the string where to find coincidences.
     * @return The position where the coincidence was found, otherwise
     * returns -1.
     */
    public static int find(String needle, String haystack) {
        String regNeedle = "\\Q" + needle.replaceAll("_", "\\\\E.\\\\Q") + "\\E";
        Matcher m = Pattern.compile(regNeedle).matcher(haystack);
        return m.find() ? m.start() : -1;
    }
}
