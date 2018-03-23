public class Time2{
	private int hour;//0-23
	private int minute;//0-59
	private int second;//0-59
	
	
	//construtor sem argumento: inicializa cada variavel com zero.
	
	public Time2()
   {
      this( 0, 0, 0 );
   }
   
   //construtor Time2: hora fornecida, minuto e segundo setados em 0.
   public Time2( int h ) 
   { 
      this( h, 0, 0 );
   }
   //construtor Time2: hora e minutos fornecids, segundo setado em 0.
   public Time2( int h, int m ) 
   { 
      this( h, m, 0 );
   }
   //construtor Time2: hora, minuto e segundo fornecidos.
   public Time2( int h, int m, int s ) 
   { 
      setTime( h, m, s );
   }
   //construtor Time2: objeto fornecido.
    public Time2( Time2 time )
   {
      this( time.getHour(), time.getMinute(), time.getSecond());
   }
   //metodo set que configura novo valor de hora
   public void setTime( int h, int m, int s )
   {
      setHour( h ); 
      setMinute( m ); 
      setSecond( s ); 
   }
   //valida hora entre 0 e 24
   public void setHour(int h){
   	hour = ((h >= 0 && h < 24) ? h : 0);
   }
   //valida minuto entre 0-60
   public void setMinute(int m){
   	minute = ((m >= 0 && m < 60) ? m : 0);
   }
   //valida segundo entre 0-60
   public void setSecond(int s){
   	second = ((s >= 0 && s < 60) ? s : 0);
   }
   //obtem valor da hora
   public int getHour(){
   	return hour;
   }
   //obtem valor do minuto
   public int getMinute(){
   	return minute;
   }
   //obtem valor do segundo
   public int getSecond(){
   	return second;
   }
   //incrementa um segundo e se ele for zero, incrementa o proximo minuto
   public void tick(){
   	setSecond(second + 1);
   	if(second == 0)
   		incrementMinute();
   }
   //incrementa minuto
   public void incrementMinute(){
   	setMinute(minute + 1);
   	if(minute == 0)
   		incrementHour();
   }
   //incrementa hora
   public void incrementHour(){
   	setHour(hour + 1);
   }
   //converte string em formato padrao de hora (HH:MM:SS)
   public String toUniversalString(){
   	return String.format(
   		"%02d:%02d:%02d", getHour(), getMinute(), getSecond());
   }
   //converte string em formato padrao de hora (HH:MM:SS AM ou PM)
   public String toString(){
   	return String.format("%d:%02d:%02d %s",
   		((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
   		getMinute(), getSecond(), (getHour() <= 12 ? "AM" : "PM"));
   }
   
}