package com.maximumofthreevariables;

import java.util.Arrays;

public class MaximumOfThreeVariables<E extends Comparable> {

    E[] variables;

    public MaximumOfThreeVariables(E ...variables) {
        this.variables = variables;
    }

    public E testMaximum(){
        MaximumOfThreeVariables<E> eMaximumOfThreeVariables = new MaximumOfThreeVariables<E>(variables);
        return eMaximumOfThreeVariables.findMaximumValue();
    }

    public E findMaximumValue() {
        Arrays.sort(variables);
        return variables[variables.length-1];
    }
}
