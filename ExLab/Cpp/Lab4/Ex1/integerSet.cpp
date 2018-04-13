/**
 *
 * autor: Pedro Ruiz
 * data: 12/4/2018
 * código matéria: CC3642
 * 
 * propósito: implementaçao dos metodos
 */


#include <iostream>
using namespace std;

#include "integerSet.h"

//construtor que inicializa tamanho em 0
IntegerSet::IntegerSet() {
	p = NULL;
	size = 0;
}
//contrutor que coloca numero digitado pelo usuario no conjunto 
//e aumenta o tamanho
IntegerSet::IntegerSet(int b[], int n) {
	p = NULL;
	size = 0;
	for (int i = 0; i < n; i++) {
		insertElement(b[i]);
		size++;
	}
}

//contrutor que faz novo conjunto com novo tamanho e os novos valores
IntegerSet::IntegerSet(IntegerSet &s) {
	if (s.size > 0) {
		p = new int[s.size];
		for (int i = 0; i < s.size; i++) {
			p[i] = s.p[i];
		}
	}
	else {
		size = 0;
		p = NULL;
	}
	size = s.size;

}


const IntegerSet & IntegerSet::operator=(const IntegerSet &s) {
	if (s.size > 0) {
		p = new int[s.size];
		for (int i = 0; i < s.size; i++) {
			p[i] = s.p[i];
		}
	}
	else {
		size = 0;
		p = NULL;
	}
	size = s.size;
}

//insere elemento
void IntegerSet::insertElement(int n) {
	int *q;
	for (int i = 0; i < size; i++) {
		if (p[i] == n) {
			return;
		}
	}
	q = new int[size+1];
	for (int i = 0; i < size; i++) {
		q[i] = p[i];
	}
	q[size] = n;
	if (p != NULL) {
		delete [] p;
	}
	p = q;
	size++;
}

//deleta elemento
void IntegerSet::deleteElement(int n) {
	int f = 0;
	int *q;
	for (int i = 0; i < size; i++) {
		if (p[i] == n) {
			f = 1;
			break;
		}
	}
	if (f == 1) {
		if (size == 1) {
			delete [] p;
			p = NULL;
		}
		else {
			q = new int[size-1];
			int k = 0;
			for (int i = 0; i < size; i++) {
				if (p[i] != n) {
					q[k] = p[i];
					k++;
				}
			}
			delete [] p;
			p = q;
		}
		size--;
	}
}

//imprime conjunto
void IntegerSet::printSet() {
	for (int i = 0; i < size; i++) {
		cout <<p[i] <<" ";
	}
	if (size == 0) {
		cout <<"---";
	}
	cout <<"\n";
}	

//faz uniao dos conjuntos
IntegerSet IntegerSet::unionOfSets(IntegerSet s) {
	IntegerSet tmp;
	
	for (int i = 0; i < size; i++) {
		tmp.insertElement(p[i]);
	}
	for (int i = 0; i < s.size; i++) {
		tmp.insertElement(s.p[i]);
	}
	return tmp;
}

//faz intersecçao dos conjuntos
IntegerSet IntegerSet::intersectionOfSets(IntegerSet s) {
	IntegerSet tmp;
	
	for (int i = 0; i < size; i++) {
		for (int j = 0; j < s.size; j++) {
			if (p[i] == s.p[j]) {
				tmp.insertElement(p[i]);
			}
		}
	}
	return tmp;
}
//destrutor que desaloca memoria
IntegerSet::~IntegerSet() {
	if (p != NULL) {
		delete [] p;
		p = NULL;
		size = 0;
	}
}