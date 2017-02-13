package com.onlineinteract.decoratorpattern;

public abstract class ChannelDecorator implements SatelliteTV {

	// Wrapper Instance we are going to decorate.
	private SatelliteTV satelliteTV;

	public ChannelDecorator(SatelliteTV satelliteTV) {
		this.satelliteTV = satelliteTV;
	}

	public SatelliteTV getSataliteTV() {
		return this.satelliteTV;
	}
}
