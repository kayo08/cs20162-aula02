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

public class modTest{
    
    @Test (expected = IllegalArgumentException.class)
    public void yNeg_xMenor0 (){
        operacoes.Mod(-2, -1);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void xMenor0(){
        operacoes.Mod(-2, 4);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void yNeg(){
        operacoes.Mod(2, -1);
    }
    
    @Test
    public void mod2 (){
        assertEquals (2, operacoes.Mod(8, 3));
    }

}
