package com.springcore.ref;

public class A {
	private int x;
	private B bobj;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public B getBobj() {
		return bobj;
	}
	public void setBobj(B bobj) {
		this.bobj = bobj;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", bobj=" + bobj + "]";
	}
	
}
