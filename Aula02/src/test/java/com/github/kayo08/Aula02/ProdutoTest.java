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

public class ProdutoTest {
    
    /**
     * Teste sobre  o algoritmo da lista "Aula-02", Produto.
     */
    
    @Test (expected = IllegalArgumentException.class)
    public void ProdutosNegativos (){
        operacoes.produto(-2, -4);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void aNegativo (){
        operacoes.produto(-2, 6);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void bNegativo (){
        operacoes.produto(6, -2);
    }
    
    @Test
    public void ProdutoABEsperado (){
        assertEquals (12, operacoes.produto(2, 6));
    }
    
    @Test
    public void ProdutoABEsperado2 (){
        assertEquals (10, operacoes.produto(2, 5));
    }
}
