package br.com.fiap.business.interfaces;

import twitter4j.DirectMessage;
import twitter4j.Status; 

public interface IEscreverBll {
	public Status escreverMensagem(String mensagem);
	public DirectMessage escreverMensagem(String usuario, String mensagem);
}
