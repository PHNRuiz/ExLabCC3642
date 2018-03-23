class Rectangle{
	//construtor que inicializa Rectangle
	public Rectangle(){
		length = 1;
		width = 1;
	}
	
	//metodo set para comprimento
	public void setLength(double len){
		if(len > 0 && len < 20)
			length = len;
	}
	//metodo set para largura
	public void setWidth(double wid){
		if(wid > 0 && wid < 20)
			width = wid;
	}
	//metodo get para comprimento
	public double getLength(){
		return length;
	}
	//metodo set para largura
	public double getWidth(){
		return width;
	}
	//metodo que calcula area do retangulo
	public double area(){
		return length * width;
	}
	//metodo que calcula perimetro do retangulo
	public double perimetro(){
		return length + length + width  + width;
	}
	
	
	
	
	
	private double length;//comprimento
	private double width;//largura
	
	
	
}