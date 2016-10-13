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

public class mdcTest {
    
    @Test (expected = IllegalArgumentException.class)
    public void aMenorb (){
        operacoes.mDC(2, 4);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void bNegativo (){
        operacoes.mDC(2, -4);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void aMenBnegativo (){
        operacoes.mDC(-4, -2);
    }
    
    @Test
    public void mdc5 (){
        assertEquals (5, operacoes.mDC(55, 25));
    }

}
