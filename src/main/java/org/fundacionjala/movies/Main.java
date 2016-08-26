package org.fundacionjala.movies;

public class Main {
    public static void main(String[] args) {
        Statement statement = new Statement(new Customer("Angy"));
        statement.addRental(new Rental(new ReleaseMovie("The Revenant"),2));
        statement.addRental(new Rental(new RegularMovie("Terminator"), 2));
        System.out.println(statement.obtainVoucher());
    }
}
