public class Rational{
	private int numerador;//numerador da fracao
	private int denominador;//denominador da fracao
	
	//construtor sem argumentos que inicializa numerador e denominador em 1
	public Rational(){
		numerador = 1;
		denominador = 1;
	}
	//inicializa numerador para n e denominador para d
	public Rational(int numerador, int denominador){
		this.numerador = numerador;
		this.denominador = denominador;
		reduz();
	}
	//reduz a fraçao fzd mmc
	public void reduz(){
		int mmc = 0;
		int menor;
		//acha mmc entre fraçoes
		if(numerador < denominador)
			menor = numerador;
		else
			menor = denominador;
			
		for(int divisor = menor; divisor >= 2; divisor --){
			if(numerador % divisor == 0 && denominador % divisor ==0){
				mmc = divisor;
				break;
			}
		}
		//divide numerador e denominador pelo mmc
		if(mmc != 0){
			numerador /= mmc;
			denominador /= mmc;
		}
	}
	//soma duas fraçoes
	public Rational soma(Rational r){
		int denominadorResultante = denominador * r.denominador;
		int numeradorResultante = numerador * r.denominador + 
		                          r.numerador * denominador;
		
		return new Rational(numeradorResultante, denominadorResultante);
	}
	//subtrai duas fraçoes
	public Rational subtracao(Rational r){
		int denominadorResultante = denominador * r.denominador;
		int numeradorResultante = numerador * r.denominador - 
		                          r.numerador * denominador;
		
		return new Rational(numeradorResultante, denominadorResultante);
		
	}
	//multiplica duas fraçoes
	public Rational multiplica(Rational r){
		return new Rational(numerador * r.numerador, 
		                   denominador * r.denominador);
	}
	//divide duas fraçoes
	public Rational divide(Rational r){
		return new Rational(numerador * r.denominador, 
		                   denominador * r.numerador);
	}
	//retorna representaçao string de numero racional 
	public String toString(){
		return numerador + "/" + denominador;
	}
	//retorna fraçao em sua forma decimal
	public String toFloatString(int digitos){
		//constroi um formatador adaptavel
		double valor = (double) numerador / denominador;
		return String.format("%." + digitos + "f", valor);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}