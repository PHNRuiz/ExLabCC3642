/*
*autor: Pedro Henrique Nardoni Ruiz
*
*data: 9/3/2018
*
*codigo da materia: CC3642
*
*explicação: criar um programa com uma classe Funcionario e exibir seu salário
*
*/





#include <iostream>
#include <string>

using namespace std;

class Funcionario { //cria classe funcionario
public: //metodos da classe
	void setSobrenome(string newSobrenome) { //funçao set sobrenome
		sobrenome = newSobrenome;
	}

	void setNome(string newNome) { //funçao set nome
		nome = newNome;
	}

	void setSalario(double newSalario) { //funçao set salario com verificaçao                                      de entrada
		if (newSalario < 0) {
			salario = 0;
		} else {
			salario = newSalario;
		}
	}

	string getSobrenome() { //funçao get sobrenome
		return sobrenome;
	}

	string getNome() { //funçao get nome
		return nome;
	}

	double getSalario() { //funçao get salario
		return salario;
	}

	void imprime() { //funçao que imprime os atributos
		cout << "Nome:" << getNome() << endl;
		cout << "Sobrenome:" << getSobrenome() << endl;
		cout << "Salario anual:" << getSalario() * 12 << endl;
	}

private:  //atributos da classe
	string nome;
	string sobrenome;
	double salario;
};

int main() { //funçao main roda o programa
	Funcionario f1; //instanciando primeiro objeto

	f1.setNome("Pedro"); //dando nome
	f1.setSobrenome("Ruiz"); //dando sobrenome
	f1.setSalario(10); //dando salario

	Funcionario f2; //instanciando segundo objeto
	f2.setNome("Gilmar"); //dando nome
	f2.setSobrenome("Mendes"); //dando sobrenome
	f2.setSalario(50); //dando salario

	f1.imprime(); //imprimindo
	f2.imprime(); //imprimindo

	f1.setSalario(f1.getSalario() * 1.1); //aumentando 10% no salario
	f2.setSalario(f2.getSalario() * 1.1); //aumentando 10% no salario

	f1.imprime(); //imprimindo
	f2.imprime(); //imprimindo
}