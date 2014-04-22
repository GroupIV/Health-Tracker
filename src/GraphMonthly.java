
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.general.*;
import org.jfree.data.time.*;

import java.util.*;

public class GraphMonthly {
	//Attribute
	private List <DailyRecord> dailyRecords;
	
	private ArrayList <Double> bloodSugar, calories, cardio, diastolic, systolic, pulse, sleep, strength, weight, work;
	private ArrayList <Date> dates;
	
	//Constructor
	GraphMonthly(List<DailyRecord> records) {
		
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
		dates = new ArrayList<Date>();
		
		this.dailyRecords = records;
		
		for (int i = 0; i < dailyRecords.size(); i++) {
			DailyRecord index = dailyRecords.get(i);
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
			this.dates.add(new Date(index.getDate().getTimeInMillis()));
		}
		
	}
	
	ChartPanel bloodSugarGraph (){
		return this.createChartPanel(bloodSugar, "Blood Sugar", "Blood Sugar (mg/dL)", "mg/dL"); 
	}
	
	ChartPanel calorieGraph(){
		return this.createChartPanel(calories, "Calories", "Calories", "Calories");
	}
	
	ChartPanel cardioGraph() {
		return this.createChartPanel(cardio, "Cardio", "Cardio Workout", "Hours");
	}
	
	ChartPanel pulseGraph() {
		return this.createChartPanel(pulse, "Pulse", "Pulse", "BPM");
	}
	
	ChartPanel sleepGraph() {
		return this.createChartPanel(sleep, "Sleep Time", "Sleep", "Hours");
	}
	
	ChartPanel strengthGraph() {
		return this.createChartPanel(strength, "Strength Training", "Strength Workout", "Hours");
	}
	
	ChartPanel weightGraph() {
		return this.createChartPanel(weight, "Weight", "Weight", "lbs");
	}
	
	ChartPanel workGraph() {
		return this.createChartPanel(work, "Work Hours", "Work Hours", "Hours");
	}

	ChartPanel bloodPressureGraph() {
		TimeSeries series1 = this.generateSeries(dates, systolic, "SystolicBP");
		TimeSeries series2 = this.generateSeries(dates, diastolic, "DiastolicBP");
		
		TimeSeriesCollection dataset = new TimeSeriesCollection();
		dataset.addSeries(series1);
		dataset.addSeries(series2);
		
		JFreeChart chart = ChartFactory.createTimeSeriesChart(
				"Blood Pressure",
				"Date",
				"mmHg",
				dataset,
				true,
				true,
				false);
		
		
		ChartPanel panel = new ChartPanel(chart);
		
		return panel;
		
	}
	
	ChartPanel createChartPanel (ArrayList<Double> data, String seriesTitle, String graphTitle, String y) {
		TimeSeries series = this.generateSeries(dates, data, seriesTitle);
		TimeSeriesCollection dataset = new TimeSeriesCollection();
		dataset.addSeries(series);
		
		JFreeChart chart = ChartFactory.createTimeSeriesChart (
			graphTitle,
			"Date",
			y,
			dataset,
			true,
			true,
			false);
		
		ChartPanel panel = new ChartPanel(chart);
		
		return panel;
		
	}
	
	
	


	 TimeSeries generateSeries (ArrayList <Date> dates, ArrayList <Double> data, String name) {
		
		TimeSeries pop = new TimeSeries (name);
		
		for (int i = 0; i < dates.size(); i++) {
			
			pop.add(new Day(dates.get(i)), data.get(i));
			
		}
		
		
		return pop;
	
	}

}