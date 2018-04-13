/*
 * autor: Pedro Ruiz
 * data: 12/4/2018
 * código matéria: CC3642
 * propósito: Aprimorar classe Date e testá-la
 *
 *
 *
 *
 *
 *
 */











class Main {
  public static void main(String[] args) {
   System.out.println("Checando Incremento");
   //data de teste
   Date testDate = new Date(11, 27, 2010);
   //teste de incremento de dia, mes e ano
   for(int counter = 0; counter < 40; counter ++){
   	testDate.nextDay();
   	System.out.printf("Data Incrementada: %s\n", testDate.toString());
   }
  }
}