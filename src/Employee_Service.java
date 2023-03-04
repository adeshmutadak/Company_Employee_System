import javax.swing.*;
import java.util.HashSet;
import java.util.Scanner;

public class Employee_Service {
    HashSet<Employee> empset=new HashSet<Employee>();
    Employee em1= new Employee(101,"adesh" ,22,"IT" ,"Devloper" ,60000);
    Employee em2= new Employee(102,"swapnil" ,23,"C0" ,"tester" ,55000);
    Employee em3= new Employee(103,"rushi" ,21,"Admin" ,"Deops Eng" ,40000);
    Employee em4= new Employee(104,"krishna" ,24,"CO" ,"System eng." ,45000);
     Scanner scn=new Scanner(System.in);
    //boolean found=false;
    boolean found=true;
     int id;
     String name;
     int age;
     String department;
     String designation;
     double salary;

    public Employee_Service(){
        empset.add(em1);
        empset.add(em2);
        empset.add(em3);
        empset.add(em4);
    }

    // view All Employees
    public void viewAllEps(){
        for(Employee emp : empset){
       System.out.println(emp);
        }
    }
    //view Emps Based on their ID
    public  void viewEmps(){
        boolean found=false;

        System.out.println("Enter ID");
       id=scn.nextInt();
        for(Employee emp:empset ){
            if (emp.getId()==id) {
                System.out.println(emp);
                found = true;
            }
        }
        if(!found) {
            System.out.println("ID not Found ");
        }

    }
 // update Employees
    public  void updateEmps(){
        System.out.println("Enter ID");
        id=scn.nextInt();
        boolean found=false;
        for(Employee emp:empset){
            if(emp.getId()==id) {
                System.out.println("Enter Name");
                name=scn.next();
                System.out.println("Enter New Salary");
                salary=scn.nextDouble();

                emp.setName(name);
                emp.setSalary(salary);
                System.out.println("Upadted Details of employee");
                found=true;


            }
        }
        if(!found){
            System.out.println("Employee is not present");
        }else {
            System.out.println("Employee details updated successfully !!");
        }
    }
     // delete emopolyee
    public void deleteEmps(){
        System.out.println("Enter Empolyee ID");
        id=scn.nextInt();
        Employee deleterEmp=null;
         boolean found=false;
        for(Employee emp:empset){
            if(emp.getId()==id){
             deleterEmp=emp;
             found =true;
            }
        }
        if(!found){
            System.out.println("ID not Found ,Operation Unsuccesful !!");
        }else {
            empset.remove(deleterEmp);
            System.out.println("Employee Delete Successfully !!");
        }
    }
  // Function for Add Emolyee
    public  void addEmpoyee(){
        boolean found=false;
        System.out.println("Enter ID");
        id=scn.nextInt();
        for(Employee emp:empset){
            if(emp.getId()==id){
                found=true;

            }

        }
        if(found){
            System.out.println("Already present");

        }else {
            System.out.println("Added");
        }





        System.out.println("Enter Name");
        name=scn.next();
        System.out.println("Enter Age");
        age=scn.nextInt();
        System.out.println("Enter Designation");
        designation=scn.next();
        System.out.println("Enter Department");
        department=scn.next();
        System.out.println("Enter Salary");
        salary=scn.nextDouble();
        Employee emp=new Employee(id,name,age,designation,department,salary);
        empset.add(emp);
        System.out.println(emp);
        System.out.println("Employee Added Successfully");
    }


}
