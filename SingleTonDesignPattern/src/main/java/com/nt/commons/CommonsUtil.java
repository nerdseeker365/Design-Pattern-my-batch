package com.nt.commons;

public class CommonsUtil implements Cloneable {
@Override
public Object clone() throws CloneNotSupportedException {
	System.out.println("CommonsUtil.clone()");
	return super.clone();
}
}
