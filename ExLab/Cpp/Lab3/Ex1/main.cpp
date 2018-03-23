#include <iostream>

#include "Invoice.h"
using namespace std;


int main() {
	Invoice i;
	i.setId("123abc");
	i.setDesc("produto qualquer");
	i.setQuant(10);
	i.setPreco(25);
	i.getInvoiceAmount();
	i.imprime();
	
}