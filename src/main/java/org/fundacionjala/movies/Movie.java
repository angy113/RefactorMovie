package org.fundacionjala.movies;

public abstract class Movie {

    private String _title;

    public Movie(String title) {
        _title = title;
    }

    public abstract double calculateAmount(int daysRented);
    public abstract int calculateFrequentRenterPoints(int daysRented);

    public String getTitle(){
        return _title;
    }
}
