//Jacob Steckel 
//CSC 142-02
public class temperaturePoint
{
   int temperature;
   
   public temperaturePoint()
   {
      
   }
   
   public temperaturePoint(int temp)
   {
      temperature=temp;
   }
   
   public int getTemp()
   {
      return temperature;
   }
   public void setTemp(int temp)
   {
      temperature=temp;
   }
   
   public boolean isEthylFreezing(int temp)
   {
      if(temp<=-173)
      return true;
      else
      return false;
   }
   public boolean isEthylBoiling(int temp)
   {
      if(temp>=172)
      return true;
      else
      return false;
   }
   
   public boolean isOxygenFreezing(int temp)
   {
      if(temp<=-362)
      return true;
      else
      return false;
   }
   public boolean isOxygenBoiling(int temp)
   {
      if(temp>=-306)
      return true;
      else
      return false;
   }
   
   public boolean isWaterFreezing(int temp)
   {
      if(temp<=32)
      return true;
      else
      return false;
   }

   public boolean isWaterBoiling(int temp)
   {
      if(temp>=212)
      return true;
      else
      return false;
   }

}