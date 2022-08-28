package org.company;

import org.emp.Employee;

public class CompanyInfo {

	//company Name
	public void companyName() {
		System.out.println("IVR Mobility");
	}
	//company ID
	public void companyId() {
		System.out.println("PNX 417");
		
	}
	
	//company Address
	public void companyAddress() {
		System.out.println("Sholinganallur");
		
	}
public static void main(String[] args) {
	CompanyInfo c = new CompanyInfo();
	Employee e = new Employee();
	e.empId();
	e.empName();
	e.empDob();
	e.empPhone();
	e.empAddress();
	e.empEmail();
	c.companyName();
	c.companyId();
	c.companyAddress();
}

}
