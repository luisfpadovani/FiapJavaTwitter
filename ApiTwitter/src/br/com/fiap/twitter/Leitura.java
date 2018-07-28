package br.com.fiap.twitter;

import java.util.List;

import br.com.fiap.twitter.interfaces.ILeitura;
import twitter4j.DirectMessage;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterException;

public class Leitura implements ILeitura {

	@Override
	public QueryResult leituraMensagem(Twitter twitter, Query query) {
		QueryResult result = null; 
		try {
			result = twitter.search(query);
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<DirectMessage> leituraMensagemPessoais(Twitter twitter) {
		List<DirectMessage> mensagens = null;
		try {
			mensagens = twitter.getDirectMessages();
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mensagens;
	}

	 
}
