/**
 *
 * autor: Pedro Ruiz
 * data: 22/3/2018
 * código matéria: CC3642
 * 
 * propósito: complex.h
 */


#ifndef LAB3_EX2_COMPLEX_H
#define LAB3_EX2_COMPLEX_H

#include <cstdlib>
#include <iostream>
#include <string>
using namespace std;

class Complex{
	public://definiçao dos metodos
		Complex();
		Complex(double, double);
		double getParteReal();
		double getParteImaginaria();
		void setParteReal(double);
		void setParteImaginaria(double);
		void somaComplex(Complex,Complex);
		void subtraiComplex(Complex,Complex);
		void imprimeComplex();
		
	private://definiçao dos atributos
		double parteReal;
		double parteImaginaria;
		
};












#endif