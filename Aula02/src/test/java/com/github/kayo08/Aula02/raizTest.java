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

public class raizTest{
    
    @Test (expected = IllegalArgumentException.class)
    public void nMenor0_iNeg(){
        operacoes.Raiz(-1, -5);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void nMenor0(){
        operacoes.Raiz(-1, 4);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void iNeg(){
        operacoes.Raiz(4, -5);
    }
    
    @Test
    public void raiz2 (){
        assertEquals (2, operacoes.Raiz(4, 5));
    }
    

}
