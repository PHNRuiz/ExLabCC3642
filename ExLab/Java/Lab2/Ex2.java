/**
 *
 * autor: Pedro Henrique Nardoni Ruiz
 * 
 * data: 9/3/2018
 * 
 * código matéria: CC3642
 * 
 * propósito: criar um programa com uma classe Date e exibir a data no formato mês/dia/ano
 */
 
package Ex2; 

class Date{   //cria classe date
    int mes;  //atributos da classe
    int dia;
    int ano;
    
    public void setMes(int novoMes){  //funçao set com verificação de entrada
        if(novoMes < 1)
            mes = 1;
        else if(novoMes > 12)
            mes = 12;
        else
            mes = novoMes;
    }
    
    public void setDia(int novoDia){ //função set com verificação de entrada
        if(novoDia < 1)
            dia = 1;
        else if(novoDia > 31)
            dia = 31;
        else
            dia = novoDia;
    }
    
    public void setAno(int novoAno){ //função set com verificação de entrada
        if(novoAno < 0)
            ano = 0;
        else
            ano = novoAno;
    }
    
    public int getMes(){  //função get
        return mes;
    }
    
    public int getDia(){  //função get
        return dia;
    }
    
    public int getAno(){  //função get
        return ano;
    }
    
    public void displayDate(){ 
        System.out.println(getMes() + "/" + getDia() + "/" + getAno());
    } //função que imprime data no formato mes/dia/ano
}



public class Ex2Java {
    public static void main(String[] args){ //classe main roda o programa
        Date d = new Date(); // instancia objeto
        
        d.setMes(3); //da o mes ao objeto
        d.setDia(2); //da o dia ao objeto
        d.setAno(2018); //da o ano ao objeto
        d.displayDate() // imprime a data escolhida 
    }
    
}