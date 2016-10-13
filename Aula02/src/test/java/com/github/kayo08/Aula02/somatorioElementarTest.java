/*
Copyright (c) 2016. Kayo Martins Freitas
 */

package com.github.kayo08.Aula02;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kayo Martins.
 */

public class somatorioElementarTest {
    
    @Test (expected = IllegalArgumentException.class)
    public void nMenor1 (){
        operacoes.somatoriosElementar(-1);
    }
    
    @Test
    public void somElem5(){
        float somElem = operacoes.somatoriosElementar(5);
        //0.8972851
        Assert.assertEquals(0.8972851, somElem, 0.0000001);
    }
}
