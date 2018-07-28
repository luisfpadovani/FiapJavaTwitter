package br.com.fiap.business;
 
import br.com.fiap.business.interfaces.IEscreverBll;
import br.com.fiap.twitter.Escrever;
import br.com.fiap.twitter.Login;
import br.com.fiap.twitter.interfaces.IEscrever;
import br.com.fiap.twitter.interfaces.ILogin;
import twitter4j.DirectMessage;
import twitter4j.Status;
import twitter4j.Twitter; 

public class EscreverBll implements IEscreverBll {
	private IEscrever escrever = null;
	private ILogin login = null;
	
	EscreverBll(){
		this.escrever = new Escrever();
		this.login = new Login();
	}

	@Override
	public Status escreverMensagem(String mensagem) {
		 Twitter twitter = this.login.loginTwitter(login.open());
		 return this.escrever.escreverMensagem(twitter, mensagem);
	}

	@Override
	public DirectMessage escreverMensagem(String usuario, String mensagem) {
		 Twitter twitter = this.login.loginTwitter(this.login.open());
		 return this.escrever.escreverMensagem(twitter, usuario,mensagem);
	}
	
}