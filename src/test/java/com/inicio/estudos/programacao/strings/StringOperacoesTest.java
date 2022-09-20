package com.inicio.estudos.programacao.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringOperacoesTest {

    char[] arrayChar = { 'j', 'a', 'v', 'a' };

    String string1;
    String stringObjeto;
    String stringArrayChar;
    String stringConcatenada;

    String stringQualquer = "XHTML; CSS; JavaScript; Jquery; Java";

    @BeforeEach
    public void setup() {
        string1 = "Write once";
        stringObjeto = new String("Java Virtual Machine");
        stringArrayChar = new String(arrayChar);
        stringConcatenada = string1 + " Rum AnyWhere";
    }

    @Test
    public void deveFazerOperacoesStrings() {
        assertEquals(105, string1.charAt(2));
        assertEquals(4, stringArrayChar.length());
        assertEquals(23, stringConcatenada.length());
    }

    @Test
    public void deveCompararStrings() {
        final String XTI = "XTI";
        assertTrue(XTI.endsWith("TI"));
        assertTrue(XTI.startsWith("XT"));
        assertTrue(XTI.equalsIgnoreCase("xti"));
        assertNotEquals(XTI.toLowerCase(), XTI);

        assertNotEquals(XTI.toLowerCase(), XTI);
        assertEquals(-1, "amor".compareTo("bola"));

        String so = "olhe, olhe!";
        assertTrue(so.regionMatches(6, "olhe", 0, 4));
    }

    @Test
    public void deveLocalizarStrings() {
        assertFalse(stringObjeto.isEmpty());
        assertEquals(2, stringObjeto.indexOf("v"));
        assertEquals(19, stringObjeto.lastIndexOf("e"));
    }

    @Test
    public void deveExtrairStrings() {
        assertEquals("Virtual Machine", stringObjeto.substring(5));
        assertEquals("Virtual", stringObjeto.substring(5, 12));
    }

    @Test
    public void deveModificarStrings() {
        assertEquals("esp aco", "  esp aco".trim());
        assertEquals("write once", string1.toLowerCase());
        assertEquals("WRITE ONCE", string1.toUpperCase());
        assertEquals("Writy oncy", string1.replace('e', 'y'));
        assertEquals("Writx oncx", string1.replaceAll("e", "x"));
        assertEquals("Write-once", string1.replaceFirst(" ", "-"));
    }
    
    @Test
    public void deveSepararStrings(){
        assertEquals(5, stringQualquer.split(" ").length);
    }
}
