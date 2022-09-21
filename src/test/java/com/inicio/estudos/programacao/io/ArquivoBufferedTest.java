package com.inicio.estudos.programacao.io;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArquivoBufferedTest {

    String stringCompleta;
    String stringRetornada;


    Path path;
    Charset charset_utf8;// codificacao
    BufferedWriter bufferedWriter;
    BufferedReader bufferedReader;

    @BeforeEach
    public void setup() throws IOException{
        stringCompleta = "Texto numero um, outro texto.";
        stringRetornada = "";

        path = Paths.get("c:/t/files2/texto.txt");
        Files.createDirectories(path.getParent());
        
        charset_utf8 = StandardCharsets.UTF_8;
        
        //gravando novo texto no arquivo
        bufferedWriter = Files.newBufferedWriter(path, charset_utf8);
        bufferedWriter.write("Texto numero um, ");
        bufferedWriter.write("outro texto.");
        bufferedWriter.flush();// para gravar as linhas de texto.
        
        bufferedReader = Files.newBufferedReader(path, charset_utf8);
    }

    @AfterEach
    public void close() throws IOException {
        bufferedWriter.close();
        bufferedReader.close();
    }

    @Test
    public void deveLerArquivosGrandes() throws IOException {
        String r = ""; 
        while ((r = bufferedReader.readLine()) != null) {
            stringRetornada += r;
        }        
        assertEquals(stringCompleta, stringRetornada);
         //assertEquals(stringCompleta, bufferedReader.readLine().concat(bufferedReader.readLine()));
    }

    @Test
    public void deveLerArquivosGrandesBufferedEmArray() throws IOException {
        for (Object object : bufferedReader.lines().toArray()) {
            stringRetornada += object.toString();
        }
        assertEquals(stringCompleta, stringRetornada);
    }
    
    @Test
    public void deveLerArquivosGrandesStreamJava8() throws IOException {
        stringRetornada =  bufferedReader.lines().collect(Collectors.joining());
        assertEquals(stringCompleta, stringRetornada);
    }   

}