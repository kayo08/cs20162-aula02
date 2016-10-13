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

public class mdcSubitracaoTest {
    
    @Test (expected = IllegalArgumentException.class)
    public void aMenB (){
        operacoes.mDCsubtracoes(2, 6);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void bMen0 (){
        operacoes.mDCsubtracoes(2, -2);
    }
    
    @Test
    public void mdcSub5 (){
        assertEquals (5, operacoes.mDCsubtracoes(55, 25));
    }

}
