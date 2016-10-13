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

public class quadradoPerfeitoTest{
    
    @Test (expected = IllegalArgumentException.class)
    public void kMenor1 (){
        operacoes.quadradoPerfeito(-1);
    }
    
    @Test
    public void quaPerf4 (){
        assertEquals (4, operacoes.quadradoPerfeito(2));
    }
    
}
