import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class GameStateStart implements GameState {

	
	public void start() {}
	public void turno1() { context.setState(context.Turno1());}
	public void turno2() {}
	public void go() {}
	public void winner() {}
	
	private int i = 0;
	private boolean select = true;
	private GameContext context;
	
	public void setContext(GameContext context) {
		this.context = context;
		
	}


	public void draw(Graphics g) {
		g.drawImage((ImageLoader.getImageLoader().getImage(10)),0,0,null);
		if (select) {
			g.setFont(new Font("Times New Roman", Font.BOLD, 25));
			g.drawString("Clic to start..",380, 400);
		}
		else {
			i++;
			g.setFont(new Font("Times New Roman", Font.BOLD, 50));

			
			if(i<80){
					g.drawString("3",300, 300);
			}
			else if(i<160){
					g.drawString("2",300, 300);
			}
			else if(i<340){
				  g.drawString("1",300, 300);
			}

		}
		
	}

	public void clickMouse(MouseEvent e) {
		
		select = false;
		
	}
	
	public void update() {
		if (i >= 250) {
			turno1();
		}
	}

}
