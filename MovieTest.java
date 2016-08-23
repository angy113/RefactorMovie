package Test;

import Classes.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by AngelaValdez on 8/23/2016.
 */
public class MovieTest {
    @Test
    public void verifyTheAmountIsCalculatedInChildMovie(){
        Movie movie = new ChildrenMovie("Tangled");
        double amount = 1.5;
        Assert.assertEquals(movie.calculateAmount(3),amount,0.0001);
    }
    @Test
    public void verifyTheAmountIsCalculatedInRegularMovie(){
        Movie movie = new RegularMovie("Dyango");
        double amount = 2;
        Assert.assertEquals(movie.calculateAmount(2),amount,0.0001);
    }
    @Test
    public void verifyTheAmountIsCalculatedInReleaseMovie(){
        Movie movie = new ReleaseMovie("Suicide Squad");
        double amount = 6;
        Assert.assertEquals(movie.calculateAmount(2),amount,0.0001);
    }
}
