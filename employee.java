import java.util.*;

public class employee{
    int empId;
    String empName;
    double salary;

    employee(int id , String name, double sal ){
     empId= id;
     empName=name;
     salary=sal;
      
    }

    void displayEmployee(){
        System.out.println("ID:"+empId );
        System.out.println("Name:"+ empName);
        System.out.println("Salary:"+ salary);

    }
    public static void main(String[] args){
        //employee e1 = new employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter employee ID:");
        int id= sc.nextInt();
        sc.nextLine();
        System.out.println("enter empoylee Name:");
        String name= sc.nextLine();
        System.out.println("enter your salary:");
        double sal=sc.nextDouble();

        employee e1 = new employee(id, name, sal);
        

        e1.displayEmployee();
    }
    
}