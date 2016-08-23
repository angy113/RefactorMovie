package Test;

import Classes.*;
import org.junit.Assert;
import org.junit.Test;
/**
 * Created by AngelaValdez on 8/23/2016.
 */
public class CustomerTest {

    @Test
    public void verifyTheCustomerAddedIsTheSame(){
        Customer customer = new Customer("Angy");
        Assert.assertEquals(customer.getName(),"Angy");
    }

}
