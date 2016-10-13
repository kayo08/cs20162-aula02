/*
Copyright (c) 2016. Kayo Martins Freitas
 */

package com.github.kayo08.Aula02;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kayo Martins.
 */

public class PotenciaTest {

    @Test (expected = IllegalArgumentException.class)
    public void baseExpoenteNegativo (){
        operacoes.potencia(-2, -4);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void baseNegativa (){
        operacoes.potencia(-2, 4);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void expoenteNegativa (){
        operacoes.potencia(2, -4);
    }
    
    @Test
    public void potenciaEsperada (){
        assertEquals (8, operacoes.potencia(2, 3));
    }
}
