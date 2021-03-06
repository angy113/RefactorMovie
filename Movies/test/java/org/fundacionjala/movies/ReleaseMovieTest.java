package org.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link ReleaseMovie}
 */
public class ReleaseMovieTest {

    private Movie releaseMovie;
    private static final double PRECISION = 0.0001;

    @Before
    public void setUp(){
        final String movieName ="Suicide Squad";
        releaseMovie = new ReleaseMovie(movieName);
    }

    @Test
    public void test_calculatesTheAmountInReleaseMovie(){
        final double expectedAmount = 6;
        final int daysOfTheRent = 2;
        assertEquals(expectedAmount,releaseMovie.calculateAmount(daysOfTheRent), PRECISION);
    }

    @Test
    public void test_calculatesTheFrequentRentalPoints_whenDaysAreMoreThanOne(){
        final int expectedResult = 2;
        final int renterDays = 2;
        assertEquals(expectedResult, releaseMovie.calculateFrequentRenterPoints(renterDays));
    }

    @Test
    public void test_calculatesTheFrequentRentalPoints_whenDaysAreLessThanOne(){
        final int expectedResult = 1;
        final int renterDays = 1;
        assertEquals(expectedResult, releaseMovie.calculateFrequentRenterPoints(renterDays));
    }
}
