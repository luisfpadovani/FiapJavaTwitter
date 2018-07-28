package br.com.fiap.business;
 
import java.util.List;

import br.com.fiap.business.interfaces.ILeituraBll;
import br.com.fiap.twitter.Leitura;
import br.com.fiap.twitter.Login; 
import br.com.fiap.twitter.interfaces.ILeitura;
import br.com.fiap.twitter.interfaces.ILogin;
import twitter4j.DirectMessage;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter; 

public class LeituraBll implements ILeituraBll {
	private ILeitura leitura = null;
	private ILogin login = null;
	
	LeituraBll(){
		this.leitura = new Leitura();
		this.login = new Login();
	}


	@Override
	public QueryResult leituraMensagem(Query query) {
		 Twitter twitter = this.login.loginTwitter(login.open());
		 return this.leitura.leituraMensagem(twitter,query);
	}

	@Override
	public List<DirectMessage> leituraMensagemPessoais() {
		 Twitter twitter = this.login.loginTwitter(login.open());
		 return this.leitura.leituraMensagemPessoais(twitter);
	}
}
