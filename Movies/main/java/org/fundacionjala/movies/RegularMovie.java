package org.fundacionjala.movies;

public class RegularMovie extends Movie {

    private static final double THIS_AMOUNT = 2;
    private static final double INCREMENT = 1.5;
    private static final int DAYS_LIMIT = 2;

    public RegularMovie(String title) {
        super(title, THIS_AMOUNT, INCREMENT, DAYS_LIMIT);
    }

    }
