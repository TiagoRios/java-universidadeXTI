package com.inicio.estudos.programacao.matematica;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.inicio.estudos.programacao.oo.heranca.matematica.Matematica;

public class OperacoesMatematicasTest {

    int raio;
    Matematica matematica;

    @BeforeEach
    public void setup() {
        raio = 3;
        matematica = new Matematica();
    }

    @Test
    public void deveObterDiametro() {
        assertEquals(6, matematica.getDiametro(raio));
    }

    @Test
    public void deveObterCircunferencia() {
        assertEquals(18, matematica.getCircunferencia(raio).intValue());
    }

    @Test
    public void deveObterArea() {
        assertEquals(28, matematica.getArea(raio).intValue());
    }
}