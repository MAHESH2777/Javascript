class Employee
{
	int empId;
	String empName;
	int sal;
	public Employee(int empId,String empName,int sal)
	{
		this.empId=empId;
		this.empName=empName;
		this.sal=sal;
		
	}
	public Employee()
	{
	}
	public show(int empId,String empName,int sal)
	{
	
		this.empId=empId;
		this.empName=empName;
		this.sal=sal;
	}
	public String toString()
	{
		return empId+"  "+empName+"  "+sal;
	}
	public static void main(String[] d)
	{	
		Employee e1=new Employee(456,"Mani",34000);
		Employee e2=new Employee();
		e2.show(789,"Afzal",50000);
		System.out.println(e2);
		
	}
}
	