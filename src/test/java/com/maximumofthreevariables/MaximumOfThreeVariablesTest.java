package com.maximumofthreevariables;

import org.junit.Assert;
import org.junit.Test;

public class MaximumOfThreeVariablesTest {

    @Test
    public void givenThreeIntegers_WhenMaximumFound_ShouldReturnThirdPositionValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables(1,2,3);
        Integer maximumValue = (Integer) maximumOfThreeVariables.testMaximum();
        Assert.assertEquals((Integer) 3,maximumValue);
    }

    @Test
    public void givenThreeIntegers_WhenMaximumFound_ShouldReturnSecondPositionValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables(1,3,2);
        Integer maximumValue = (Integer) maximumOfThreeVariables.testMaximum();
        Assert.assertEquals((Object) 3,maximumValue);
    }

    @Test
    public void givenThreeIntegers_WhenMaximumFound_ShouldReturnFirstPositionValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables(3,2,1);
        Integer maximumValue = (Integer) maximumOfThreeVariables.testMaximum();
        Assert.assertEquals((Object) 3,maximumValue);
    }

    @Test
    public void givenMoreThanThreeIntegers_WhenMaximumFound_ShouldReturnFirstPositionValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables(3,2,1,9,10,8,7);
        Integer maximumValue = (Integer) maximumOfThreeVariables.testMaximum();
        Assert.assertEquals((Object) 10,maximumValue);
    }

    @Test
    public void givenThreeFloatValues_WhenMaximumFound_ShouldReturnThirdPositionValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables(1.1f, 2.2f, 3.3f);
        Float maximumValue = (Float) maximumOfThreeVariables.testMaximum();
        Assert.assertEquals((Object) 3.3f,maximumValue);
    }

    @Test
    public void givenThreeFloatValues_WhenMaximumFound_ShouldReturnSecondPositionValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables(1.1f, 3.3f, 2.2f);
        Float maximumValue = (Float) maximumOfThreeVariables.testMaximum();
        Assert.assertEquals((Object) 3.3f,maximumValue);
    }

    @Test
    public void givenThreeFloatValues_WhenMaximumFound_ShouldReturnFirstPositionValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables(3.3f, 2.2f, 1.1f);
        Float maximumValue = (Float) maximumOfThreeVariables.testMaximum();
        Assert.assertEquals((Object) 3.3f,maximumValue);
    }

    @Test
    public void givenMoreThanThreeFloatValues_WhenMaximumFound_ShouldReturnFirstPositionValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables(3.3f, 2.2f, 1.1f,4.5f,2.3f,1.8f);
        Float maximumValue = (Float) maximumOfThreeVariables.testMaximum();
        Assert.assertEquals((Object) 4.5f,maximumValue);
    }

    @Test
    public void givenThreeStrings_WhenMaximumFound_ShouldReturnThirdPositionValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables("aaa","bbb","ccc");
        String maximumValue = (String) maximumOfThreeVariables.testMaximum();
        Assert.assertEquals((Object) "ccc",maximumValue);
    }

    @Test
    public void givenThreeStrings_WhenMaximumFound_ShouldReturnSecondPositionValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables("aaa","ccc", "ccc");
        String maximumValue = (String) maximumOfThreeVariables.testMaximum();
        Assert.assertEquals((Object) "ccc",maximumValue);
    }

    @Test
    public void givenThreeStrings_WhenMaximumFound_ShouldReturnFirstPositionValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables("ccc", "bbb", "aaa");
        String maximumValue = (String) maximumOfThreeVariables.testMaximum();
        Assert.assertEquals((Object) "ccc",maximumValue);
    }

    @Test
    public void givenMoreThanThreeStrings_WhenMaximumFound_ShouldReturnFirstPositionValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables("ccc", "bbb","ddd", "aaa","abc");
        String maximumValue = (String) maximumOfThreeVariables.testMaximum();
        Assert.assertEquals((Object) "ddd",maximumValue);
    }
}
