package org.fundacionjala.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AngelaValdez on 8/23/2016.
 */
public class MovieTest {
    @Test
    public void verifyTheMovieAddedIsTheSame(){
        String movieName ="The Suicide Squad";
        Movie releaseMovie = new ReleaseMovie(movieName);
        assertEquals(releaseMovie.getTitle(),movieName);
    }

    @Test
    public void test_calculateFrequentRenterPoints_whenTrueIf() {
        Movie releaseMovie = new ReleaseMovie("The Suicide Squad");
        final int expectedResult = 2;
        final int actualResult = releaseMovie.calculateFrequentRenterPoints(2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test_calculateFrequentRenterPoints_whenFalseIf() {
        Movie releaseMovie = new ReleaseMovie("The Suicide Squad");
        final int expectedResult = 1;
        final int actualResult = releaseMovie.calculateFrequentRenterPoints(1);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void verifyTheAmountIsCalculatedInChildMovie(){
        Movie movie = new ChildrenMovie("Tangled");
        double amount = 1.5;
        int daysOfTheRent = 3;
        assertEquals(movie.calculateAmount(daysOfTheRent),amount,0.0001);
    }

    @Test
    public void verifyTheAmountIsCalculatedInRegularMovie(){
        Movie movie = new RegularMovie("Dyango");
        double amount = 2;
        int daysOfTheRent = 2;
        assertEquals(movie.calculateAmount(daysOfTheRent),amount,0.0001);
    }

    @Test
    public void verifyTheAmountIsCalculatedInReleaseMovie(){
        Movie movie = new ReleaseMovie("Suicide Squad");
        double amount = 6;
        int daysOfTheRent = 2;
        assertEquals(movie.calculateAmount(daysOfTheRent),amount,0.0001);
    }
}
