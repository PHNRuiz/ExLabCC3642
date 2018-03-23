/**
 *
 * autor: Pedro Ruiz
 * data: 22/3/2018
 * código matéria: CC3642
 * 
 * propósito: fazer operaçoes com numeros complexos
 */

#include "Complex.h"


int main(){
	Complex a(2,-7);//2-7i
	Complex b(-8,3);//-8+3i
	Complex c;//instancia objeto com valores padrao
	
	c.subtraiComplex(a,b);//10-4i
	c.imprimeComplex();//impressao do numero complexo resultante
	c.somaComplex(a,b);//-6-4i
	c.imprimeComplex();//impressao do numkero complexo resultante
	
	return 0;
	
}