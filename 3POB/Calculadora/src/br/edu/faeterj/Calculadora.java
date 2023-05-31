package br.edu.faeterj;

public class Calculadora {
    
    public double somar (double a, double b) 
    {
		
		return a+b;
		
	}
	
	public double subtracao(double a, double b) 
    {
		
		return a-b;
	}
	
	public double multiplicacao(double a, double b) 
    {
		
		return a*b;
	}
	
	public double divisao(double a, double b) 
    {
		return a/b;
	}

	
	public double seno(double a) 
    {
		
		return Math.sin(a);
	}
	
	public double cosseno(double a) 
    {
		
		return Math.cos(a);
	}
	
	public double tangente(double a) 
    {
		
		return Math.tan(a);
	}
}
