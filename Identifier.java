import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Identifier {
	
	public enum GRADES {
		
		TWELVE("12"),
		ELEVEN("11"),
		TEN("10"),
		NINE("9"),
		EIGHT("8"),
		SEVEN("7"),
		SIX("6"),
		FIVE("5"),
		FOUR("4"),
		THREE("3"),
		TWO("2"),
		ONE("1"),
		SK("Senior Kindergarten"),
		JK("Junior Kindergarten");
		
		private final String grade;

	    GRADES(String grade) {
	        this.grade = grade;
	    }
	    
	    public String getGrade() {
	        return this.grade;
	    }
	    
		
	}
	
	class Student {
		
		public String _firstName;
		public String _lastName;
		public String _middleInitial;
		public String _dateOfBirth; //dd/mm/yyyy
		public GRADES _grade;
		public boolean _identified;
		
		//constructor
		public Student (String firstName,String lastName,String middleInitial,String dateOfBirth, GRADES grade, boolean identified) {
			
			this._firstName = firstName;
			this._lastName = lastName;
			this._middleInitial = middleInitial;
			this._dateOfBirth = dateOfBirth;
			this._grade = grade;
			this._identified = identified;
		}
		
		//getter
		public String getFirstName() { return this._firstName; }
		public String getLastName() { return this._lastName; }
		public String getMiddleInitial() { return this._middleInitial; }
		public String getDateOfBirth() { return this._dateOfBirth; }
		public GRADES getGrade() { return this._grade; }
		public boolean getIdentified() { return this._identified; }
		
		//setter
		public void setFirstName(String firstName) { this._firstName = firstName; }
		public void setLastName(String lastName) { this._lastName = lastName; }
		public void setMiddleInitial(String middleInitial) { this._middleInitial = middleInitial; }
		public void setDOB(String DOB) { this._dateOfBirth = DOB; }
		public void setGrade(GRADES grade) { this._grade = grade; }
		public void setIdentified(boolean identified) { this._identified = identified; }
		
	}
	
	public static void main(String[] args) throws IOException {
		
		boolean moreStudents = true;
		
		String firstName;
		String lastName;
		String dateOfBirth;
		String middleInitial;
		GRADES grade; 
		String gradeString;
		boolean identified = false;
		
		for (int counter = 0; moreStudents == true; counter++) {
		
		    InputStreamReader r = new InputStreamReader(System.in);
		    BufferedReader br = new BufferedReader(r);
		    
		    System.out.println("Enter a first name for student # " + (counter + 1) + ".");
		    firstName = br.readLine();
		    
		    System.out.println("Enter a last name for student # " + (counter + 1) + ".");
		    lastName = br.readLine();
		    
		    System.out.println("Enter a date of birth (DD/MM/YYYY) for student # " + (counter + 1) + ".");
		    dateOfBirth = br.readLine();
		    
		    System.out.println("Enter a middle initial for student # " + (counter + 1) + ".");
		    middleInitial = br.readLine();
		    
		    System.out.println("Enter a grade (as plain text: JK-TWELVE) for student # " + (counter + 1) + ".");
		    gradeString = br.readLine();
		    grade = GRADES.valueOf(gradeString.toUpperCase());
		    
		    
		    System.out.println("Is student # " + (counter + 1) + " identified? Y/N");
		    
		    if (br.readLine()== "Y") {
		    	
		    	identified = true;
		    	;
		    }
		    
		    Student currentStudent = new Student(firstName, lastName, dateOfBirth, middleInitial, grade, identified);
		    System.out.println(firstName);
		    //currentStudent.setFirstName(firstName);
		    
		    
		    
		    
		    
		}
		

	}

}
