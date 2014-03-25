
public class DailyRecord
{
	//Attributes
	private 
		double cardio;
		double strength;
		double work; 
		double sleep;
		double systolicBP;
		double diastolicBP;
		double weight;
		double caloriesConsumed;
		double bloodSugar;
		double pulse;
		
	//Methods
	public
		//Constructor - Only way to set values, since daily records, once submitted, are set in stone
		DailyRecord(double cardioIni, double strengthIni, double workIni, double sleepIni, double systolicBPIni, double diastolicBPIni, double weightIni, double caloriesConsumedIni, double bloodSugarIni, double pulseIni)
		{
			cardio = cardioIni;
			strength = strengthIni;
			work = workIni;
			sleep = sleepIni;
			systolicBP = systolicBPIni;
			diastolicBP = diastolicBPIni;
			weight = weightIni;
			caloriesConsumed = caloriesConsumedIni;
			bloodSugar = bloodSugarIni;
			pulse = pulseIni;
		}
	
		//Access methods for all values of DailyRecord.
		double getCardio()
		{
			return cardio;
		}
		
		double getStrength()
		{
			return strength;
		}
		
		double getWork()
		{
			return work;
		}
		
		double getSleep()
		{
			return sleep;
		}
		
		double getSystolicBP()
		{
			return systolicBP;
		}
		
		double getDiastolicBP()
		{
			return diastolicBP;
		}
		
		double getWeight()
		{
			return weight;
		}
		
		double getCaloriesConsumed()
		{
			return caloriesConsumed;
		}
		
		double getBloodSugar()
		{
			return bloodSugar;
		}
		
		double getPulse()
		{
			return pulse;
		}
}
