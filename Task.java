package Task3;

public class Task {

	private String name;
	private int workingHours; 
	
	//make a constructor with valid field
	Task (final String name, int workingHours) {
		setName (name);
		setWorkingHours (workingHours);
	}
	//make setter for name
	void setName (final String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
	}
	//make getter for name
	public String getName () {
		 return this.name;
	}
	//make setter for workingHours
	void setWorkingHours (int workingHours) {
		if (workingHours >= 0) {
			this.workingHours = workingHours;
		}
	}
	//make getter for workingHours
	int getWorkingHours () {
		return this.workingHours;
	}
	 
}
