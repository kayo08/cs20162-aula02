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

public class logaritmoNaturalTest {
    
    @Test (expected = IllegalArgumentException.class)
    public void nMen1_kMen2 (){
        operacoes.logaritmoNatual(-1, 1);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void nMenor1 (){
        operacoes.logaritmoNatual(-1, 4);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void kMenor2 (){
        operacoes.logaritmoNatual(2, 1);
    }
    
    @Test
    public void logNat1 (){
        assertEquals(6, operacoes.logaritmoNatual(2, 4));
    }
}
