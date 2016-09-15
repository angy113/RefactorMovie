package org.fundacionjala.movies;

import java.util.ArrayList;
import java.util.List;

public class Statement {

    private static final String TAB = "\t";
    private static final String BREAK_LINE = "\n";
    private final Customer customer;
    private final List<Rental> rentals;

    public Statement(Customer customer) {
        this.customer = customer;
        rentals = new ArrayList<Rental>();
    }

    /**
     * Add a new movie rental to the list of all rentals.
     *
     * @param rental Is the new rental to add that contains
     *               the rental days and the movie.
     */
    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    /**
     * Create the header, detail and totals of the customer voucher.
     *
     * @return The built voucher in string format.
     */
    public String obtainVoucher() {
        return obtainVoucherHeader() + obtainRentalDetail() + obtainTotals();
    }

    /**
     * Calculates the total points of the customer according to his rentals.
     *
     * @return The total frequent rentals points.
     */
    public int calculateTotalFrequentRenterPoints() {
        return rentals.stream().mapToInt(Rental::calculateFrequentRenterPoints).sum();
    }

    /**
     * Calculates the total amount to pay of all rentals of a customer.
     *
     * @return The total amount to pay of all rentals of a customer.
     */
    public double calculateTotalAmount() {
        return rentals.stream().mapToDouble(Rental::calculateAmount).sum();
    }

    /**
     * Built the header of the voucher that contains the customer name.
     *
     * @return The header of the voucher in string format.
     */
    private String obtainVoucherHeader() {
        StringBuilder result = new StringBuilder();
        result.append("Rental Record for ");
        result.append(customer.getName());
        result.append(BREAK_LINE);
        return result.toString();
    }

    /**
     * Built the detail of rental price according the movies rented
     * and the time.
     *
     * @return The detail built in String format.
     */
    private String obtainRentalDetail() {
        final StringBuilder rentalDetail = new StringBuilder();
        rentals.forEach((final Rental rental) -> rentalDetail.append(obtainMovieDetail(rental)));
        return rentalDetail.toString();
    }

    /**
     * Built the rental detail of an specific movie.
     *
     * @param rental is the object that contains the movie and the
     *               days of the rental.
     * @return the detail of an specific movie rental in string format.
     */
    private String obtainMovieDetail(Rental rental) {
        StringBuilder result = new StringBuilder();
        result.append(TAB);
        result.append(rental.getMovie().getTitle());
        result.append(TAB);
        result.append(rental.calculateAmount());
        result.append(BREAK_LINE);
        return result.toString();
    }

    /**
     * Built the footer of the voucher that contains the totals.
     *
     * @return The footer of the voucher in string format.
     */
    private String obtainTotals() {
        StringBuilder result = new StringBuilder();
        result.append("Amount owed is ");
        result.append(calculateTotalAmount());
        result.append(BREAK_LINE);
        result.append("You earned ");
        result.append(calculateTotalFrequentRenterPoints());
        result.append(" frequent renter points");
        return result.toString();
    }

}
