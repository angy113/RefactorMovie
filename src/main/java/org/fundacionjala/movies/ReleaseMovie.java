package org.fundacionjala.movies;

/**
 * Created by AngelaValdez on 8/24/2016.
 */

public class ReleaseMovie extends Movie {

    public ReleaseMovie(String title) {
        super(title);
    }

    /**
     * {@inheritDoc}
     */
    public double calculateAmount(int daysRented) {
        double baseAmount = 3;
        return daysRented * baseAmount;
    }

    /**
     * {@inheritDoc}
     */
    public int calculateFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}
