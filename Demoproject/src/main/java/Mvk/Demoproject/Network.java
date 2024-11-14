package Mvk.Demoproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Network 
{
   @Autowired
   private  Airtel airtel;
   
   public void setAirtel(Airtel airtel) 
   {
	this.airtel = airtel;
   }
  
   @Autowired
   private  Jio jio;
   
   public Network(Jio jio)
   {
	this.jio = jio;
    }

public void network()
   {
	   System.out.println("The full network");
	   airtel.airtelfiber();
	   jio.jiofiber();
   }
   
}
