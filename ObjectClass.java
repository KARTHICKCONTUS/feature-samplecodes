package com.object;

public class ObjectClass {
	private String uname1;
	private int unmae2;
	public String getUname1() {
		return uname1;
	}
	public void setUname1(String uname1) {
		this.uname1 = uname1;
	}
	public int getUnmae2() {
		return unmae2;
	}
	public void setUnmae2(int unmae2) {
		this.unmae2 = unmae2;
	}
	@Override
	public String toString() {
		return "ObjectClass [uname1=" + uname1 + ", unmae2=" + unmae2 + "]";
	}
}
