import java.util.Scanner;

public class clock {

	public static void main(String[] args) {
		
		int hour = 0;
		int minute = 0;
		String minuteString = "";
		String hourWord = "";
		String minuteWord = "";
		String amOrPm = "";
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter hour: ");
		hour = scanner.nextInt();
		System.out.print("Enter minutes: ");
		minute = scanner.nextInt();
		
		String hours[] = {"Tweleve", "One", "Two", "Three",
				"Four", "Five", "Six", "Seven", "Eight",
				"Nine", "Ten", "Eleven"};
		
		String minutes[] = {"O'clock", "One", "Two", "Three",
				"Four", "Five", "Six", "Seven", "Eight",
				"Nine"};
		
		String minutesTeens[] = {"Ten", "Eleven", "Twelve",
				"Thirteen", "Fourteen", "Fifteen", "Sixteen",
				"Seventeen", "Eighteen", "Nineteen"};
		
		String minutesModifier[] = {"Twenty", "Thirty", "Forty",
				"Fifty"};
		
		if (hour > 11)
		{
			hourWord = hours[hour-12];
			amOrPm = "PM";
		}
		else
		{
			hourWord = hours[hour];
			amOrPm = "AM";
		}
		
		if (minute < 10)
		{
			minuteWord = "O'" + minutes[minute];
		}
		else if (minute >=10 && minute <20)
		{
			minuteWord = minutesTeens[minute - 10];
		}
		else 
		{
			minuteString = Integer.toString(minute);
			char[] minuteDigits = String.valueOf(minuteString).toCharArray();
			if (minuteDigits[1] == 0)
			{
				minuteWord = minutesModifier[Character.getNumericValue(minuteDigits[0])];
			}
			else
			{
				minuteWord = minutesModifier[Character.getNumericValue(minuteDigits[0]-2)] + " " +
						minutes[Character.getNumericValue(minuteDigits[1])];
			}
		}
		
		System.out.println("It's " + hourWord + " " + 
				minuteWord + " " + amOrPm);
	}
}