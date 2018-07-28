package br.com.fiap.twitter;

import br.com.fiap.twitter.interfaces.ILogin;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class Login implements ILogin{
	
	public AccessToken open() {
		Credentials credentials = new Credentials();
		return new AccessToken(credentials.TOKEN, credentials.TOKEN_SECRET);
	}
	
	public Twitter  loginTwitter(AccessToken accessToken) {
		Credentials credentials = new Credentials();
		new TwitterFactory();
		Twitter twitter = TwitterFactory.getSingleton();
		twitter.setOAuthConsumer(credentials.CONSUMER_KEY, credentials.CONSUMER_SECRET);
		twitter.setOAuthAccessToken(accessToken);
		return twitter;
	}
}
