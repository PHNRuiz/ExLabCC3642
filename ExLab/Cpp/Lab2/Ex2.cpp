

/*
*autor: Pedro Henrique Nardoni Ruiz
*
*data: 9/3/2018
*
*codigo da materia: CC3642
*
*explicação: criar um programa com uma classe Date e exibir a data no formato mês/dia/ano
*
*/
#include <iostream>
using namespace std;




class Date{ //cria classe date
	public: //metodos da classe
		void setMes(int novoMes){ //função set mes com verificaçao de entrada
			if(novoMes < 1)
        mes = 1;
      else if(novoMes > 12)
        mes = 12;
      else
        mes = novoMes;
		}
		
		void setDia(int novoDia){ //função set dia com verificaçao de entrada
			if(novoDia < 1)
        dia = 1;
      else if(novoDia > 31)
        dia = 31;
      else
        dia = novoDia;
		}
		
		void setAno(int novoAno){ //função set ano com verificaçao de entrada
			if(novoAno < 0)
        ano = 0;
      else
        ano = novoAno;
		}
		
		int getMes(){ //função get mes
			return mes;
		}
		
		int getDia(){ //função get dia
			return dia;
		}
		
		int getAno(){ //função get ano
			return ano;
		}
		
		void displayDate(){ //função que imprime a data no formato mes/dia/ano
			cout<<getMes();
			cout<<"/";
			cout<<getDia();
			cout<<"/";
			cout<<getAno()<<endl;
		}
	
	private: //atributos da classe
		int dia;
		int mes;
		int ano;
};
int main() {
  Date d; //instanciando objeto
  
  d.setMes(3); //atribuindo o mes
  d.setDia(9); //atribuindo o dia
  d.setAno(2018); //atribuindo o ano
  d.displayDate(); //imprimindo
  
}