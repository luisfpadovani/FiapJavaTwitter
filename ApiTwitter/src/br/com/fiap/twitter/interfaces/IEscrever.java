package br.com.fiap.twitter.interfaces;

import twitter4j.DirectMessage;
import twitter4j.Status;
import twitter4j.Twitter;

public interface IEscrever {
	Status escreverMensagem(Twitter twitter, String mensagem);
	DirectMessage escreverMensagem(Twitter twitter, String usuario, String mensagem);
}
