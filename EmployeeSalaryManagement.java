class EmployeeManagementData{
    private int id;
    private String name;
    private double salary;

    public EmployeeManagementData(int id,String name,double salary) {
        this.id  = id;
        this.name  = name;
        this.salary = salary;
    }
    void allowenceSalary(int amount) {
        salary += amount;
    }

    void showDetails(){
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
    }
}
/*
Employee Salary Calculator
An Employee class with ID, name, basic salary.
Calculate total salary including allowances.      bacchader java oop problem 4
*/



public class EmployeeSalaryManagement {
    public static void main(String[] args) {
        EmployeeManagementData e1 = new EmployeeManagementData(100,"kuddus mia", 23333.200);
        e1.showDetails();
        System.out.println("------------------");
        e1.allowenceSalary(1000);
        System.out.println("---------------------");
        e1.showDetails();
    }
}
