package com.onlineinteract.decoratorpattern;

public class CartoonNetwork extends ChannelDecorator {

	public CartoonNetwork(SatelliteTV satelliteTV) {
		super(satelliteTV);
	}

	@Override
	public void show(int channelNumber) {
		if (channelNumber > 300 && channelNumber < 400) {
			System.out.println("Enjoy Mickey Mouse");
		} else {
			this.getSataliteTV().show(channelNumber);
		}
	}

	@Override
	public int subscriptionPrice() {
		return this.getSataliteTV().subscriptionPrice() + 6;
	}

}