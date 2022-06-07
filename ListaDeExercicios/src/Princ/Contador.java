package Princ;

public class Contador 
{
	private int contador;
	
	public int zerar()
	{
		this.contador = 0;
		return this.contador;
	}
	
	public int incrementar(int valor)
	{
		this.contador += valor;
		return this.contador;
	}
	
	public int retornoContador()
	{
		return this.contador;
	}
}
