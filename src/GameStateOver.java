import java.awt.Graphics;
import java.awt.event.MouseEvent;

public class GameStateOver implements GameState {
	
	public void start() {}
	public void turno1() {}
	public void turno2() {}
	public void go() {}
	public void update() {}
	
	private GameContext context;
	public void setContext(GameContext context) {
		this.context = context;
		
	}
	
	public void clickMouse(MouseEvent e) {	
	}
	
	public void draw(Graphics dbg) {
		dbg.drawImage((ImageLoader.getImageLoader().getImage(10)),0,0,null);
	}

}
