public class Date{
	private int month; //1-12
	private int day; //1-31 dependendo do mes
	private int year; // maior que 0
	
	
	//construtor chama checkMonth pra confirmar valor do mes
 //tambem chama checkDay pra checar valor do dia
	public Date(int theMonth, int theDay, int theYear){
		month = checkMonth(theMonth);//valida mes
		year = checkYear(theYear);//valida ano
		day = checkDay(theDay);//valida dia
		System.out.printf("Construtor do objeto Date para data %s\n", this);
	}
	//metodo pra confirmar valor do ano
	private int checkYear(int testYear){
		if(testYear > 0)//validaçao do ano
			return testYear;
		else{//caso ano seja invalido
			System.out.printf("Ano invalido (%d) setado para 1.\n", testYear);
			return 1;//mantem objeto em estado constante
		}
	}
	//metodo pra confirmar valor do mes
	private int checkMonth(int testMonth){
		if (testMonth > 0 && testMonth <= 12)//validaçao do mes
			return testMonth;
		else{//mes invalido
			System.out.printf("Mes invalido (%d) setado para 1.\n", testMonth);
			return 1;//mantem objeto em estado constante
		}
		}	
	}
	//metodo pra confirmar dia baseado no ano e mes
	private int checkDay(int testDay){
		int daysPerMonth[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		//checa se dia ta de acordo com o maximo do mes
		if (testDay > 0 && testDay <= daysPerMonth[month])   
         return testDay; 
    //anos bissextos     
    if (month == 2 && testDay == 29 && ( year % 400 == 0 ||    
           (year % 4 == 0 && year % 100 != 0)))   
         return testDay;     
		System.out.printf("Dia invalido (%d) setado para 1.\n", testDay);
		return 1;//mantem objeto em estado constante
	}
	//incrementa o dia e checa se muda de mes
	public void nextDay(){
		int testDay = day + 1;
		if(checkDay(testDay) == testDay)
			day = testDay;
		else{
			day = 1;
			nextMonth();
		}
	}
	//incrementa mes e checa se vai mudar de ano
	public void nextMonth(){
		if(12 == month)
			year++;
			
		month = month % 12 + 1;	
	}
	//retorna string na forma mes/dia/ano
	public String toString(){
		return String.format("%d/%d/%d", month, day, year);
	}
	
	
	
}