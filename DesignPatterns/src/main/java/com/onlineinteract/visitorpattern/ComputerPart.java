package com.onlineinteract.visitorpattern;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}