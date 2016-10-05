import org.junit.Test;

/**
 * Test for {@link DnaStrand}
 */
public class TestDNA {

    @Test
    public void verifyThatObtainTheDNAComplement() {
        final String expected = "TAACG";
        final String actual = DnaStrand.makeComplement("ATTGC");
    }

    @Test
    public void verifyThatObtainTheDNAComplementWithOtherValues() {
        final String expected = "CATA";
        final String actual = DnaStrand.makeComplement("GTAT");
    }
}
