package de.fhb.schmidde;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class GetConfiguredTwitterObject {
	
	private final static String oAuthConsumerKey = "BuRw5wYugWEiYvLeUAlQ";
	private final static String oAuthConsumerSecret = "1kiBB9eE5SrDXLEoQ26ke0Sox0p95ZlyWNME2UJr4";
	private final static String oAuthAccessToken = "405617247-XEcaeBdnggnWzbFry5sk4c50IYIcsTSXUNiBct03";
	private final static String oAuthAccessTokenSecret= "Vu6U4vgxotxa12bpAeuUa43rItLGWJPWRQaTcPIZDIg";
	private Twitter twitter;
	
	public GetConfiguredTwitterObject(){
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setOAuthConsumerKey(oAuthConsumerKey);
		cb.setOAuthConsumerSecret(oAuthConsumerSecret);
		cb.setOAuthAccessToken(oAuthAccessToken);
		cb.setOAuthAccessTokenSecret(oAuthAccessTokenSecret);
		TwitterFactory tf = new TwitterFactory(cb.build());
		twitter = tf.getInstance();
	}
	public Twitter getTwitter() {
		return twitter;
	}
	public void setTwitter(Twitter twitter) {
		this.twitter = twitter;
	}

}
