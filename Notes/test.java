
package com.generics.usingGenerics;
class Box<T>{
	private T object;
	public T getObject() {
		return object;
	}
	public void setObject(T object) {
		this.object = object;
	}
}

public class Test {
	public static void main(String[] args) {
		Box<Integer> box = new Box<>();
		box.setObject(10);
		System.out.println(box.getObject());
	}
}
