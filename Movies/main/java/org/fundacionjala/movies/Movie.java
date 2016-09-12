package org.fundacionjala.movies;

public abstract class Movie {

    private final String _title;
    private final double _amount;
    private final double _increment;
    private final int _limitDays;

    private static final int POINT = 1;

    public Movie(String title, double amount, double increment, int limitDays) {
        _title = title;
        _amount = amount;
        _increment = increment;
        _limitDays = limitDays;
    }

    /**
     * Calculates the total amount to pay for a movie.
     *
     * @return The total amount to pay for a movie.
     */
    public double calculateAmount(int daysRented){
        return daysRented > _limitDays?
            _amount + ((daysRented - _limitDays) * _increment): _amount;
    }

    /**
     * Calculates the total points for a movie.
     *
     * @return The total points for a movie.
     */
    public int calculateFrequentRenterPoints(int daysRented){
        return POINT;
    }

    /**
     * Obtains the movie title.
     *
     * @return The title of the movie.
     */
    public String getTitle() {
        return _title;
    }
}
