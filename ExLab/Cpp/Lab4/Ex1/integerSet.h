/**
 *
 * autor: Pedro Ruiz
 * data: 12/4/2018
 * código matéria: CC3642
 * 
 * propósito: "esqueleto" do codigo
 */

#ifndef INTEGERSET_H
#define INTEGERSET

class IntegerSet {
public://metodos
	IntegerSet();
	IntegerSet(IntegerSet &s);
	IntegerSet(int b[], int n);
	const IntegerSet &operator=(const IntegerSet &s);
	void insertElement(int n);
	void deleteElement(int n);
	void printSet();
	IntegerSet unionOfSets(IntegerSet s);
	IntegerSet intersectionOfSets(IntegerSet s);
	~IntegerSet();
private://atributos
	int *p;
	int size;
};
#endif