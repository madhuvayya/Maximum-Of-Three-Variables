package com.maximumofthreevariables;

import org.junit.Assert;
import org.junit.Test;

public class MaximumOfThreeVariablesTest {

    @Test
    public void givenThreeIntegers_WhenMaximumFound_ShouldReturnMaximumValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables();
        Integer maximumValue = maximumOfThreeVariables.findMaximumValue(1, 2, 3);
        Assert.assertEquals((Object) 3,maximumValue);
    }

    @Test
    public void givenThreeIntegersDifferentOrder_WhenMaximumFound_ShouldReturnMaximumValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables();
        Integer maximumValue = maximumOfThreeVariables.findMaximumValue(1, 3, 2);
        Assert.assertEquals((Object) 3,maximumValue);
    }
}
