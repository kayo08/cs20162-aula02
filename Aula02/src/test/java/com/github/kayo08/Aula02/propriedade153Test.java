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

public class propriedade153Test {
    
    @Test (expected = IllegalArgumentException.class)
    public void nNegativo153 (){
        operacoes.propridade153(-2);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void nM9999 (){
        operacoes.propridade153(10000);
    }
    
    @Test
    public void propriedade153Esperada(){
        assertEquals (3501, operacoes.propridade153(153));
    }
    
}
