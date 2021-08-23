
package associationdemo;
import java.util.Scanner;


class SmartCard
{
    int emp_idn;
    public void MarkAttendence(Employee e)
    {
        emp_idn = e.getEmpId();
        System.out.println("Employee "+ emp_idn + " is marked Present ");
    }
    
    public int getEmpIdn(Employee e)
    {
        return e.empid;
    }
}
class Employee
{
    int empid;
    Employee()
    {
        System.out.println("Enter Employee Id: ");
        Scanner sc = new Scanner(System.in);
        this.empid = sc.nextInt();
    }
    int getEmpId()
    {
         return empid;
    }
    
    public void Login(SmartCard sc)
    {
        int eid = sc.getEmpIdn(this);
        System.out.println("Login Successful for Employee " + eid);
    }
}
public class AssociationDemo {

    
    public static void main(String[] args) {
        System.out.println("*** ASSOCIATION BETWEEN EMPLOYEE AND SMARTCARD ***");
        Employee e = new Employee();
        System.out.println("New Employee is Created");
        SmartCard scd = new SmartCard();
        scd.MarkAttendence(e);
        e.Login(scd);
        
    }
    
}
