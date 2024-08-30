package lo;

public class Employee {

		//Instance variable or Global Variable or Class Variables
			int employId;
			String employeeName;
			String job;
			int salary;
			
		/*Now we are creating a Method. This is called as user defined Method
			Because we are creating our own method here*/
			void display() //Here method is not returning any value that’s why we use void keyword here. With the method return type is mandatory.

			{
				System.out.println("EmployId:"+employId );
				System.out.println(employeeName);
				System.out.println(job);
				System.out.println(salary);	
			}

			public static void main(String[] args) 
			{
				// TODO Auto-generated method stub

		//Objects should be get created only into the main method

				
					Employee emp1 = new Employee (); //Object1
					emp1.employId=101;
					emp1.employeeName="Rahul";
					emp1.job="Manager";
					emp1.salary=60000;
					
					Employee emp2 = new Employee (); //Object2
					emp2.employId=102;
					emp2.employeeName="Pratik";
					emp2.job="Developer";
					emp2.salary=50000;
				
					emp1.display();
					System.out.println();
					emp2.display();
					
				

	}

}



