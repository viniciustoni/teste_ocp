package br.com.vinicius.teste.bufferedStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Bird implements Serializable {
	private String name;
	private transient int age;
	private Tail tail;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Tail getTail() {
		return tail;
	}

	public void setTail(Tail tail) {
		this.tail = tail;
	}

	public static void main(String[] args) {
		try (InputStream is = new ObjectInputStream(new BufferedInputStream(new FileInputStream("birds.dat")))) {
//			Bird bird = is.re
		}
	}
	
}
