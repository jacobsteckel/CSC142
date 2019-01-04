//Jacob Steckel 
//CSC 142-02
public class PetTest
{
   public static void main (String[]args)
   {
      Pet a = new Pet();
      a.setName("Bella");
      a.setAnimal("Dog");
      a.setAge(4);
      System.out.println("Name:"+a.getName());
      System.out.println("Animal:"+a.getAnimal());
      System.out.println("Age:"+a.getAge());
      System.out.println();
      
      Pet b = new Pet("Nemo","Fish");
      b.setAge(2);
      System.out.println("Name:"+b.getName());
      System.out.println("Animal:"+b.getAnimal());
      System.out.println("Age:"+b.getAge());
      System.out.println();

      
      
      Pet c = new Pet("Garfield","Cat",6);
      System.out.println("Name:"+c.getName());
      System.out.println("Animal:"+c.getAnimal());
      System.out.println("Age:"+c.getAge());
      System.out.println();

   }
}