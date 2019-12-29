import java.util.*;

public class Main {
	
	public static int sID;
	public static String className, finalLetterGrade;
	public static double aGrade, qGrade, eGrade, finalGrade;
	
	public static void main(String[] args) {
		
		int numStudents;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter the number of students in the class: ");
		numStudents = input.nextInt();
		
		Gradebook[] g = new Gradebook[numStudents];
		
		Gradebook.setCourseName();
		
		for (int x = 0; x < numStudents; x++)
		{
			g[x] = new Gradebook();
			g[x].setStudentID();
			Gradebook.assignments();
			Gradebook.quizzes();
			Gradebook.exams();
			g[x].calculateFinalGrade();
			g[x].displayLetterGrade();			
		}
		
		System.out.println("\n ----FINAL STUDENT GRADES for " + Gradebook.getCourseName() + "-----------");
		System.out.println("\nStudentID \t\tFinal Percent \t\tFinal Grade");
		
		for (int x = 0; x < g.length; x++)
		{
			displayGrades(g[x]);
		}
		
	}
	
	public static void displayGrades(Gradebook g)
	{
		System.out.println("\n"+ g.getStudentID() + " \t\t\t " + g.getFinalGrade() + 
				" \t\t\t " + g.getLetterGrade());
	}

}
