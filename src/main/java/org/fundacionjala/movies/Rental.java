package org.fundacionjala.movies;

class Rental {
    private final Movie _movie;
    private final int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int calculateFrequentRenterPoints() {
        return _movie.calculateFrequentRenterPoints(_daysRented);
    }

    public double calculateAmount() {
        return _movie.calculateAmount(_daysRented);
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }
}