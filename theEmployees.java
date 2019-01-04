//Jake Steckel CSC141-13

public class theEmployees extends EmployeeListings
{
   public static void main (String[]args)
      {
         Employee e1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
         e1.display();
         
         Employee e2 = new Employee("Mark Jones", 39119);
         e2.setDep("IT");
         e2.setPos("Programmer");
         System.out.println(e2);
         
         Employee e3 = new Employee();
         e3.setName("Joy Rogers");
         e3.setIdNum(81774);
         e3.setDep("Manufacturing");
         e3.setPos("Engineer");
         e3.display();
      }
}