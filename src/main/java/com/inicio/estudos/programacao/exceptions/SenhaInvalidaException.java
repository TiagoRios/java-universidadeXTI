package com.inicio.estudos.programacao.exceptions;

public class SenhaInvalidaException extends Exception {

	private static final long serialVersionUID = -5574483335597828753L;

	public SenhaInvalidaException(String mensagem) {
		super(mensagem);
	}
}
