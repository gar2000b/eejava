package com.onlineinteract.decoratorpattern;

public class ESPN extends ChannelDecorator {

	public ESPN(SatelliteTV satelliteTV) {
		super(satelliteTV);
	}

	@Override
	public void show(int channelNumber) {
		if (channelNumber > 100 && channelNumber < 200) {
			System.out.println("Enjoy Sports");
		} else {
			this.getSataliteTV().show(channelNumber);
		}
	}

	@Override
	public int subscriptionPrice() {
		return this.getSataliteTV().subscriptionPrice() + 7;
	}

}
