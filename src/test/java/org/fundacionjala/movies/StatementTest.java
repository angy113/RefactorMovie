package org.fundacionjala.movies;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Created by AngelaValdez on 8/24/2016.
 */
public class StatementTest {

    @Test
    public void verifyStatementCalculateTheTotalAmountOfAllMoviesAddedByACustomer(){
        Statement statement = new Statement("Angy");
        statement.addRental(new Rental(new ReleaseMovie("The Revenant"),2));
        statement.addRental(new Rental(new RegularMovie("Terminator"), 2));
        double expectedResult = 8;
        assertEquals(statement.calculateTotalAmount(),expectedResult,0.0);
    }

    @Test
    public void verifyStatementCalculateTheTotalFrequentRentalPointsOfAllMoviesAddedByACustomer(){
        Statement statement = new Statement("Angy");
        statement.addRental(new Rental(new ReleaseMovie("The Revenant"),2));
        statement.addRental(new Rental(new RegularMovie("Terminator"), 2));
        double expectedResult = 3;
        assertEquals(statement.calculateTotalFrequentRenterPoints(),expectedResult,0.0);
    }

}
