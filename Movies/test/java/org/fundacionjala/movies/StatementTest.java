package org.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link Statement}
 */
public class StatementTest {

    private Statement statement;
    private static final double PRECISION = 0.0;

    @Before
    public void setUp(){
        final String customerName = "Angy";
        final int rentalDays = 2;
        statement = new Statement(new Customer(customerName));
        statement.addRental(new Rental(new ReleaseMovie("The Revenant"),rentalDays));
        statement.addRental(new Rental(new RegularMovie("Terminator"), rentalDays));
    }

    @Test
    public void test_statementCalculateTheTotalAmountOfAllMoviesAddedByACustomer(){
        double expectedResult = 8;
        assertEquals(expectedResult, statement.calculateTotalAmount(), PRECISION);
    }

    @Test
    public void test_statementCalculateTheTotalFrequentRentalPointsOfAllMoviesAddedByACustomer(){
        double expectedResult = 3;
        assertEquals(expectedResult, statement.calculateTotalFrequentRenterPoints(), PRECISION);
    }

}
