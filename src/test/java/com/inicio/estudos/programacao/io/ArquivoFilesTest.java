package com.inicio.estudos.programacao.io;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
	//CHECK == VERIFICAR OS ARQUIVOS
	Path path = Paths.get("c:/t/files/texto.txt");
	System.out.println("existe caminho = " + Files.exists(path));
	System.out.println("existe diretorio = " + Files.isDirectory(path));
	
	//arquivo como uma imagem texto, e um arquivo como a gente conhece
	System.out.println(Files.isRegularFile(path));
	System.out.println(Files.isReadable(path));
	//verificar se e executavel
	System.out.println(Files.isExecutable(path));
	//tamanho do arquivo
	System.out.println(Files.size(path));
	//para saber a ultima modifica��o
	System.out.println(Files.getLastModifiedTime(path));
	//para saber quem e o administrador da maquina
	System.out.println(Files.getOwner(path));
	//retorna o tipo de arquivo
	System.out.println(Files.probeContentType(path));
	
	
	//DELETE
	//Files.delete(path);//esse so consegue deletar o diretorio se ele estiver vazio 
	//deleta so se existir o arquivo
	Files.deleteIfExists(path);
	*/

public class ArquivoFilesTest {

    Path path;
    Path path2;
    Path pathCopia;
    Path pathMover;
    String stringRetornada;
    String textoParaMover;
    String textoParaGravacao;

    @BeforeEach
    public void setup() throws IOException {
        path = Paths.get("c:\\t\\files\\meuarquivo.txt");
        path2 = Paths.get("c:\\t\\files\\meuarquivomover.txt");
        pathCopia = Paths.get("c:\\t\\files\\arquivoCopiado.txt");
        pathMover = Paths.get("c:\\t\\files\\move\\meuarquivomover.txt");

        stringRetornada = "";
        textoParaMover = "Texto para mover - Files";
        textoParaGravacao = "Texto para gravacao - Files";

        Files.createDirectories(path.getParent());
        Files.createDirectories(path2.getParent());
        Files.createDirectories(pathCopia.getParent());
        Files.createDirectories(pathMover.getParent());
    }

    @Test
    public void deveManipularPathDiretorios() {
        assertEquals("c:\\", path.getRoot().toString());
        assertEquals("c:\\t\\files", path.getParent().toString());
        assertEquals("c:\\t\\files\\meuarquivo.txt", path.toAbsolutePath().toString());
        assertEquals("meuarquivo.txt", path.getFileName().toString());
        assertEquals(3, path.getNameCount());
    }

    @Test
    public void deveLerArquivosPequenos() throws IOException {
        Files.write(path, textoParaGravacao.getBytes());
        for (byte byteRetornado : Files.readAllBytes(path)) {
            stringRetornada += (char) byteRetornado; // cast para char
        }
        assertEquals(textoParaGravacao, stringRetornada);
    }

    @Test
    public void deveCopiarArquivo() throws IOException {
        Files.write(path, textoParaGravacao.getBytes());
        Files.copy(path, pathCopia, StandardCopyOption.REPLACE_EXISTING);
        for (byte byteRetornado : Files.readAllBytes(pathCopia)) {
            stringRetornada += (char) byteRetornado; // cast para char
        }
        assertEquals(textoParaGravacao, stringRetornada);
    }
    
    @Test
    public void deveMoverArquivo() throws IOException {
        Files.write(path2, textoParaMover.getBytes());
        Files.move(path2, pathMover, StandardCopyOption.REPLACE_EXISTING);
        for (byte byteRetornado : Files.readAllBytes(pathCopia)) {
            stringRetornada += (char) byteRetornado; // cast para char
        }
        assertEquals(textoParaGravacao, stringRetornada);
    }
}