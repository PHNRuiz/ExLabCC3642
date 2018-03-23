

/**
 *
 * autor: Pedro Ruiz
 * data: 22/3/2018
 * código matéria: CC3642
 * 
 * propósito: invoice.h
 */
#ifndef LAB3_EX1_INVOICE_H
#define LAB3_EX1_INVOICE_H

#include <cstdlib>
#include <iostream>
#include <string>
using namespace std;


class Invoice{
	public://definiçao dos metodos
		Invoice();
		void setId(string);
		void setDesc(string);
		void setQuant(int);
		void setPreco(int);
		string getId();
		string getDesc();
		int getQuant();
		int getPreco();
		int getInvoiceAmount();
		void imprime();
		
		private://definiçao dos atributos
		string id;
		string desc;
		int quant;
		int preco;
};




#endif
