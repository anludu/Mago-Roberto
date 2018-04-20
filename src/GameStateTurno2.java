import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.Random;

public class GameStateTurno2 implements GameState{
	
	public void start() {}
	public void turno1() { context.setState(context.Turno1());}
	public void turno2() {}
	public void go() {context.setState(context.GameOver());}

	private int intentos = 3;
	private int rondas = 1;
	private boolean correct = false;
	private boolean bandera;
	private int letraR;
	private Random randomGenerator = new Random();
	private ChooseImage chooseImage = new ChooseImage();
	
	private GameContext context;
	
	public void setContext(GameContext context) {
		this.context = context;
		
	}

	public void draw(Graphics dbg) {
		dbg.drawImage((ImageLoader.getImageLoader().getImage(11)),0,0,null);
		
		if (bandera) {//escoge la letra de uno de los 3 animales de arriba
			
			intentos = 3;
			letraR =  randomGenerator.nextInt(3);
			bandera = false;
		}
		
		dbg.setFont(new Font("Times New Roman", Font.BOLD, 25));
		dbg.drawString("Selecciona al animal que empieza con la letra: ", 10, 40);
		dbg.drawString("Jugador 2", 10, 80);
		dbg.setFont(new Font("Times New Roman", Font.BOLD, 50));
		dbg.drawString(chooseImage.getAllLetras(letraR), 225, 150);
		
		for (int i = 0 ; i < 3 ; i++) {//dibuja los animales en pantalla
			dbg.drawImage(chooseImage.getImg(i), (50*3*i+20) , 200, null);
		}
		
		if ( intentos > 0) {
			if (correct) {//revisa si la respuesta es corecta
				System.out.println("Correcto!!!!!!!!!!!!!!!!!");
				correct = false;
				//select = true;
			}
		} 
	

	}
	

	public void clickMouse(MouseEvent e) {	
		int x = 0 , y= 0;
    	x = e.getX();
    	y = e.getY();
    	
		if (x >= 25 && x <= 150 && y >= 200 && y <= 320 ) {
			if (chooseImage.getAllLetras(letraR) == chooseImage.getAllLetras(0)) {
				correct = true;
				System.out.println(intentos);
			}
			System.out.println("lalala");
			//select = true;
			
		}
		if (x >= 200 && x <= 300 && y >= 200 && y <= 320 ) {
			if (chooseImage.getAllLetras(letraR) == chooseImage.getAllLetras(1)) {
				correct = true;
				//select = true;
				System.out.println(intentos);
			}
			//select = true;
			System.out.println("lololo");
			
		}
		if (x >= 325 && x <= 475 && y >= 200 && y <= 320 ) {
			if (chooseImage.getAllLetras(letraR) == chooseImage.getAllLetras(2)) {
				correct = true;
				//select = true;
				System.out.println(intentos);
			}
			//select = true;
			System.out.println("lelele");
			 
		}
	}
 


	public void update() {
		if(correct) {
			//select = false;
			
			if(correct || intentos == 0) {
				if (rondas == 3) {
					go();
				}else {
					rondas ++;
					bandera = true;
					intentos=3;
					turno1();
				}
			}
		}
	}
}
