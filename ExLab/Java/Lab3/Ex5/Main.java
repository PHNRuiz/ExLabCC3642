/**
 *
 * autor: Pedro Ruiz
 * data: 22/3/2018
 * código matéria: CC3642
 * 
 * propósito: criar classe Rational e fazer opreçoes com fraçao
 */









class Main {
  public static void main(String[] args) {
    Rational r = new Rational(1,2);//1/2
    Rational r2 = new Rational(1,8);//1/8
    
    
    System.out.printf("Soma: %s\n", r.soma(r2));//1/2+1/8=5/8
    System.out.printf("Subtracao: %s\n", r.subtracao(r2));//1/2-1/8=3/8
    System.out.printf("Multiplicacao: %s\n", r.multiplica(r2));//1/2*1/8=1/16
    System.out.printf("Divisao: %s\n", r.divide(r2));//(1/2)/(1/8)=4
    System.out.printf("Representacao de r em string: %s\n", r.toString());//1/2                                                                      
    System.out.printf("Representacao de r2 em string: %s\n", r2.toString());//1/8
    System.out.printf("Representacao de r em ponto flutuante: %s\n", 
                      r.toFloatString(2));//1/2=0,5
    System.out.printf("Representacao de r2 em ponto flutuante: %s\n", 
                      r2.toFloatString(3));//1/8=0,125
    
    
  }
}