
public class ShowCurrentTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1. Obtain total milliseconds since 1 jan. 1970: totalMilliseconds
		
		long totalMilliseconds = System.currentTimeMillis();		
		
		// 2. Obtain total seconds by dividing totalMilliseconds by 1000: totalSeconds
		
		long totalSeconds = totalMilliseconds/1000;
		
		// 3. Compute current second by totalSeconds%60: currentSecond
		
		long currentSecond = totalSeconds%60;
		
		// 4. Obtain total minutes by dividing totalSeconds by 60: totalMinutes
		
		long totalMinutes = totalSeconds/60;
		
		// 5. Compute current minute by totalMinutes%60: currentMinute
		
		long currentMinute = totalMinutes%60;
		
		// 6. Obtain total hours by dividing totalMinutes by 60: totalHours
		
		long totalHours = totalMinutes/60;
		
		// 7. Compute current hour by totalHours%24: currentHour
		
		long currentHour = totalHours%24;
		
		// 8. Display current time by printing currentHour, currentMinute and currentSecond

		System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
	}

}
