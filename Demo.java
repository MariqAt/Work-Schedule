package Task3;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee stamat = new Employee("Стамат Стаматов");
		Employee jivko = new Employee("Живко Здравков");
		
		Task paintCeiling = new Task("боядисване на таван", 6);
		Task paintWall = new Task("боядисване на стена", 3);
		Task putPlasterboard = new Task("поставяне на гипсокартон", 7);
		
		stamat.setCurrentTask(paintCeiling);
		stamat.work();
		stamat.showReport();
		
		stamat.setCurrentTask(paintWall);
		stamat.work();
		stamat.showReport();
		
		jivko.setCurrentTask(paintWall);
		jivko.work();
		jivko.showReport();
		 
		jivko.setCurrentTask(paintCeiling);
		jivko.work();
		jivko.showReport();
		
		paintWall.setWorkingHours(3);
		
		jivko.setCurrentTask(paintWall);
		jivko.work();
		jivko.showReport();
		
		jivko.setCurrentTask(putPlasterboard);
		jivko.work();
		jivko.showReport();
		
		stamat.setCurrentTask(putPlasterboard);
		stamat.work();
		stamat.showReport();
	}

}
