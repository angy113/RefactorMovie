package Classes;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by AngelaValdez on 8/23/2016.
 */
public class TotalRental {

    private int renterPoints;
    private Vector _rentals;

    public TotalRental(){
        this.renterPoints = 0;
        _rentals = new Vector();
    }

    public void addRental(Rental rental){
        _rentals.addElement(rental);
        renterPoints+= rental.getMovie().getPoints();
    }
    public double getTotal(){
        double totalAmount=0;
        Enumeration rentals = _rentals.elements();

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            totalAmount +=  each.getMovie().calculateAmount(each.getDaysRented());
        }
        return totalAmount;
    }

    public String printTotal(){
        String result = "";
        Enumeration rentals = _rentals.elements();

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            double thisAmount=each.getMovie().calculateAmount(each.getDaysRented());
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    String.valueOf(thisAmount) + "\n";
        }
        result += "Amount owed is " + String.valueOf(getTotal()) +
                "\n";
        result += "You earned " + String.valueOf(renterPoints)
                +
                " frequent renter points";
        return result;
    }
//
//    public double calculateAmountAccordingTheMovieType(Rental rental){
//        double thisAmount = 0;
//        switch (rental.getMovie().getPriceCode()) {
//            case REGULAR:
//                thisAmount += 2;
//                if (rental.getDaysRented() > 2)
//                    thisAmount += (rental.getDaysRented() - 2) * 1.5;
//                break;
//            case NEW_RELEASE:
//                thisAmount += rental.getDaysRented() * 3;
//                break;
//            case CHILDREN:
//                thisAmount += 1.5;
//                if (rental.getDaysRented() > 3)
//                    thisAmount += (rental.getDaysRented() - 3) * 1.5;
//                break;
//        }
//        return thisAmount;
//    }
}
