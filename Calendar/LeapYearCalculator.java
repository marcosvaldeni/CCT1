public class LeapYearCalculator {
	int year;

	public LeapYearCalculator(int year) {
		this.year = year;
	}

	void isLeapYear(int year) {
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("Yes! " + year + " is a leap year!");
			System.out.println("");
			System.out.println("");
		} else {
			System.out.println("No! " + year + " isn't a leap year!");
			System.out.println("");
			System.out.println("");
		}
	}

	void displayCalendar() {
		int m = 1;
		int m1 = 1;
		int m2 = 2;
		int m3 = 3;
		int daysQ1 = 1;
		int daysQ2 = 1;
		int daysQ3 = 1;
		String month;

		System.out.println("                                     " + year);
		while(m<=4){

			int d1 = 1;
			int d2 = 1;
			int d3 = 1;
			int w = 1;
			int i = 1;
			int spaceGenerator1 = 0;
			int spaceGenerator2 = 0;
			int spaceGenerator3 = 0;

			toRotatemonth(m1);
			toRotatemonth(m2);
			toRotatemonth(m3);
			System.out.print("Su Mo Tu We Th Fr Sa         Su Mo Tu We Th Fr Sa         Su Mo Tu We Th Fr Sa         ");
			System.out.println();
			
			daysQ1 = toRotateDays(m1);
			daysQ2 = toRotateDays(m2);
			daysQ3 = toRotateDays(m3);
			
			spaceGenerator1 = daysWeek(m1,year);
			spaceGenerator2 = daysWeek(m2,year);
			spaceGenerator3 = daysWeek(m3,year);
	
			while(w<=6){
				while(i<=7){
					
					if((d1<=daysQ1) && (spaceGenerator1 == 0)){
						
						if(d1<10){
							System.out.print(" " + d1 + " ");
						}else{
								System.out.print(d1 + " ");
						}
						if(d1 == daysQ1){
							spaceGenerator1 = 42 - daysQ1;
						}
						
						d1++;
					}else{
						
						System.out.print("   ");
						spaceGenerator1--;
					}
						
					if(i%7 == 0){
						System.out.print("        ");
					}

						i++;
				}

				i=1;
				while(i<=7){
						
					if((d2<=daysQ2) && (spaceGenerator2 == 0)){
							
						if(d2<10){
							System.out.print(" " + d2 + " ");
						}else{
							System.out.print(d2 + " ");
						}
						if(d2 == daysQ2){
							spaceGenerator2 = 42 - daysQ2;
						}
							
						d2++;
					}else{
							
						System.out.print("   ");
						spaceGenerator2--;
						}
						
						
						if(i%7 == 0){
							System.out.print("        ");
						}

					i++;
				}

				i=1;
				while(i<=7){
							
					if((d3<=daysQ3) && (spaceGenerator3 == 0)){
								
						if(d3<10){
							System.out.print(" " + d3 + " ");
						}else{
							System.out.print(d3 + " ");
						}
					if(d3 == daysQ3){
						spaceGenerator3 = 42 - daysQ3;
					}
								
					d3++;
					}else{
								
						System.out.print("   ");
						spaceGenerator3--;
					}
							
					if(i%7 == 0){
						System.out.print("        ");
					}

					i++;
				}

				i=1;
				System.out.println("");
				w++;
			}
				
		System.out.println("");
		m1 += 3;
		m2 += 3;
		m3 += 3;
		m++;
		}
	}

	static int toRotateDays(int months){
		int days = 0;
		
		if(months == 2){
			days = 29;
		}else if(months <= 7){
			if (months % 2 == 0) {
				days = 30;
			} else {
				days = 31;
			}
		}else{
			if (months % 2 == 0) {
				days = 31;
			} else {
				days = 30;
			}
		}

		return days;	
	}

	void toRotatemonth(int months) {

		if (months == 1) {
			System.out.print(  "      January                ");
		} else if (months == 2) {
			System.out.print(  "      February               ");
		} else if (months == 3) {
			System.out.println("       March                 ");
		} else if (months == 4) {
			System.out.print(  "       April                 ");
		} else if (months == 5) {
			System.out.print(  "        May                  ");
		} else if (months == 6) {
			System.out.println("       June                  ");
		} else if (months == 7) {
			System.out.print(  "       July                  ");
		} else if (months == 8) {
			System.out.print(  "       August                ");
		} else if (months == 9) {
			System.out.println("     September               ");
		} else if (months == 10) {
			System.out.print(  "      October                ");
		} else if (months == 11) {
			System.out.print(  "      November               ");
		} else if (months == 12) {
			System.out.println("      December               ");
		}
	}
	
	static int daysWeek(int month, int y){
		int a = ((12 - month) / 10);
        int b = y - a;
        int c = month + (12 * a);
        int d = b / 100;
        int e = d / 4;
        int f = 2 - d + e;
        int g = (int) (365.25 * b);
        int h = (int) (30.6001 * (c + 1));
        int i = (int) ((f + g) + (h + 1) + 5);
        int j = (int) (i % 7);
        return --j;
	}
}
