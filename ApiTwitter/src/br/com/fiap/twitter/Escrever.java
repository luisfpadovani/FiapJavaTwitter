package br.com.fiap.twitter;

import br.com.fiap.twitter.interfaces.IEscrever;
import twitter4j.DirectMessage;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;

public class Escrever implements IEscrever{

	@Override
	public Status escreverMensagem(Twitter twitter, String mensagem) {
		Status status = null;
		try {
			status = twitter.updateStatus(mensagem);
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public DirectMessage escreverMensagem(Twitter twitter, String usuario, String mensagem) {
		DirectMessage directMessage = null;
		try {
			directMessage = twitter.sendDirectMessage(usuario,mensagem);
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return directMessage;
	}

}
