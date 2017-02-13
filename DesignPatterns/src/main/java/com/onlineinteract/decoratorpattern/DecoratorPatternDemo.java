package com.onlineinteract.decoratorpattern;

/**
 * Demonstrating the use of the Decorator Pattern. Essentially, we
 * want to extend the SkyTV subscription functionality by decorating
 * this class with additional subscriptions.
 * 
 * All subscriptions should conform to the same interface
 * (SatelliteTV). We need an abstract decorator class that implements
 * that interface and holds a reference field of that interface too.
 * This field is used for wrapping / delegating calls down the call
 * stack.
 * 
 * In our demo, we chain all the SatelliteTV constructors together for
 * all the subscriptions required. We of course specify our class to
 * be decorated as the last argument with the preceding arguments
 * being the decorators themselves.
 * 
 * @author Digilogue
 *
 */
public class DecoratorPatternDemo {
	public static void main(String[] args) {
		SatelliteTV satelliteTV = new Discovery(new ESPN(new CartoonNetwork(new SkyTV())));
		satelliteTV.show(150);
		System.out.println("Total Subscription Price is: " + satelliteTV.subscriptionPrice());
	}
}
