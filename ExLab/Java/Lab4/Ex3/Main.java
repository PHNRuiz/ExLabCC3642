/*
 * autor: Pedro Ruiz
 * data: 12/4/2018
 * código matéria: CC3642
 * propósito: juntar as classes Date e Time e testá-las
 *
 *
 *
 *
 *
 *
 */
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner( System.in );//tipo cin só que do Java
    
     //usuario fornece mes, dia, ano, hora, minuto e segundo
     System.out.println( "Entre com a data e hora" );   
     System.out.print( "Mes: " );   
     int month = input.nextInt();   
     System.out.print( "Dia: " );   
     int day = input.nextInt();   
     System.out.print( "Ano: " );   
     int year = input.nextInt();   
   
     System.out.print( "Horas: " );   
     int hour = input.nextInt();   
     System.out.print( "Minutos: " );   
     int minute = input.nextInt();   
     System.out.print( "Segundos: " );   
     int seconds = input.nextInt(); 
     
     //instancia objeto
     DateAndTime dateTime = new DateAndTime(   
         month, day, year, hour, minute, seconds );
         
     dateTime.tick();//incrementa segundo
     System.out.printf("Hora e data universal: %s\n", dateTime.toUniversalString());
     System.out.printf("Hora e data padrao: %s\n", dateTime.toString());
     
     dateTime.incrementMinute();//incrementa minuto
     System.out.printf("Hora e data universal: %s\n", dateTime.toUniversalString());
     System.out.printf("Hora e data padrao: %s\n", dateTime.toString());
     
     
     dateTime.incrementHour();//incrementa hora
     System.out.printf("Hora e data universal: %s\n", dateTime.toUniversalString());
     System.out.printf("Hora e data padrao: %s\n", dateTime.toString());
     
     
     
     
     
     
     
     
  }
}