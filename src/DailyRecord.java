//Class: DailyRecord
//Description: Documents all the statistics needed for health tracking. Contains a date object to keep track of when
//		       the data was submitted as well as making comparing daily record dates possible.

import java.util.Calendar;
import java.io.Serializable;

public class DailyRecord implements Serializable {
	// Attributes
	private Calendar submittedDate; 
	private double cardio;
	private double strength;
	private double work;
	private double sleep;
	private double systolicBP;
	private double diastolicBP;
	private double weight;
	private double caloriesConsumed;
	private double bloodSugar;
	private double pulse;

	// Methods
	public// Constructor - Only way to set values, since daily records, once
			// submitted, are set in stone
	DailyRecord(double cardioIni, double strengthIni, double workIni,
			double sleepIni, double systolicBPIni, double diastolicBPIni,
			double weightIni, double caloriesConsumedIni, double bloodSugarIni,
			double pulseIni) {
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
		submittedDate = Calendar.getInstance();
	}

	// Access methods for all values of DailyRecord.
	double getCardio() {
		return cardio;
	}

	double getStrength() {
		return strength;
	}

	double getWork() {
		return work;
	}

	double getSleep() {
		return sleep;
	}

	double getSystolicBP() {
		return systolicBP;
	}

	double getDiastolicBP() {
		return diastolicBP;
	}

	double getWeight() {
		return weight;
	}

	double getCaloriesConsumed() {
		return caloriesConsumed;
	}

	double getBloodSugar() {
		return bloodSugar;
	}

	double getPulse() {
		return pulse;
	}
	
	Calendar getDate() {
		return submittedDate;
	}
	
	
}
