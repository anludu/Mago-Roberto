import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

public class GameStateWinner implements GameState {
	public void start() {}
	public void turno1() {}
	public void turno2() {}
	public void go() {context.setState(context.GameOver());}
	
	
	
	private GameContext context;
	private boolean select = true;
	
	public void setContext(GameContext context) {
		this.context = context;
	}

	public void update() {
		if (!select) {
			go();
		}
		
	}
	
	public void clickMouse(MouseEvent e) {
		select = false;
		
	}
	
	public void draw(Graphics dbg) {
		
		dbg.drawImage((ImageLoader.getImageLoader().getImage(11)),0,0,null);
		dbg.setFont(new Font("Times New Roman", Font.BOLD, 25  ));
		dbg.drawString("Tiempo ", 250, 100);
		dbg.drawString("Jugador 1 : ", 100, 150);
		dbg.drawString("Jugador 2 : ", 100, 200);
		dbg.drawString(HUD.getHUD().getPlayer1() + " Segundos", 250, 150);
		dbg.drawString(HUD.getHUD().getPlayer2() + " Segundos", 250, 200);
		
		dbg.setFont(new Font("Times New Roman", Font.BOLD, 20 ));
		dbg.drawString("clic para continuar.. ", 250, 350);

	}
	
}
