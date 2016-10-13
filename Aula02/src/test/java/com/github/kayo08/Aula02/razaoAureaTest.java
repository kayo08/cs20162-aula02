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

public class razaoAureaTest{
    
    @Test (expected = IllegalArgumentException.class)
    public void xNeg_yMenX_kNeg (){
        operacoes.razaoAurea(-2, -4, -3);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void xNeg(){
        operacoes.razaoAurea(-2, 4, 3);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void yMenX (){
        operacoes.razaoAurea(5, 3, 2);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void kNeg (){
        operacoes.razaoAurea(2, 4, -3);
    }
    
    @Test
    public void rzAur1 (){
        assertEquals (1, operacoes.razaoAurea(10, 15, 25));
    }
}
