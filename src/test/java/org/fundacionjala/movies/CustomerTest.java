package org.fundacionjala.movies;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Created by AngelaValdez on 8/23/2016.
 */
public class CustomerTest {

    @Test
    public void verifyTheCustomerAddedIsTheSame(){
        Customer customer = new Customer("Angy");
        assertEquals(customer.getName(),"Angy");
    }

}
