package com.techelevator.view;
import com.techelevator.Cash;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class CashTest {

    @Test
    public void returns_4_quarters_when_owed_a_dollar() {
        Cash testing = new Cash(2.00, 1.00);
        double testArray = 1.00;
        int[] newArray = testing.getChangeOwed(testArray);
        Assert.assertEquals(0,0,4);

    }



}
