package com.onlineinteract.visitorpattern;

/**
 * Demonstrating the use of the Visitor Pattern.
 * 
 * We want to separate out specialised algorithms / methods across our
 * family of Computer Parts (structures / classes).
 * 
 * The concrete elements (Computer Parts) have an accept method which
 * takes in our concrete visitor and invokes its corresponding
 * visit(...) method passing in itself (this) as a reference. You'll
 * notice in the visitor class that there is of course one visit()
 * method per element type which can all be invoked as part of a
 * grouped transaction like what we are doing from the
 * Computer.accept().
 * 
 * @author Digilogue
 *
 */
public class VisitorPatternDemo {
	public static void main(String[] args) {

		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}
}