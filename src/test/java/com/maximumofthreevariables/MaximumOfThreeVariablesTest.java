package com.maximumofthreevariables;

import org.junit.Assert;
import org.junit.Test;

public class MaximumOfThreeVariablesTest {

    @Test
    public void givenThreeIntegers_WhenMaximumFound_ShouldReturnThirdPositionValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables();
        Integer maximumValue = maximumOfThreeVariables.findMaximumValue(1, 2, 3);
        Assert.assertEquals((Object) 3,maximumValue);
    }

    @Test
    public void givenThreeIntegers_WhenMaximumFound_ShouldReturnSecondPositionValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables();
        Integer maximumValue = maximumOfThreeVariables.findMaximumValue(1, 3, 2);
        Assert.assertEquals((Object) 3,maximumValue);
    }

    @Test
    public void givenThreeIntegers_WhenMaximumFound_ShouldReturnFirstPositionValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables();
        Integer maximumValue = maximumOfThreeVariables.findMaximumValue(3, 2, 1);
        Assert.assertEquals((Object) 3,maximumValue);
    }

    @Test
    public void givenThreeFloatValues_WhenMaximumFound_ShouldReturnThirdPositionValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables();
        Float maximumValue = maximumOfThreeVariables.findMaximumValue(1.1f, 2.2f, 3.3f);
        Assert.assertEquals((Object) 3.3f,maximumValue);
    }

    @Test
    public void givenThreeFloatValues_WhenMaximumFound_ShouldReturnSecondPositionValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables();
        Float maximumValue = maximumOfThreeVariables.findMaximumValue(1.1f, 3.3f, 2.2f);
        Assert.assertEquals((Object) 3.3f,maximumValue);
    }

    @Test
    public void givenThreeFloatValues_WhenMaximumFound_ShouldReturnFirstPositionValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables();
        Float maximumValue = maximumOfThreeVariables.findMaximumValue(3.3f, 2.2f, 1.1f);
        Assert.assertEquals((Object) 3.3f,maximumValue);
    }

    @Test
    public void givenThreeStrings_WhenMaximumFound_ShouldReturnThirdPositionValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables();
        String maximumValue = maximumOfThreeVariables.findMaximumValue("aaa","bbb", "ccc");
        Assert.assertEquals((Object) "ccc",maximumValue);
    }

    @Test
    public void givenThreeStrings_WhenMaximumFound_ShouldReturnSecondPositionValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables();
        String maximumValue = maximumOfThreeVariables.findMaximumValue("aaa","ccc", "ccc");
        Assert.assertEquals((Object) "ccc",maximumValue);
    }

    @Test
    public void givenThreeStrings_WhenMaximumFound_ShouldReturnFirstPositionValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables();
        String maximumValue = maximumOfThreeVariables.findMaximumValue("ccc", "bbb", "aaa");
        Assert.assertEquals((Object) "ccc",maximumValue);
    }
}
