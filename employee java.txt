public class Main
{
	public static void main(String[] args) 
	{
	    int employee_id=19121054;
	    String employee_name="Naveen";
	    String employee_address="Khammam";
	    int daywise_salary=1800;
	    int employee_workingdays=30;
	    int employee_absentdays=3;
	    int total_workingdays=employee_workingdays-employee_absentdays;
	    int salary=total_workingdays*daywise_salary;
	    System.out.println("employee_id = "+employee_id);
	    System.out.println("employee_name = "+employee_name);
	    System.out.println("employee_address = "+employee_address);
	    System.out.println("total_workingdays = "+total_workingdays);
            System.out.println("salary = "+salary);
	}
}