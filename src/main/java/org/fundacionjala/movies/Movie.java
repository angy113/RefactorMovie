package org.fundacionjala.movies;

public abstract class Movie {

    private String _title;

    public Movie(String title) {
        _title = title;
    }

    /**
     * Calculates the amount.
     *
     * @param daysRented Are the days of the rent.
     * @return The total amount to pay of the rent.
     */
    public abstract double calculateAmount(int daysRented);

    /**
     * Calculates the points of the rent.
     *
     * @param daysRented Are the days of the rent.
     * @return The total frequent points of the rent.
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
