package org.fundacionjala.movies;

class Rental {
    private final Movie movie;
    private final int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * Calculates the points according of the rental frequency.
     *
     * @return The total of the frequent points.
     */
    public int calculateFrequentRenterPoints() {
        return movie.calculateFrequentRenterPoints(daysRented);
    }

    /**
     * Calculates the amount to pay of the movie rented.
     *
     * @return The total amount of the movie rented.
     */
    public double calculateAmount() {
        return movie.calculateAmount(daysRented);
    }

    /**
     * Getter that obtains the days of the rent.
     *
     * @return The days of the rent.
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * Getter that obtains the movie of the rent.
     *
     * @return The movie in the rent.
     */
    public Movie getMovie() {
        return movie;
    }
}