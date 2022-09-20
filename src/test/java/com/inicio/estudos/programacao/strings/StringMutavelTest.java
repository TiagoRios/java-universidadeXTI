package com.inicio.estudos.programacao.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringMutavelTest {

    final String TEXTO_URL = "www.eu.com.br";
    final String TEXTO_STRING = "oi" + " como " + "vai vc?";
    final String TEXTO_MUITO_LOUCO = "muito louco";

    String stringBuffer;
    String stringBuilderDelete;
    StringBuilder stringBuilder;

    @BeforeEach
    public void setup() {
        stringBuffer = new StringBuffer("oi")
                .append(" como ")
                .append("vai vc?")
                .toString();
        stringBuilderDelete = new StringBuilder(TEXTO_URL)
                .delete(0, 4)
                .toString();
        stringBuilder = new StringBuilder(TEXTO_MUITO_LOUCO);
    }

    @Test
    public void deveMostrarTamanho() {
        assertEquals(11, stringBuilder.length());
        assertEquals(TEXTO_MUITO_LOUCO, stringBuilder.toString());
    }

    @Test
    public void deveVerificarCapacidadeDoObjeto() {
        assertEquals(27, stringBuilder.capacity());
    }

    @Test
    public void deveReverterValorString() {
        assertEquals("ocuol otium", stringBuilder.reverse().toString());
    }

    @Test
    public void deveAcrescentarMaisTextoNaString() {
        assertEquals(TEXTO_MUITO_LOUCO + " Trabalhando", stringBuilder.append(" Trabalhando").toString());
    }

    @Test
    public void deveVerificarIgualdadeStringBufferEString() {
        assertEquals(TEXTO_STRING, stringBuffer);
    }

    @Test
    public void deveDeletarParteString() {
        assertEquals("eu.com.br", stringBuilderDelete);
    }
}
