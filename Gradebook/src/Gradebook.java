import java.util.*;
public class Gradebook {
	
	private static Scanner input = new Scanner (System.in);
	private static double assignmentPercent, quizPercent, examPercent;
	private double finalPercent;
	private int studentID;
	private static String courseName;
	private String letterGrade;
	
	public Gradebook()
	{			
	}
	
	public Gradebook(int sID, String className, double finalGrade, String finalLetterGrade)
	{
		studentID = sID;
		courseName = className;
		finalPercent = finalGrade;
		letterGrade = finalLetterGrade;		
	}
	
	public int getStudentID()
	{
		return studentID;
	}
	
	public void setStudentID()
	{
		System.out.print("Please enter the student's ID: ");
		studentID = input.nextInt();
	}
	
	public static String getCourseName()
	{
		return courseName;
	}
	
	public static void setCourseName()
	{
		System.out.print("Please enter the course name: ");
		courseName = input.nextLine();
	}
	
	public static double assignments() {
		
		int numAssignments, assignmentGrade = 0;
		
		System.out.print("Please enter the total number of assignments: ");
		numAssignments = input.nextInt();
		
		for (int x = 1; x <= numAssignments; x++)
		{
			System.out.print("Please enter the grade for assignment " + x + " (out of 10): ");
			assignmentGrade += input.nextInt();		
		}
		
		assignmentPercent = (assignmentGrade * 100) / (numAssignments * 10);
		assignmentPercent = assignmentPercent * .7;
		
		return assignmentPercent;
	}
	
	public static double quizzes() {
		
		int numQuizzes, quizGrade = 0;
		
		System.out.print("Please enter the total number of quizzes: ");
		numQuizzes = input.nextInt();
		
		for (int x = 1; x <= numQuizzes; x++)
		{
			System.out.print("Please enter the grade for quiz " + x + " (out of 10): ");
			quizGrade += input.nextInt();
		}
		
		quizPercent = (quizGrade * 100) / (numQuizzes * 10);
		quizPercent = quizPercent * .2;
		
		return quizPercent;

	}
	
	public static double exams() {
		
		int numExams, examGrade = 0;
		
		System.out.print("Please enter the total number of exams: ");
		numExams = input.nextInt();
		
		for (int x = 1; x <= numExams; x++)
		{
			System.out.print("Please enter the grade for exam " + x + " (out of 10): ");
			examGrade += input.nextInt();
		}
		
		examPercent = (examGrade * 100) / (numExams * 10);
		examPercent = examPercent * .1;
		
		return examPercent;
	}
	
	public double getFinalGrade()
	{
		return finalPercent;
	}
	
	public void calculateFinalGrade() {
		
		finalPercent = assignmentPercent + quizPercent + 
				 examPercent;
	}
	
	public String getLetterGrade()
	{
		return letterGrade;
	}
	
	public void displayLetterGrade() {
		
		if (finalPercent>=90) {
			letterGrade = "A";
		}
		else if (finalPercent >= 80 && finalPercent < 90) {
			letterGrade = "B";
		}
		else if (finalPercent >=70 && finalPercent < 80) {
			letterGrade = "C";
		}
		else if (finalPercent >=60 && finalPercent < 70) {
			letterGrade = "D";
		}
		else{
			letterGrade = "F";
		}
	}
}
