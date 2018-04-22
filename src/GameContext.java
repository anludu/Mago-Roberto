import java.awt.Graphics;
import java.awt.event.MouseEvent;

public class GameContext {

	private GameState start;
	private GameState turno1;
	private GameState turno2;
	private GameState go;//game over
	private GameState currentState;
	private GameState winner;

	
	
	public GameContext() {
		start = Factory.getInstance().createState("start");
        turno1 = Factory.getInstance().createState("turno1");
        turno2 = Factory.getInstance().createState("turno2");
        go = Factory.getInstance().createState("go");
        winner = Factory.getInstance().createState("winner");
        
        
        start.setContext(this);
        turno1.setContext(this);
        turno2.setContext(this);
        go.setContext(this);
        winner.setContext(this);
        
		currentState = Start();	
	}
	
	public GameState Start() {
		
		return start;
		
	}

	public GameState Turno1() {
		
		return turno1;
		
	}
	
	public GameState Turno2() {
		
		return turno2;
		
	}
	
	public GameState GameOver() {
		
		return go;
		
	}
	public GameState Winner() {
		
		return winner;
		
	}
	

	public void update() {
		
		currentState.update();
	}

	public void setState(GameState state) {
		
		currentState = state;
		
	}
	
	public void draw(Graphics dbg) {

		currentState.draw(dbg);
		
	}

	public void clickMouse(MouseEvent e) {currentState.clickMouse(e);}



}