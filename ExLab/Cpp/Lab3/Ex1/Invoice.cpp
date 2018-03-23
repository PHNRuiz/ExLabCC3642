/**
 *
 * autor: Pedro Ruiz
 * data: 22/3/2018
 * código matéria: CC3642
 * 
 * propósito: invoice.cpp
 */

#include "Invoice.h"

Invoice::Invoice(){
	id = "";
	desc = "";
	quant = 0;
	preco = 0;
}


void Invoice::setId(string newId){
	id = newId;
}


void Invoice::setDesc(string newDesc){
	desc = newDesc;
}


void Invoice::setQuant(int newQuant){
	if(newQuant < 0)
				quant = 0;
			else	
				quant = newQuant;
}


void Invoice::setPreco(int newPreco){
	if(newPreco < 0)
				preco = 0;
			else	
				preco = newPreco;
}

string Invoice::getId(){
	return id;
}

string Invoice::getDesc(){
	return desc;
}

int Invoice::getQuant(){
	return quant;
}

int Invoice::getPreco(){
	return preco;
}

int Invoice::getInvoiceAmount(){
	return preco*quant;
}

void Invoice::imprime(){
	cout<<"Id do produto:"<<getId()<<endl;
	cout<<"Descricao do produto:"<<getDesc()<<endl;
	cout<<"Quantidade do produto:"<<getQuant()<<endl;
	cout<<"Preco do produto:"<<getPreco()<<endl;
	cout<<"total da fatura:"<<getInvoiceAmount()<<endl;
}



