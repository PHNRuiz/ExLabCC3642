/**
 *
 * autor: Pedro Ruiz
 * data: 22/3/2018
 * código matéria: CC3642
 * 
 * propósito: invoice.cpp
 */

#include "Invoice.h"

//construtor que inicizaliza atributos caso//nao haja inicializaçao
Invoice::Invoice(){
	id = "";
	desc = "";
	quant = 0;
	preco = 0;
}

//determina id
void Invoice::setId(string newId){
	id = newId;
}

//determina descriçao do produto
void Invoice::setDesc(string newDesc){
	desc = newDesc;
}

//determina Quantidade do produto
void Invoice::setQuant(int newQuant){
	if(newQuant < 0)
				quant = 0;
			else	
				quant = newQuant;
}

//determina preço
void Invoice::setPreco(int newPreco){
	if(newPreco < 0)
				preco = 0;
			else	
				preco = newPreco;
}
//retorna id
string Invoice::getId(){
	return id;
}
//retorna descriçao
string Invoice::getDesc(){
	return desc;
}
//retorna quantidade
int Invoice::getQuant(){
	return quant;
}
//retorna preço
int Invoice::getPreco(){
	return preco;
}
//retorna preço * quantidade
int Invoice::getInvoiceAmount(){
	return preco*quant;
}
//imprime atributos e fatura
void Invoice::imprime(){
	cout<<"Id do produto:"<<getId()<<endl;
	cout<<"Descricao do produto:"<<getDesc()<<endl;
	cout<<"Quantidade do produto:"<<getQuant()<<endl;
	cout<<"Preco do produto:"<<getPreco()<<endl;
	cout<<"total da fatura:"<<getInvoiceAmount()<<endl;
}



