package org.fundacionjala.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
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
