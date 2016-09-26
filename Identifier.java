
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
		
		
	}
	
	public static void main(String[] args) {
		
		

	}

}
