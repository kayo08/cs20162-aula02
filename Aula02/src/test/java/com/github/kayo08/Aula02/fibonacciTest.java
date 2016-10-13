/*
Copyright (c) 2016. Kayo Martins Freitas
 */

package com.github.kayo08.Aula02;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kayo Martins.
 */

public class fibonacciTest{
    
    @Test (expected = IllegalArgumentException.class)
    public void nNegativo (){
        operacoes.Fibonacci(-2);
    }
    
    
    @Test
    public void fibonacci6765(){
        assertEquals(6765, operacoes.Fibonacci(20));
    }
    

}
