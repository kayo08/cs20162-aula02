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

public class piTest{
    
    @Test (expected = IllegalArgumentException.class)
    public void nMen1(){
        operacoes.pi(-2);
    }
    
    @Test
    public void piExpec3(){
        assertEquals (3, operacoes.pi(4));
    }

}
