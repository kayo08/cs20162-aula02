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

public class propriedade3025Test {
    
    @Test (expected = IllegalArgumentException.class)
    public void nNegativo (){
        operacoes.propriedade3025(-2);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void nMaior9999 (){
        operacoes.propriedade3025(10000);
    }
    
    @Test
    public void propriedadeErrada (){
        assertEquals (3025, operacoes.propriedade3025(3025));
    }
}
