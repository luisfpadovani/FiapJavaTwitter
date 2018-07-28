package br.com.fiap.business.interfaces;

import java.util.List;

import twitter4j.DirectMessage;
import twitter4j.Query;
import twitter4j.QueryResult; 

public interface ILeituraBll {
	 List<DirectMessage> leituraMensagemPessoais();
	 QueryResult leituraMensagem(Query query);
}
