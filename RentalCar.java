/**
   A rental car with static methods to count rented and available cars.
*/
public class RentalCar
{
   private boolean rented;
   private static int numRented = 0;
   private static int numAvailable;
   
   /**
      Constructs a rental car.
   */
   public RentalCar()
   { 
      rented = false;
      numAvailable++;
   }
   
   /**
      Get number of cars available.
      @return count of cars that are available
   */
   public static int numAvailable() 
   {
      return numAvailable;
   }
   
   /**
      Get number of cars rented.
      @return count of cars that are rented
   */
   public static int numRented() 
   {
      return numRented;
   }
   
   /**
      Try to rent this car.
      @return true if the car was successfully rented, false if it was already
      rented.
   */
   public boolean rentCar() 
   {
      if (!rented){
    	  numAvailable--;
    	  rented = true;
    	  numRented++;
    	  return true;
      }
      return false;
 }
   
   /**
      Return rented car.
      @return true if the car was previously rented and is now returned,
      false if it was not previously rented.
   */
   public boolean returnCar()
   {
	  if (rented){
		  numAvailable++;
		  numRented--;
		  rented = false;
		  return true;
	  }
	  return false;
   }
}