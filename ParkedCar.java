/*
Jake Steckel
Assignment 4
*/
public class ParkedCar
{
   String make;
   String model;
   String color;
   String licenseNum;
   int minutes;
   
   public ParkedCar(String mk,String mod,String col,String lic,int mins)
   {
      make=mk;
      model=mod;
      color=col;
      licenseNum=lic;
      minutes=mins;
   }
   public ParkedCar(ParkedCar car2)
   {
   
   }
   
   public String getMake()
   {
      return make;
   }
   public void setMake(String mk)
   {
      make=mk;
   }
   
   public String getModel()
   {
      return model;
   }
   public void setModel(String mod)
   {
      model=mod;
   }

   public String getColor()
   {
      return color;
   }
   public void setColor(String col)
   {
      color=col;
   }
    
   public String getLicenseNum()
   {
      return licenseNum;
   }
   public void setLicenseNum(String lic)
   {
      licenseNum=lic;
   } 
   
   public int getMinutes()
   {
      return minutes;
   }
   public void setMinutes(int mins)
   {
      minutes=mins;
   }
   public String toString()
   {
      return getMake()+" "+getModel()+", "+getColor()+", "+getLicenseNum();
   }           
}   