package Test;

import Classes.ChildrenMovie;
import Classes.Customer;
import Classes.Movie;
import Classes.Rental;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by AngelaValdez on 8/23/2016.
 */
public class RentalTest {
    @Test
    public void verifyTheDaysRentedAreTheSameSent(){
        Rental rental = new Rental(new ChildrenMovie(""),5);
        Assert.assertEquals(rental.getDaysRented(),5);
    }
}
