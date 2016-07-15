package br.com.vinicius.teste.asserts;

public class AssertsDemo {

	public static void main(String[] args) {
		Integer x = 10;
		x++;
		assert x == null && x >= 0;
		System.out.println(x);
	}

}