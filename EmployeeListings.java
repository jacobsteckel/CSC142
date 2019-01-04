//Jake Steckel CSC141-13

public class EmployeeListings
{
   public static class Employee
   {
      private String name;
      private int idNum;
      private String department;
      private String position;
      
      public Employee(String n, int id, String dep, String pos)
      {
         name=n;
         idNum=id;
         department=dep;
         position=pos;
      }
      public Employee(String n, int id)
      {
         name=n;
         idNum=id;
         department="";
         position="";
      }
      public Employee()
      {
         name="";
         idNum=0;
         department="";
         position="";
      }
      public String getName()
      {
         return name;
      }
      public int getIdNum()
      {
         return idNum;
      }
      public String getDep()
      {
         return department;
      }
      public String getPos()
      {
         return position;
      }
      public void setName(String n)
      {
         name=n;
      }
      public void setIdNum(int id)
      {
         idNum=id;
      }
      public void setDep(String dep)
      {
         department=dep;
      }
      public void setPos(String pos)
      {
         position=pos;
      }
      public void display()
      {
         System.out.println(name+", "+idNum+", "+department+", "+position);
      }
      public String toString()
      {
         return ""+name+", "+idNum+", "+department+", "+position;
      }
   }
}