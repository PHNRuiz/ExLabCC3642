/**
 *
 * autor: Pedro Ruiz
 * data: 9/3/2018
 * código matéria: CC3642
 * 
 * propósito: criar um programa com uma classe Funcionario e exibir seu salário
 */
package Ex1;

class Funcionario {  //cria classe funcionario

    String nome;       //atributos da classe
    String sobrenome;   
    double salario;     

    public void setSobrenome(String novoSobrenome) { //função set
        sobrenome = novoSobrenome;
    }

    public void setSalario(double novoSalario) { 
        if (novoSalario < 0) {
            salario = 0;          //função set com verificação de valor
        } else {
            salario = novoSalario;
        }
    }

    public void setNome(String novoNome) {  //função set
        nome = novoNome;
    }

    public String getNome() {  //função get
        return nome;
    }

    public String getSobrenome() {  //função get
        return sobrenome;
    }

    public double getSalario() {     //função get
        return salario;
    }
    
    public void imprime(){ //função que imprime nome, sobrenome e salario
        System.out.println("nome: " + getNome());
        System.out.println("sobrenome: " + getSobrenome());
        System.out.println("salario anual: " + getSalario() * 12);
    }

}


public class Ex1 {

    
    
     

    // classe main roda o programa
    public static void main(String[] args) {

        Funcionario f = new Funcionario(); //instancia o objeto
        f.setNome("Adriano"); //da nome ao atributo nome do objeto
        f.setSobrenome("Lopes"); //da sobrenome ao atributo nome do objeto
        f.setSalario(30000.5);  //da salario ao atributo nome do objeto

        Funcionario g = new Funcionario();  //instancia o objeto
        g.setNome("Gilmar"); //da nome ao atributo nome do objeto
        g.setSobrenome("Mendes"); //da sobrenome ao atributo nome do objeto
        g.setSalario(999999); //da salario ao atributo nome do objeto
        
        f.imprime(); //imprime
        g.imprime(); //imprime

        f.setSalario(f.getSalario() * 1.1); //aumento de 10% no salario
        g.setSalario(g.getSalario() * 1.1); //aumento de 10% no salario
        
        f.imprime(); //imprime com salario alterado
        g.imprime(); //imprime com salario alterado
        
    }

}