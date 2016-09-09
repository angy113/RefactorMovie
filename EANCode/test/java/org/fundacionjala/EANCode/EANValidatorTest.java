package org.fundacionjala.EANCode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Test for {@link EANValidator}
 */
public class EANValidatorTest {
    @Test
    public void test_EANCodeIsValid() {
        assertTrue(EANValidator.validate("9783815820865"));
    }

    @Test
    public void test_EANCodeIsInvalid() {
        assertFalse(EANValidator.validate("9783815820864"));
    }

    @Test
    public void test_EANCodeIsValidWhenSendTheSumIsDivisibleByTen() {
        assertTrue(EANValidator.validate("9783827317100"));
    }

}
