package session9_assignment1;

public class Employee {
int emp_code;
String emp_name;

public Employee(int emp_code) {
	
	this.emp_code=emp_code;
	
	// TODO Auto-generated constructor stub
}


public Employee(String emp_name) {
	this.emp_name=emp_name;
}

public Employee() {
	// TODO Auto-generated constructor stub
}
public int getEmp_code() {
	return emp_code;
}


public void setEmp_code(int emp_code) {
	this.emp_code = emp_code;
}


public String getEmp_name() {
	return emp_name;
}


public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}
public String toString(){
	return emp_code+""+emp_name;
	
}
}