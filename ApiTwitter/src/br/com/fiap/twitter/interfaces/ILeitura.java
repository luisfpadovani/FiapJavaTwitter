package br.com.fiap.twitter.interfaces;

import java.util.List;

import twitter4j.DirectMessage;
import twitter4j.Query;
import twitter4j.QueryResult; 
import twitter4j.Twitter;

public interface ILeitura {
	QueryResult leituraMensagem(Twitter twitter, Query query);
	List<DirectMessage> leituraMensagemPessoais(Twitter twitter);
}
