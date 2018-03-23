/**
 *
 * autor: Pedro Ruiz
 * data: 22/3/2018
 * código matéria: CC3642
 * 
 * propósito: complex.cpp
 */
#include "Complex.h"
//construtor para quando nao for dado valor
Complex::Complex(){
	parteReal = 1;
  parteImaginaria = 1;
}
//construtor parametrizado que inicializa com os parametros
Complex::Complex(double x, double y){
	parteReal = x;
	parteImaginaria = y;
}
//retorna parte real
double Complex::getParteReal(){
	return parteReal;
}
//retorna parte imaginaria
double Complex::getParteImaginaria(){
	return parteImaginaria;
}
//define valor para parte real
void Complex::setParteReal(double ParteReal){
	this->parteReal = parteReal;
}
//define valor para parte imaginaria
void Complex::setParteImaginaria(double parteImaginaria){
	this->parteImaginaria = parteImaginaria;
}
//soma 2 numeros complexos
void Complex::somaComplex(Complex a, Complex b){
	parteReal = a.parteReal + b.parteReal;
	parteImaginaria = a.parteImaginaria + b.parteImaginaria;
	cout <<"("<<a.getParteReal()<<", "<< a.getParteImaginaria()<<"i) + (" << b.getParteReal()    <<", " << b.getParteImaginaria()<<"i) = ";
}

//subtrai 2 numeros complexos
void Complex::subtraiComplex(Complex a, Complex b){
	parteReal = a.parteReal + (b.parteReal*-1);
	parteImaginaria = a.parteImaginaria + (b.parteImaginaria*-1);
	cout << "(" <<a.getParteReal()<<", "<<a.getParteImaginaria()<<"i) - (" <<b.getParteReal()    <<", " <<b.getParteImaginaria()<<"i) = ";
}
//impressao
void Complex::imprimeComplex(){
	if(parteImaginaria == 0)
		 cout << "(" <<getParteReal()<<", 0)\n";//se parte imaginaria for 0 nao mostra i
	else
		cout << "(" <<getParteReal()<<", " <<getParteImaginaria()<<"i)\n";//caso contrario o i                                                                 //aparece
}






























