package org.fundacionjala.movies;

public abstract class Movie {
    private static final int POINT = 1;
    private final String title;
    private final double amount;
    private final double increment;
    private final int limitDays;

    public Movie(String title, double amount, double increment, int limitDays) {
        this.title = title;
        this.amount = amount;
        this.increment = increment;
        this.limitDays = limitDays;
    }

    /**
     * Calculates the total amount to pay for a movie.
     *
     * @return The total amount to pay for a movie.
     */
    public double calculateAmount(int daysRented) {
        return daysRented > limitDays ?
                amount + ((daysRented - limitDays) * increment) : amount;
    }

    /**
     * Calculates the total points for a movie.
     *
     * @return The total points for a movie.
     */
    public int calculateFrequentRenterPoints(int daysRented) {
        return POINT;
    }

    /**
     * Obtains the movie title.
     *
     * @return The title of the movie.
     */
    public String getTitle() {
        return title;
    }
}
