package com.inicio.estudos.programacao.basico;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CollectionTest {

    Collection<String> colecao;
    Collection<String> colecao2;

    @BeforeEach
    public void setup() {
        colecao = new ArrayList<>();
        colecao.add("A");
        colecao.add("E");
        colecao.add("I");
        
        colecao2 = Arrays.asList("O", "U");
    }

    @Test
    public void deveVerificarColecaoEstaVaziaETamanho() {
        assertFalse(colecao.isEmpty());
        assertTrue(colecao.contains("A"));
        assertEquals(3, colecao.size());
    }
    @Test
    public void deveVerificarRemocaoItem() {
        colecao.remove("A");
        assertFalse(colecao.contains("A"));
    }
    @Test
    public void deveVerificarLimpezaColecao() {
        colecao.clear();
        assertTrue(colecao.isEmpty());
    }    
    @Test
    public void deveAdicionarRemoverListaEmUmaColecao() {
        colecao.addAll(colecao2);
        assertEquals(5, colecao.size());
        assertTrue(colecao.containsAll(colecao2));

        colecao.removeAll(colecao2);
        assertEquals(3, colecao.size());
    }
    @Test
    public void deveConverterColecaoEmArray() {
        String[] arrayString = colecao.toArray(new String[colecao.size()]);
        assertEquals(3, arrayString.length);
    }
}
