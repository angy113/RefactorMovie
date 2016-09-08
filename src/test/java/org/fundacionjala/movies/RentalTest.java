package org.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link Rental}
 */
public class RentalTest {

    public static final double PRECISION = 0.0;
    private Rental rental;
    private Movie movie;
    @Before
    public void setUp(){
        final String movieName = "ARGO";
        movie = new RegularMovie(movieName);
        final int rentalDays = 5;
        rental = new Rental(movie, rentalDays);
    }

    @Test
    public void test_theDaysRentedAreTheSameSent(){
        final int expectedRentalDays = 5;
        assertEquals(expectedRentalDays,rental.getDaysRented());
    }

    @Test
    public void test_theMovieRentedAreTheSameSent(){
        final Movie expectedMovie = movie;
        assertEquals(expectedMovie,rental.getMovie());
    }

    @Test
    public void test_thatRentalCalculateTheTotalAmountAccordingTheMovieAndDays(){
        final double expectedResult = 6.5;
        assertEquals(expectedResult,rental.calculateAmount(), PRECISION);
    }

    @Test
    public void test_thatRentalCalculateTheFrequentRentalPointsAccordingTheMovieAndDays(){
        final int expectedResult = 1;
        assertEquals(expectedResult,rental.calculateFrequentRenterPoints());
    }
}