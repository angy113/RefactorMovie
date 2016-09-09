package org.fundacionjala.movies;

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
