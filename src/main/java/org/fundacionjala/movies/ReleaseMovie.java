package org.fundacionjala.movies;

/**
 * Created by AngelaValdez on 8/24/2016.
 */
public class ReleaseMovie extends Movie {

    public ReleaseMovie(String title) {
        super(title);
    }

    public double calculateAmount(int daysRented) {
        double baseAmount = 3;
        return daysRented* baseAmount;
    }

    public int calculateFrequentRenterPoints(int daysRented) {
        if (daysRented > 1)
            return 2;
        else
            return 1;
    }
}
