import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

public class GameStateOver implements GameState {
	
	public void start() {}
	public void turno1() {}
	public void turno2() {}
	public void go() {}
	
	
	private GameContext context;
	private boolean select= true;
	public void setContext(GameContext context) {
		this.context = context;
		
	}
	
	public void clickMouse(MouseEvent e) {
		select = false;
	}
	
	public void draw(Graphics dbg) {
		dbg.drawImage((ImageLoader.getImageLoader().getImage(10)),0,0,null);
		if (HUD.getHUD().getPlayer1() > HUD.getHUD().getPlayer2()) {
			System.out.println("El Ganador es el jugador 2!!!");
			dbg.setFont(new Font("Times New Roman", Font.BOLD, 25  ));
			dbg.drawString("El ganadador es el jugador 2!!!", 180,280 );
			
		}else if (HUD.getHUD().getPlayer1() < HUD.getHUD().getPlayer2()){
			System.out.println("El Ganador es el jugador 1!!!");
			dbg.setFont(new Font("Times New Roman", Font.BOLD, 25));
			dbg.drawString("El ganadador es el jugador 1!!!", 180,280 );
		}
		else {
			dbg.setFont(new Font("Times New Roman", Font.BOLD, 25 ));
			dbg.drawString("Es un empate!!!", 180,280 );
		}
		dbg.setFont(new Font("Times New Roman", Font.BOLD, 20  ));
		dbg.drawString("Clic para salir..", 320,350 );
	}
	public void update() {
		if (!select) System.exit(0);
		
	}

}
