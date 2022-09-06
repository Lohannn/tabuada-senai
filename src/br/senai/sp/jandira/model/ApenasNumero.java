package br.senai.sp.jandira.model;

import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class ApenasNumero extends PlainDocument {

	private static final long serialVersionUID = 1L;

	// Sempre usar verbo no infinitivo para criar metodos
	public void insertString(int offs, String str, javax.swing.text.AttributeSet a) throws BadLocationException {
		// normalmente apenas uma letra é inserida por vez,
		// mas fazendo assim também previne caso o usuário
		// cole algum texto
		for (int i = 0; i < str.length(); i++)
			// Se não for número, ponto ou vírgula retorna zero
			if (!Character.isDigit(str.charAt(i)))
				return;

		super.insertString(offs, str, a);

	}
}