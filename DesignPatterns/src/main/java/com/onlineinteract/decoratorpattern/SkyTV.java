package com.onlineinteract.decoratorpattern;

/**
 * Instance we are going to decorate.
 * 
 * @author Digilogue
 *
 */
public class SkyTV implements SatelliteTV {

	@Override
	public void show(int channelNumber) {
		if (channelNumber < 100) {
			System.out.println("Basic News Channels");
		} else {
			System.out.println("You are not subscribed. Please subscribe.");
		}
	}

	@Override
	public int subscriptionPrice() {
		return 100;
	}

}
