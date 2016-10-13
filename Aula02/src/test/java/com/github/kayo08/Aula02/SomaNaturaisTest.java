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

public class SomaNaturaisTest {
    
    /**
     * Teste sobre  o algoritmo da lista "Aula-02", SomaNaturais.
     */
    
    
    @Test (expected = IllegalArgumentException.class)
    public void NaturalNegativo (){
        operacoes.somaNaturais(-1);
    }
    
    @Test
    public void ResuladoEsperado (){
        assertEquals(6, operacoes.somaNaturais(3));
    }
    

}
