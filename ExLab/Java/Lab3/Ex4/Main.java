/**
 *
 * autor: Pedro Ruiz
 * data: 22/3/2018
 * código matéria: CC3642
 * 
 * propósito: Aprimorar classe Time 2
 */













class Main {
  public static void main(String[] args) {
    Time2 t = new Time2();//instancia objeto
    t.setTime(20, 30, 00);//seta hora pra 20:30:00
    t.incrementMinute();//incrementa pra 20:31:00
    System.out.printf("Hora sem AM ou PM: %s\n", t.toUniversalString());
    System.out.printf("Hora com AM ou PM: %s\n", t.toString());
    t.incrementHour();//incrementa pra 21:30:00
    t.toString();
    t.toUniversalString();
    System.out.printf("Hora adiantada sem AM ou PM: %s\n", t      .toUniversalString());
    System.out.printf("Hora adiantada com AM ou PM: %s\n", t.toString());
    t.setTime(11, 59, 59);
    t.tick();//vira o dia pra 12:00:00 AM
    System.out.printf("Hora sem AM ou PM: %s\n", t.toUniversalString());
    System.out.printf("Hora com AM ou PM: %s\n", t.toString());
    
    
    
  }
}