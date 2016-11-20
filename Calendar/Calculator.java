public class Calculator {

	public static void main(String[] args) {

		LeapYearCalculator checkLeapYaer = new LeapYearCalculator(1500);
		
		checkLeapYaer.isLeapYear(checkLeapYaer.year);
		
		checkLeapYaer.displayCalendar();
		//System.out.println(checkLeapYaer.daysWeek(6,2019));
		
	}

}
