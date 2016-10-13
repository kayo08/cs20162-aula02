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

public class primoTest {
    
    @Test (expected = IllegalArgumentException.class)
    public void primoMenor1 (){
        operacoes.primo(-1);
    }
    
    @Test
    public void primoVerdadeiro (){
        assertEquals (true, operacoes.primo(7));
    }
    
    @Test
    public void primoFalso (){
        assertEquals (false, operacoes.primo(8));
    }
    

}
