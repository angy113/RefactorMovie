package org.fundacionjala.movies;

public abstract class Movie {

    private String _title;

    public Movie(String title) {
        _title = title;
    }

    /**
     * Calculates the total amount to pay for a movie.
     *
     * @return The total amount to pay for a movie.
     */
    public abstract double calculateAmount(int daysRented);

    /**
     * Calculates the total points for a movie.
     *
     * @return The total points for a movie.
     */
    public abstract int calculateFrequentRenterPoints(int daysRented);

    /**
     * Obtains the movie title.
     *
     * @return The title of the movie.
     */
    public String getTitle() {
        return _title;
    }
}
