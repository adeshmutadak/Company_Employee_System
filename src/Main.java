import java.util.Scanner;

public class Main {
    Employee_Service service=new Employee_Service();
    static  boolean ordering =true;
    public static void menu(){
        System.out.println("-------------- Welcome to the Employee Mangenment System-----------"
               +"\n1. Add Employee"
                + "\n2.View Employee"
                +"\n3.Update Employee"
                +"\n4.Delete Empolyee"
               + "\n5.View All Employee"
                +"\n6.Exit");
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
     Employee_Service service=new Employee_Service();
   do {
       menu();
       System.out.println("Enter Your Choice");
       int choice=scn.nextInt();
       switch (choice){
           case 1:
               System.out.println("Add Employee");
               service.addEmpoyee();
               break;
           case 2:
               System.out.println("View Employee");
               service.viewEmps();
               break;
           case 3:
               System.out.println("Update Employee");
               service.updateEmps();
               break;
           case 4:
               System.out.println(" Delete Employee");
               service.deleteEmps();
               break;
           case 5:
               System.out.println("View All Employee");
               service.viewAllEps();
               break;
           case 6:
               System.out.println("Thank you For Using Application");
               System.exit(0);
           default:
               System.out.println("Plese Enter Valid Choice");
               break;
   
       }


   }while (ordering);

    }


}