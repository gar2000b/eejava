package com.onlineinteract.prototypepattern.model;

import java.util.ArrayList;
import java.util.List;

import com.onlineinteract.prototypepattern.model.api.Shape;

public class Triangle extends Shape {

	private String funkyField;
	private MiniTriangle miniTriangle;
	private List<MiniTriangle> miniTriangleList;

	public Triangle() {
		type = "Triangle";
		funkyField = "I am a funky Triangle";
		miniTriangle = new MiniTriangle("Equilateral", "SOHCAHTOA", "Structurally Very Strong");
		miniTriangleList = new ArrayList<MiniTriangle>();
		miniTriangleList.add(new MiniTriangle("1", "triangle 1", "blah 1"));
		miniTriangleList.add(new MiniTriangle("2", "triangle 2", "blah 2"));
		miniTriangleList.add(new MiniTriangle("3", "triangle 3", "blah 3"));
	}

	@Override
	public void draw() {
		System.out.println("Inside Triangle::draw() method.");
	}

	public String getFunkyField() {
		return funkyField;
	}

	public void setFunkyField(String funkyField) {
		this.funkyField = funkyField;
	}

	public MiniTriangle getMiniTriangle() {
		return miniTriangle;
	}

	public void setMiniTriangle(MiniTriangle miniTriangle) {
		this.miniTriangle = miniTriangle;
	}

	public List<MiniTriangle> getMiniTriangleList() {
		return miniTriangleList;
	}

	public void setMiniTriangleList(List<MiniTriangle> miniTriangleList) {
		this.miniTriangleList = miniTriangleList;
	}
}
