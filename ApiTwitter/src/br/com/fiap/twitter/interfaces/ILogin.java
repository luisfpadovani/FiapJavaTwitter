package br.com.fiap.twitter.interfaces;

import twitter4j.Twitter;
import twitter4j.auth.AccessToken;

public interface ILogin {
	AccessToken open();
	Twitter  loginTwitter(AccessToken accessToken);
}
