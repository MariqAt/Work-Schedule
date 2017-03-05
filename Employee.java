package Task3;

public class Employee {

	private String name;
	private Task currentTask;
	private int hoursLeft = 8;
	private boolean isWorking;
	
	//make a constructor with one parameters
	public Employee(final String name) {
		setName (name);
	}
	//make getters and setters for all field with check for valid data
	public void setName (final String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
	}
	public String getName() {
		return this.name;
	}

	public Task getCurrentTask() {
		return this.currentTask;
	}

	public void setCurrentTask(final Task currentTask) {
		if (currentTask != null && currentTask.getWorkingHours() > 0) {
			this.currentTask = currentTask;
		}
	}

	public int getHoursLeft() {
		return this.hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {
		if (hoursLeft >= 0) {
			this.hoursLeft = hoursLeft;
		} 
	}
	public boolean isIsWorking() {
		return isWorking;
	}
	
	public void setIsWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}
	
	//make method without parameter
	public void work () {
		this.setIsWorking(false);
		//check if employee have current task and current task have working hours, then the employee starts work and isWorking = true
		if (this.getCurrentTask() != null && this.getCurrentTask().getWorkingHours() != 0 && this.getHoursLeft() != 0) {
			this.setIsWorking(true);
			//if working hours of employee are less than working hours of the task, hoursLeft = 0 and workingHours -= hoursLeft
				if (this.getHoursLeft() < this.getCurrentTask().getWorkingHours()) {
					this.getCurrentTask().setWorkingHours(this.getCurrentTask().getWorkingHours() - this.getHoursLeft());
					this.setHoursLeft(0);
				} else {
					//if working hours of employee are more than working hours of the task , hoursLeft -= workingHours  and workingHours = 0
					if (this.getHoursLeft() > this.getCurrentTask().getWorkingHours()) {
						this.setHoursLeft(this.getHoursLeft() - this.getCurrentTask().getWorkingHours());
						this.getCurrentTask().setWorkingHours(0);
						//if working hours of employee and hours for the task are equals
					} else {
						this.getCurrentTask().setWorkingHours(0);
						this.setHoursLeft(0);
					}
				}
			} 
		}
	//make a method who print info for employee if he is working
	public void showReport () {
		if (this.isIsWorking()) {
			System.out.println("Името на работника е: " +  this.getName());
			System.out.println("Името на задачата е: " + this.getCurrentTask().getName());
			System.out.println("Работните часове, които остават на работника са: " + this.getHoursLeft());
			System.out.println("Часовете, които остават за текущата задача на работника са: " + this.getCurrentTask().getWorkingHours());
			System.out.println();
		} else {
			if (this.getHoursLeft() == 0) {
			System.out.println("Работника " + this.getName() + " не е работил по задача: " + this.getCurrentTask().getName() + ", защото работния му ден е приключил.");
			System.out.println();
			} else {
				System.out.println("Работника " + this.getName() + " не е работил по задача: " + this.getCurrentTask().getName() + ", защото тя вече е изпълнена.");
				System.out.println();
			}
		}
	}
	
}
