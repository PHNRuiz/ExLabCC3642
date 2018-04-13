public class DateAndTime   
{   
   private int month; // 1-12   
   private int day; // 1-31 dependendo do mes
   private int year; // maior que 0   
   private int hour; // 0 - 23   
   private int minute; // 0 - 59   
   private int second; // 0 - 59   
   
   // construtor sem argumentos  
   public DateAndTime()   
   {   
      setDate( 1, 1, 2000 );   
      setTime( 0, 0, 0 );   
   }   
   
   // construtor   
   public DateAndTime( int theMonth, int theDay, int theYear,   
      int theHour, int theMinute, int theSecond )   
   {   
      setDate( theMonth, theDay, theYear );   
      setTime( theHour, theMinute, theSecond );   
   } 
   
   // seta um novo valor pra data    
   // faz validaçao da data. Seta data invalida pra 1  
   public void setDate( int theMonth, int theDay, int theYear )   
   {   
      month = checkMonth( theMonth ); // valida mes
      year = checkYear( theYear ); // valida ano   
      day = checkDay( theDay ); // valida dia        
   }   
   
   // seta um novo tempo  
   // seta valores invalidos pra 0   
   public void setTime( int h, int m, int s )   
   {   
      setHour( h ); // seta hora   
      setMinute( m ); // seta minuto   
      setSecond( s ); // seta segundo   
   }   
   
   // valida e seta hora    
   public void setHour( int h )    
   {    
      hour = ( ( h >= 0 && h < 24 ) ? h : 0 );    
   }    
   
   // valida e seta minuto    
   public void setMinute( int m )    
   {    
      minute = ( ( m >= 0 && m < 60 ) ? m : 0 );    
   }    
   
   // valida e seta segundo   
   public void setSecond( int s )    
   {    
      second = ( ( s >= 0 && s < 60 ) ? s : 0 );    
   }    
   
   // metodos get   
   // get valor da hora  
   public int getHour()    
   {    
      return hour;    
   }    
   
   // get valor do minuto  
   public int getMinute()    
   {    
      return minute;    
   }   
   
   // get valor do segundo   
   public int getSecond()    
   {    
      return second;    
   }   
   
   // incrementa o tempo em 1 segundo   
   public void tick()   
   {   
      setSecond( second + 1 );   
   
      if ( second == 0 )//se for 0 passa pro proximo minuto   
         incrementMinute();   
   }    
   
   // incrementa minuto   
   public void incrementMinute()   
   {   
      setMinute( minute + 1 );   
   
      if ( minute == 0 ) //se for 0 passa pra proxima hora  
         incrementHour();   
   }    
   
   // incrementa hora   
   public void incrementHour()   
   {   
      setHour( hour + 1 );   
   
      if ( hour == 0 )//se for 0 passa pro proximo dia   
         nextDay();   
   }   
   
   // metodo pra confirmar valor do ano   
   private int checkYear( int testYear )   
   {   
      if ( testYear > 0 ) // valida ano   
         return testYear;   
      else  
      {   
         System.out.printf( "Invalid year (%d) set to 1.\n", testYear );   
         return 1;   
      }    
   } 
      
   // metodo pra confirmar valor do mes   
   private int checkMonth( int testMonth )   
   {   
      if ( testMonth > 0 && testMonth <= 12 ) // valida mes   
         return testMonth;   
      else     
      {    
         System.out.printf( "Invalid month (%d) set to 1.\n", testMonth );   
         return 1; // mantem objeto em estado constante   
      }    
   }   
      
   // metodo pra confirmar valor do dia   
   // baseado no mes e no ano   
   public int checkDay( int testDay )   
   {   
      int daysPerMonth[] =   
         { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };   
   
      // checa se o dia corresponde ao maximo dependendo do mes   
      if ( testDay > 0 && testDay <= daysPerMonth[ month ] )   
         return testDay;   
   
      // ano bissexto   
      if ( month == 2 && testDay == 29 && ( year % 400 == 0 ||   
         ( year % 4 == 0 && year % 100 != 0 ) ) )   
         return testDay;   
   
      return 1; // mantem objeto em estado constante    
   }    
   
   // incrementa dia e checa se vai mudar o mes   
   public void nextDay()   
   {   
      int testDay = day + 1;   
   
      if ( checkDay( testDay ) == testDay )   
         day = testDay;   
      else   
      {   
         day = 1;   
         nextMonth();   
      }  
   }    
   
   // incrementa o mes e checa se vai mudar o ano   
   public void nextMonth()   
   {   
      if ( 12 == month )   
        year++;   
   
      month = month % 12 + 1;   
   }    
   
   // converte string pra formato universal do tempo   
   public String toUniversalString()   
   {   
      return String.format( "%d/%d/%d: %02d:%02d:%02d",   
         month, day, year, getHour(), getMinute(), getSecond() );   
   }    
   
   // converte string pra formato padrao de tempo  
   public String toString()   
   {   
      return String.format( "%d/%d/%d: %d:%02d:%02d %s",   
         month, day, year,   
         ( (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12 ),   
         getMinute(), getSecond(), ( getHour() < 12 ? "AM" : "PM" ) );   
   }   
}    