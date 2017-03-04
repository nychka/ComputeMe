package com.example.nychka.adefault;

import org.junit.Assert;
import org.junit.Test;

public class ComputationTest {

    @Test
    public void add_whenAddTwoPositiveNumbers_shouldReturnSum(){
        Computation comp = new Computation();
        int sum = comp.add(2, 1);
        Assert.assertEquals(3, sum);
    }

    @Test
    public void add_whenTwoNegativeNumbers_sholdReturnSum() {
        Computation compy = new Computation();
        int sum = compy.add(-2, -3);
        Assert.assertEquals(-5, sum);
    }

    @Test
    public void subtract_whenTwoNumbers_shouldSubtract (){
        Computation minus = new Computation();
        int sub = minus.subtract(2,1);
        Assert.assertEquals(1,sub);
    }

    @Test(expected = Exception.class)
    public void divide_whenDividedByZero_shouldThrowException(){
        Computation comp = new Computation();
        comp.divide(2,0);
    }

    @Test
    public void divide_whenTwoNumbersDivided_shouldThrowException(){
        Computation comp = new Computation();
        int result = comp.divide(25,5);
        Assert.assertEquals(5, result);
    }

    @Test
    public void multiply_shouldMultiplyNumbers() {
        Computation comp = new Computation();
        int result = comp.multiply(2, 2);
        Assert.assertEquals(4, result);
    }
}
