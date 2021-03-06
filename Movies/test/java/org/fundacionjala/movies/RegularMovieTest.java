package org.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link RegularMovie}
 */
public class RegularMovieTest {
    public static final double PRECISION = 0.0001;
    private Movie regularMovie;

    @Before
    public void setUp(){
        final String movieName ="Terminator";
        regularMovie = new RegularMovie(movieName);
    }

    @Test
    public void test_calculatesFrequentRenterPoints() {
        final int expectedResult = 1;
        final int renterDays = 2;
        assertEquals(expectedResult, regularMovie.calculateFrequentRenterPoints(renterDays));
    }

    @Test
    public void test_calculatesTheAmountInRegularMovie_whenRenterDaysAreTwoOrLess(){
        final double expectedAmount = 2;
        final int renterDays = 2;
        assertEquals(expectedAmount, regularMovie.calculateAmount(renterDays), PRECISION);
    }

    @Test
    public void test_calculatesTheAmountInRegularMovie_whenRenterDaysAreMoreThanTwo(){
        final double expectedAmount = 3.5;
        final int renterDays = 3;
        assertEquals(expectedAmount, regularMovie.calculateAmount(renterDays), PRECISION);
    }
}
