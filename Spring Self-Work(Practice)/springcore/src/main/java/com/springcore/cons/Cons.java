package com.springcore.cons;

public class Cons {
	private String pName;
	private int pId;
	private Certi cert;
	public Cons(String pName, int pId,Certi cert) {
		this.pName = pName;
		this.pId = pId;
		this.cert = cert;
	}
	@Override
	public String toString() {
		return this.pName + " : "+ this.pId + " { "+this.cert.cName+" }";
	}
	
}
