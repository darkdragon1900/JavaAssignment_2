package javaAssignment2;

	public class Student {
	    private int rollNo;
	    private String name;
	    private String course;
	    private int mark;
	    private char grade;
	    private String result;

	    // Constructor
	    public Student(int rollNo, String name, String course, int mark) {
	        this.rollNo = rollNo;
	        this.name = name;
	        this.course = course;
	        this.mark = mark;
	        calculateGrade();
	        calculateResult();
	    }

	    // Function to assign values for rollNo, name, course, and mark
	    public void assignValues(int rollNo, String name, String course, int mark) {
	        this.rollNo = rollNo;
	        this.name = name;
	        this.course = course;
	        this.mark = mark;
	        calculateGrade();
	        calculateResult();
	    }

	    // Function to find out the grade for the student
	    private void calculateGrade() {
	        if (mark > 90) {
	            grade = 'A';
	        } else if (mark >= 80) {
	            grade = 'B';
	        } else if (mark >= 70) {
	            grade = 'C';
	        } else if (mark >= 60) {
	            grade = 'D';
	        } else {
	            grade = 'F';
	        }
	    }

	    // Function to find the result of the student
	    private void calculateResult() {
	        result = (mark > 60) ? "Pass" : "Fail";
	    }

	    // Function to print out the details of the student
	    public void printDetails() {
	        System.out.println("Roll No: " + rollNo);
	        System.out.println("Name: " + name);
	        System.out.println("Course: " + course);
	        System.out.println("Mark: " + mark);
	        System.out.println("Grade: " + grade);
	        System.out.println("Result: " + result);
	    }

	    public static void main(String[] args) {
	        // Example usage
	        Student student1 = new Student(1, "John", "Mathematics", 85);
	        student1.printDetails();
	    }
	}



