package emp;
import client.Client;
import company.Company;
import project.Project;
public class Employee {
    private void empName(){
        System.out.println("Employee Name ");
    }
    public static void main(String[]args){
        Employee e = new Employee();
        Client c = new Client();
        Company o = new Company();
        Project p = new Project();
        e.empName();
        c.clientName();
        o.companyName();
        p.projectName();
    }
}
