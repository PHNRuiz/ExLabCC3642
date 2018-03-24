/**
 *
 * autor: Pedro Ruiz
 * data: 22/3/2018
 * código matéria: CC3642
 * 
 * propósito: criar um objeto de um produto com alguns atributos e instanciá-lo.
 */

#include <iostream>

#include "Invoice.h"
using namespace std;


int main() {
	Invoice i;//instanciando objeto
	i.setId("123abc");//setando id do produto
	i.setDesc("produto qualquer");//descriçao do                             //produto
	i.setQuant(10);//há 10 produtos
	i.setPreco(25);//custo de 25 por produto
	i.getInvoiceAmount();//preço * quantidade
	i.imprime();//impressao
	
}
