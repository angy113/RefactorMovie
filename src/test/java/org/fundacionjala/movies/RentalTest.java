package org.fundacionjala.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RentalTest {

    @Test
    public void verifyTheDaysRentedAreTheSameSent(){
        Rental rental = new Rental(new ChildrenMovie("Tangled"),5);
        assertEquals(rental.getDaysRented(),5);
    }

    @Test
    public void verifyThatRentalCalculateTheTotalAmountAccordingTheMovies(){
        Rental rental = new Rental(new ChildrenMovie("Tangled"),5);
        double expectedResult = 4.5;
        assertEquals(rental.calculateAmount(),expectedResult,0.0);
    }

    @Test
    public void verifyThatRentalCalculateTheFrequentRentalPointsAccordingTheMovieAndDays(){
        Rental rental = new Rental(new ReleaseMovie("Suicide Squad"),5);
        int expectedResult = 2;
        assertEquals(rental.calculateFrequentRenterPoints(),expectedResult);
    }
}