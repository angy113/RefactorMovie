import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Test for {@link BankOCR}
 */
public class BankOCRTest {
    private static BankOCR bankOCR;

    @Before
    public void setUp(){
        bankOCR = new BankOCR();
    }

    @Test
    public void test_readNumbers(){
        String input =  " _  _  _  _  _  _  _  _  _ "+
                        "| || || || || || || || || |"+
                        "|_||_||_||_||_||_||_||_||_|";

        Integer[] account_number = bankOCR.parse_account_number(input);
        assertEquals(account_number,new Integer[]{0,0,0,0,0,0,0,0,0});

    }

}
