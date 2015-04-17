import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.general.*;
import org.jfree.data.time.*;

import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.*;

public class GraphMonthly {
	//Attribute
	private List <DailyRecord> dailyRecords;
	
	private ArrayList <Double> bloodSugar, calories, cardio, diastolic, systolic, pulse, sleep, strength, weight, work;
	private ArrayList <Date> dates;
	private MonthlyRecord averageRecords;
	
	//Constructor
	GraphMonthly(List<DailyRecord> records) {
		
		Calendar currentDate = Calendar.getInstance();
		
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
		
		this.averageRecords = new MonthlyRecord(records);
		
		//This for loop goes through all of the daily records and adds only the current month's records into the graphs.
		for (int i = 0; i < dailyRecords.size(); i++) {
			if (!dailyRecords.isEmpty() && dailyRecords.get(i).getDate().get(Calendar.MONTH) == currentDate.get(Calendar.MONTH) && dailyRecords.get(i).getDate().get(Calendar.YEAR) == currentDate.get(Calendar.YEAR)){
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
		
	}
	
	ChartPanel pieGraph () {
		DefaultPieDataset objDataset = new DefaultPieDataset();
		objDataset.setValue("Strength", averageRecords.average(averageRecords.getStrengthList()));
		objDataset.setValue("Sleep", averageRecords.average(averageRecords.getSleepList()));
		objDataset.setValue("Cardio", averageRecords.average(averageRecords.getCardioList()));
		objDataset.setValue("Work", averageRecords.average(averageRecords.getWorkList()));
		
		// Added Calories as a graph to better represent the amount of calories consumed during the month
		objDataset.setValue("Calories", averageRecords.average(averageRecords.getCaloriesList()));

		JFreeChart objChart = ChartFactory.createPieChart(
				"",
				objDataset,
				true,
				true,
				false
				);
		
		PiePlot plot = (PiePlot)objChart.getPlot();
		plot.setSectionPaint("Strength", new Color(11,95,165));
		plot.setSectionPaint("Sleep", new Color(4,60,107));
		plot.setSectionPaint("Cardio", new Color(63,143,210));
		plot.setSectionPaint("Work", new Color(102,161,210));
		
		// Added pie graph for calories and set the color as green2 in RGB
		plot.setSectionPaint("Calories", new Color(0,238,0));

		ChartPanel panel = new ChartPanel(objChart);
		
		return panel;
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


	// Blood pressure is broken back into two seperate grpahs to allow the user to better visualize the data on a smaller scope
	// Changed graph Y-axis title
	ChartPanel diastolicGraph() {
		return this.createChartPanel(diastolic, "Diastolic", "Diastolic", "Time");
	}

	ChartPanel systolicGraph() {
		return this.createChartPanel(diastolic, "Systolic", "Systolic", "Time");
	}

	

	
	ChartPanel createChartPanel (ArrayList<Double> data, String seriesTitle, String graphTitle, String y) {
		TimeSeries series = this.generateSeries(dates, data, seriesTitle);
		TimeSeriesCollection dataset = new TimeSeriesCollection();
		dataset.addSeries(series);
		
		JFreeChart chart = ChartFactory.createTimeSeriesChart (
			"",
			"Date",
			y,
			dataset,
			false,
			true,
			false);
		
		XYPlot plot = (XYPlot) chart.getPlot();
		DateAxis axis = (DateAxis) plot.getDomainAxis();
		axis.setDateFormatOverride(new SimpleDateFormat("dd/MM"));
		plot.getRangeAxis().setStandardTickUnits(NumberAxis.createIntegerTickUnits());
		
		Font font3 = new Font("Dialog", Font.BOLD, 14);
		plot.getDomainAxis().setLabelFont(font3);
		plot.getRangeAxis().setLabelFont(font3);
		
		XYLineAndShapeRenderer renderer = (XYLineAndShapeRenderer) plot.getRenderer();
		
		renderer.setSeriesShapesVisible(0, true);
		
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
