package org.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link ChildrenMovie}
 */
public class ChildrenMovieTest {

    private Movie childrenMovie;
    private static final double PRECISION = 0.0001;

    @Before
    public void setUp(){
        final String movieName = "Tangled";
        childrenMovie = new ChildrenMovie(movieName);
    }

    @Test
    public void test_calculatesTheAmountInChildrenMovie_whenRenterDaysAreMoreThanThree(){
        final double expectedAmount = 3;
        final int renterDays = 4;
        assertEquals(expectedAmount, childrenMovie.calculateAmount(renterDays), PRECISION);
    }

    @Test
    public void test_calculatesTheAmountInChildrenMovie_whenRenterDaysAreLessThanThree(){
        final double expectedAmount = 1.5;
        final int renterDays = 2;
        assertEquals(expectedAmount, childrenMovie.calculateAmount(renterDays), PRECISION);
    }

    @Test
    public void test_calculateFrequentRenterPointsInChildrenMovie() {
        final int expectedResult = 1;
        final int renterDays = 2;
        assertEquals(expectedResult, childrenMovie.calculateFrequentRenterPoints(renterDays));
    }
}
