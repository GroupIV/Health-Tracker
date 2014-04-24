import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

//CSE 360 Group IV Project "Health Tracker"
//This class should calculate the users HealthScore based on the average scores for that month for that user and diplay them ou to the user. The user may also choose to print the monthly record out before exiting.

public class MonthlyRecord {
	
	// Data
	List <DailyRecord> records;
	private ArrayList <Double> bloodSugar, calories, cardio, diastolic, systolic, pulse, sleep, strength, weight, work;

	public MonthlyRecord(List<DailyRecord> newRecords){
		bloodSugar= new ArrayList<Double>();
		calories = new ArrayList<Double>();
		cardio = new ArrayList<Double>();
		diastolic = new ArrayList<Double>();
		systolic = new ArrayList<Double>();
		pulse = new ArrayList<Double>();
		sleep = new ArrayList<Double>();
		strength = new ArrayList<Double>();
		weight = new ArrayList<Double>();
		work = new ArrayList<Double>();
		
		records = newRecords;
		for (int m = 0; m < records.size(); m++){
			DailyRecord index = records.get(m);
			this.bloodSugar.add(index.getBloodSugar());
			this.calories.add(index.getCaloriesConsumed());
			this.cardio.add(index.getCardio());
			this.diastolic.add(index.getDiastolicBP());
			this.systolic.add(index.getSystolicBP());
			this.pulse.add(index.getPulse());
			this.sleep.add(index.getSleep());
			this.strength.add(index.getStrength());
			this.weight.add(index.getWeight());
			this.work.add(index.getWork());
		}
			
	}
	
	
	public String bloodSugarAverage() {
		return formattedOutput("Blood Sugar", bloodSugar, "mg/dL");
	}
	
	public String caloriesAverage() {
		return formattedOutput("Calories Consumed", calories, "calories");
	}
	
	public String cardioAverage() {
		return formattedOutput("Cardio", cardio, "hours");
	}
	
	public String diastolicAverage() {
		return formattedOutput("Diastolic Blood Pressure", diastolic, "mmHg");
	}
	
	public String systolicAverage() {
		return formattedOutput("Systolic Blood Pressure", systolic, "mmHg");
	}
	
	public String pulseAverage() {
		return formattedOutput("Pulse", pulse, "BPM");
	}
	
	public String sleepAverage() {
		return formattedOutput("Sleep", sleep, "hours");
	}
	
	public String strengthAverage() {
		return formattedOutput("Strength Training", strength, "hours");
	}
	
	public String weightAverage() {
		return formattedOutput("Weight", weight, "lbs");
	}
	
	public String workAverage() {
		return formattedOutput("Work", work, "hours");
	}


	
	public String formattedOutput (String title, ArrayList<Double> data, String units){
		String output = new String();
		double average = average(data);
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		output = title + " Average = " + df.format(average) + " " + units;
		
		return output;

	}
	
	public double average (ArrayList <Double> list) {
		double x = 0;
		for (int j = 0; j < list.size(); j++){
			x += list.get(j);
		}
		x = x / list.size();
		
		return x;
	}
	
	

}
