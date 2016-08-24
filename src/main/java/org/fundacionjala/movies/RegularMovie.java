package org.fundacionjala.movies;

/**
 * Created by AngelaValdez on 8/24/2016.
 */
public class RegularMovie extends Movie {
    public RegularMovie(String title) {
        super(title);
    }

    public double calculateAmount(int daysRented) {
        double thisAmount = 2;
        if (daysRented > 2)
            thisAmount += (daysRented - 2) * 1.5;
        return thisAmount;
    }

    public int calculateFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
