// This program defines Pet class
//Jacob Steckel 
//CSC 142-02
 public class Pet 
 {
 	//data fields
	String name, animal;
   int age;
   
	/**No-arg constructor */
	public Pet()
   {
      name="";
      animal="";
      age=0;
   }
	
	/**This constructor sets name and animal to passed values and age to 0 */
	public Pet(String n, String an)
   {
      name=n;
      animal=an;
      age=0;
   }
      
	/* 
      Constructor 
	   @param n
	   @param an
	   @param ag
	*/
   public Pet(String n, String an, int ag)
   {
      name=n;
      animal=an;
      age=ag;
   }

 	// Accessors
	public String getName()
   {
      return name;
   }
   
   public String getAnimal()
   {
      return animal;
   }
   
   public int getAge()
   {
      return age;
   }
 
 	//Mutators
   public void setName(String n)
   {
      name=n;
   }
	
   public void setAnimal(String an)
   {
      animal=an;
   }
   
   public void setAge(int ag)
   {
      age=ag;
   }
 }