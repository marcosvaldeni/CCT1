public class Calculator {

	public static void main(String[] args) {

		LeapYearCalculator checkLeapYaer = new LeapYearCalculator(2019);
		
		checkLeapYaer.isLeapYear(checkLeapYaer.year);
		
		checkLeapYaer.displayCalendar();
		//System.out.println(LeapYearCalculator.daysWeek(2,2016));
		
	}

}
