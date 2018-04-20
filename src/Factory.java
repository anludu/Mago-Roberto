import java.io.IOException;

public class Factory {
	

	private static Factory instance;
    GameState start = null; 
    GameState go = null; 
    GameState turno1 = null; 
    GameState turno2 = null;
   
    

    private Factory(){
    }

    public static Factory getInstance(){
    	
      if(instance==null){
    	  
    	  instance= new Factory();
    	  
      }
      return instance;
    }
//turno nuevo
    public GameState createState(String tag){
    	
    	GameState currentState = null; 
    	
    	if(tag.equalsIgnoreCase("start")){
    	   		
	    		start = new GameStateStart();
	    	
	    		currentState = start;
       
      }
      if(tag.equalsIgnoreCase("turno1")){
    	  

	    	turno1 = new GameStateTurno1();
	    	currentState = turno1;
      }
      if(tag.equalsIgnoreCase("turno2")){
	
	    	turno2 = new GameStateTurno2();
	    	currentState = turno2;
      }

      if(tag.equalsIgnoreCase("GO")){
    	  
	    	go = new GameStateOver();
	    	currentState = go;
      }
      return currentState;
    }

}
