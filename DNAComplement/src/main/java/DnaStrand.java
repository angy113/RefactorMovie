public class DnaStrand {
    /**
     * Find the complement of DNA String replacing:
     * the 'T' instead of 'A' and vice versa.
     * the 'C' instead of 'G' and vice versa.
     *
     * @param dna Is a String that contain the DNA
     *            to be replaced.
     * @return the String with the new values of the
     * replacement.
     */
    public static String makeComplement(String dna) {
        final String[] cadena = {""};
        dna.chars().forEach(c -> {
            cadena[0] += c == 'A' ? 'T' : c == 'T' ? 'A' : c == 'C' ? 'G' : c == 'G' ? 'C' : ' ';
        });
        return cadena[0];
    }
}
