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

public class numeroHarmonicoTest {
    
    @Test (expected = IllegalArgumentException.class)
    public void nMenor1 (){
        operacoes.numeroHarmonico(-1);
    }
    
    @Test
    public void numHarm1 (){
        assertEquals (1, operacoes.numeroHarmonico(5));
    }
    
}
