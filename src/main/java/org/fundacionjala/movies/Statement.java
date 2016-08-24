package org.fundacionjala.movies;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AngelaValdez on 8/24/2016.
 */
public class Statement {
    private final Customer customer;
    private final List<Rental> rentals = new ArrayList<Rental>();

    private static final String BREAK_LINE = "\n";

    public Statement (String customerName){
        customer = new Customer(customerName);
    }

    public void addRental(Rental rental){
        rentals.add(rental);
    }

    public String obtainVoucher(){
        return obtainVoucherHeader() + obtainRentalDetail() + obtainTotals();
    }

    private String obtainVoucherHeader() {
        StringBuilder result = new StringBuilder();
        result.append("Rental Record for ");
        result.append(customer.getName());
        result.append(BREAK_LINE);
        return result.toString();
    }
    private String obtainRentalDetail() {
        String rentalDetail = "";
        for (Rental rental : rentals) {
            rentalDetail += obtainMovieDetail(rental);
        }
        return  rentalDetail;
    }

    private String obtainMovieDetail(Rental rental){
        StringBuilder result = new StringBuilder();
        result.append("\t");
        result.append(rental.getMovie().getTitle());
        result.append("\t");
        result.append(rental.calculateAmount());
        result.append(BREAK_LINE);
        return result.toString();
    }

    private String obtainTotals(){
        StringBuilder result = new StringBuilder();
        result.append("Amount owed is ");
        result.append(calculateTotalAmount());
        result.append(BREAK_LINE);
        result.append("You earned ");
        result.append(calculateTotalFrequentRenterPoints());
        result.append(" frequent renter points");
        return result.toString();
    }

    public int calculateTotalFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : rentals) {
            // add frequent renter points
            frequentRenterPoints += rental.calculateFrequentRenterPoints();
        }
        return frequentRenterPoints;
    }

    public double calculateTotalAmount() {
        double totalAmount = 0;
        for (Rental rental : rentals) {
            //determine amounts for each line
            totalAmount += rental.calculateAmount();
        }
        return totalAmount;
    }

}
