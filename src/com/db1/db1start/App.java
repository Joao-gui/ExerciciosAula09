package com.db1.db1start;

public class App {
	
	public static void main(String[] args)
	{
		int tamanhoDoNome = Nome.quantidadeDeCaracteres("Jo�o Guilherme");
		System.out.println("Tamanho do nome �: "+tamanhoDoNome);
		
		Calculadora calculadora = new Calculadora(10,2,11.5,57.1,22.41);
		Calculadora calculadora2 = new Calculadora(11,15,54.2,18.2,63.2);
		
		System.out.println(calculadora.somar());
		System.out.println(calculadora2.subtrair());
		System.out.println(calculadora.multiplicar());
		System.out.println(calculadora.dividir());
		System.out.println(calculadora.par());
		System.out.println(calculadora2.maior());
		System.out.println(calculadora2.impares());
	}
}
