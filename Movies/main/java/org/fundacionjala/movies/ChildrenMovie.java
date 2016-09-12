package org.fundacionjala.movies;

public class ChildrenMovie extends Movie {

    private static final double THIS_AMOUNT = 1.5;
    private static final double INCREMENT = 1.5;
    private static final int DAYS_LIMIT = 3;

    public ChildrenMovie(String title) {
        super(title, THIS_AMOUNT, INCREMENT, DAYS_LIMIT);
    }

}
