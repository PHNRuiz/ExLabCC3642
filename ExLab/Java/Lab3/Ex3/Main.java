/**
 *
 * autor: Pedro Ruiz
 * data: 22/3/2018
 * código matéria: CC3642
 * 
 * propósito: Criar classe Rectangle e calcular perimetro e area
 */





class Main {
  public static void main(String[] args) {
    Rectangle r1 = new Rectangle();//instanciando objeto
    r1.setLength(2.0);//setando comprimento=2
    r1.setWidth(3.0);//setando largura=3
    r1.area();//calculando area
    r1.perimetro();//calculando area
    System.out.printf("Length: %.2f\n", r1.getLength());
    System.out.printf("Width: %.2f\n", r1.getWidth());
    System.out.printf("Area: %.2f\n", r1.area());
    System.out.printf("Perimetro: %.2f\n", r1.perimetro());
    
  }
}