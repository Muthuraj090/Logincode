package org.emp;
public class Employee {			
				//empId
			public void empId() {
				System.out.println("417");	
			}
			//empName
			public void empName() {
				System.out.println("Muthu Kanagaraj");
			}
			//empDob
			public void empDob() {
				System.out.println("09-Apr-1994");
				}
			//empPhone
					public void empPhone() {
						System.out.println("9597959529");
					}
			//empEmail
					public void empEmail() {
						System.out.println("Muthukanagaraj93@gmail.com");
					}
			//empAddress
					public void empAddress() {
						System.out.println("Sholinganallur");
					}
		public static void main(String[] args) {
			Employee e = new Employee();
		e.empId();
		e.empName();
		e.empDob();
		e.empPhone();
		e.empAddress();
		e.empEmail();
		}

}
