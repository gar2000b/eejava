package com.onlineinteract.singletonpattern;

public class SingletonPatternDemo2 {
	public static void main(String[] args) {

		Runtime singletonRuntime = Runtime.getRuntime();
		singletonRuntime.gc();
		System.out.println(singletonRuntime.toString());

		Runtime singletonRuntime2 = Runtime.getRuntime();
		singletonRuntime2.gc();
		System.out.println(singletonRuntime2.toString());

		if (singletonRuntime == singletonRuntime2)
			System.out.println(
					"\n(singletonRuntime == singletonRuntime2) is proof that both singletons are the same instance.");
	}
}
