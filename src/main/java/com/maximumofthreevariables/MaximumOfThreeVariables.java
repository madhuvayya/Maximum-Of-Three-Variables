package com.maximumofthreevariables;

public class MaximumOfThreeVariables<E extends Comparable> {

    E x;
    E y;
    E z;

    public MaximumOfThreeVariables(E x,E y,E z) {
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public E testMaximum(){
        MaximumOfThreeVariables<E> eMaximumOfThreeVariables = new MaximumOfThreeVariables<E>(x, y, z);
        return eMaximumOfThreeVariables.findMaximumValue();
    }

    public E findMaximumValue() {
        E max = x;
        if(y.compareTo(max)>0)
            max = y;
        if(z.compareTo(max)>0)
            max = z;
        return max;
    }
}
