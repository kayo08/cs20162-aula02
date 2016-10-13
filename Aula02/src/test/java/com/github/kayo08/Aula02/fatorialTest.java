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

public class fatorialTest {
    
    @Test (expected = IllegalArgumentException.class)
    public void nMenor1(){
        operacoes.fatorial(-2);
    }
    
    @Test
    public void fatorial2 (){
        assertEquals (2, operacoes.fatorial(2));
    }
    
}
