package org.fundacionjala.movies;

public class ChildrenMovie extends Movie {

    public ChildrenMovie(String title) {
        super(title);
    }

    /**
     * {@inheritDoc}
     */
    public double calculateAmount(int daysRented) {
        double thisAmount = 1.5;
        if (daysRented > 3)
            thisAmount += (daysRented - 3) * 1.5;

        return thisAmount;
    }

    /**
     * {@inheritDoc}
     */
    public int calculateFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
