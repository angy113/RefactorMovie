package org.fundacionjala.movies;

public class ReleaseMovie extends Movie {

    private static final double THIS_AMOUNT = 3;
    private static final double INCREMENT = 0;
    private static final int DAYS_LIMIT = 1;

    public ReleaseMovie(String title) {
        super(title, THIS_AMOUNT, INCREMENT, DAYS_LIMIT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculateAmount(int daysRented) {
        double baseAmount = 3;
        return daysRented * baseAmount;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int calculateFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}
