/**
 *
 * autor: Pedro Ruiz
 * data: 12/4/2018
 * código matéria: CC3642
 * 
 * propósito: fazer operaçoes com conjuntos
 */


include <iostream>
using namespace std;

#include "integerSet.h"

int main() {
	//instanciando objetos
	IntegerSet s1;
	IntegerSet s2;
	IntegerSet s3;

	cout << "s1 = ";
	s1.printSet();//imprimindo conjunto vazio
	s1.insertElement(5);//adiccionando elemento
	cout << "s1 = ";
	s1.printSet();
	s1.deleteElement(5);//deletando elemento
	cout << "s1 = ";
	s1.printSet();
	s1.insertElement(8);
	s1.insertElement(23);
	cout << "s1 = ";
	s1.printSet();
	s2.insertElement(23);
	s2.insertElement(26);
	cout << "s2 = ";
	s2.printSet();
	s3 = s1.unionOfSets(s2);//uniao dos conjuntos
	cout << "s3 = s1 u s2: ";
	s3.printSet();
	s3 = s2.unionOfSets(s1);
	cout << "s3 = s2 u s1: ";
	s3.printSet();
	s3 = s1.intersectionOfSets(s2);//intersecçao dos conjuntos
	cout << "s3 = s1 n s2: ";
	s3.printSet();
	s3 = s2.intersectionOfSets(s1);
	cout << "s3 = s2 n s1: ";
	s3.printSet();
	s3 = s2.unionOfSets(s2);
	cout << "s3 = s2 u s2: ";
	s3.printSet();
	return 0;
}
	

