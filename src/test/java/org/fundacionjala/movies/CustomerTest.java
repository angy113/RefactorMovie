package org.fundacionjala.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AngelaValdez on 8/23/2016.
 */

/**
 * Test for {@link Customer}
 */
public class CustomerTest {

    @Test
    public void test_theCustomerAddedIsTheSame(){
        Customer customer = new Customer("Angy");
        assertEquals(customer.getName(),"Angy");
    }

}
