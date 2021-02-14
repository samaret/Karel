package week1;
import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {

	  public void run() {
		  while (frontIsClear()) {
			  move();
			  if (beepersPresent()) {
				  move();
			  } else {
				  turnLeft();
				  move();
				  while (beepersPresent()) {
					  pickBeeper();
				  }
				  turnAround();
				  move();
				  move();
				  while (beepersPresent()) {
					  pickBeeper();
				  }
				  turnAround();
				  move();
				  turnRight();
			  }
		  }
	  }
			
		 
	  
		  
}
	

