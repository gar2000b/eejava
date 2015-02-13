package com.onlineinteract.singletonpattern;

public class SingleObject {

	// Creates one single object.
	private static SingleObject instance = new SingleObject();

	// Making constructor private so that it cannot be instantiated from the
	// outside world.
	private SingleObject() {
	}

	// Gets this only one single object instance.
	public static SingleObject getInstance() {
		return instance;
	}

	// Local method.
	public void showMessage() {
		System.err.println("Hello World, I am a Singleton!\nIf you don't believe me, try and instantiate me by calling my constructor :)");
	}

}
