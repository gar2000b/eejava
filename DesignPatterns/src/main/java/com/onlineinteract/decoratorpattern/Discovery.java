package com.onlineinteract.decoratorpattern;

public class Discovery extends ChannelDecorator {

	public Discovery(SatelliteTV satelliteTV) {
		super(satelliteTV);
	}

	@Override
	public void show(int channelNumber) {
		if (channelNumber > 200 && channelNumber < 300) {
			System.out.println("Enjoy Scientific Documentaries");
		} else {
			this.getSataliteTV().show(channelNumber);
		}
	}

	@Override
	public int subscriptionPrice() {
		return this.getSataliteTV().subscriptionPrice() + 10;
	}

}