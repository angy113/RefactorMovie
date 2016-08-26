package org.fundacionjala.movies;

class Rental {
    private final Movie _movie;
    private final int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    /**
     * Calculates the points according of the rental frequency.
     *
     * @return The total of the frequent points.
     */
    public int calculateFrequentRenterPoints() {
        return _movie.calculateFrequentRenterPoints(_daysRented);
    }

    /**
     * Calculates the amount to pay of the movie rented.
     *
     * @return The total amount of the movie rented.
     */
    public double calculateAmount() {
        return _movie.calculateAmount(_daysRented);
    }

    /**
     * Getter that obtains the days of the rent.
     *
     * @return The days of the rent.
     */
    public int getDaysRented() {
        return _daysRented;
    }

    /**
     * Getter that obtains the movie of the rent.
     *
     * @return The movie in the rent.
     */
    public Movie getMovie() {
        return _movie;
    }
}