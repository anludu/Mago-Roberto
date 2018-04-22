import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;

public class GameStateTurno1 implements GameState{
	
	public void start() {}
	public void turno1() {}
	public void turno2() {context.setState(context.Turno2());}
	public void go() {}
	public void winner() {}
	
	
	private ChooseImage chooseImage = new ChooseImage();
	private Random randomGenerator = new Random();
	private int letraR;
	private boolean bandera = true, correct = false;
	private Answers answers = new Answers();
	private Time time = new Time();
	int rondas = 1;
	int [] tiempoRonda = new int [3];
	int tiempoTotal = 0;
	int j = 0;

	
	
	
	private GameContext context;
	public void setContext(GameContext context) {
		this.context = context;
		
	}

	public void draw(Graphics dbg) {
		
		HUD.getHUD().setTurnos(0);
		dbg.setFont(new Font("Times New Roman", Font.BOLD, 23));
		dbg.drawImage((ImageLoader.getImageLoader().getImage(11)),0,0,null);
		
		HUD.getHUD().hud(dbg, rondas);
		
		if (bandera) {//escoge la letra de uno de los 3 animales de arriba
			letraR =  randomGenerator.nextInt(3);
			HUD.getHUD().setTimeValue(0);
			bandera = false;	
		}
		
		dbg.setFont(new Font("Times New Roman", Font.BOLD, 25));
		dbg.drawString("Selecciona al animal que empieza con la letra: ", 10, 70);
		dbg.drawString("Jugador 1", 10, 40);
		dbg.setFont(new Font("Times New Roman", Font.BOLD, 50  ));
		dbg.drawString(chooseImage.getAllLetras(letraR), 250, 160);
		
		
		for (int i = 0 ; i < 3 ; i++) {//dibuja los animales en pantalla
			dbg.drawImage(chooseImage.getImg(i), (60*3*i+25) , 200, null);
		}
		
		if (block[0]) {//dibuja equises si esta incorrecta la respuesta
			dbg.drawImage(ImageLoader.getImageLoader().getImage(13), (60*3*0+50) , 225, null);
		}
		if (block[1]) {
			dbg.drawImage(ImageLoader.getImageLoader().getImage(13), (60*3*1+50) , 225, null);
		}
		if (block[2]) {
			dbg.drawImage(ImageLoader.getImageLoader().getImage(13), (60*3*2+50) , 225, null);
		}
		
	}
	
	private boolean[] block = {false, false, false};
	
	public void clickMouse(MouseEvent e) {
		int x = 0 , y= 0;
    	x = e.getX();
    	y = e.getY();
    	
    	
		if ((x >= 30 && x <= 155 && y >= 200 && y <= 320) && (block[0] == false) ) {

			correct = answers.answer(chooseImage.getAllLetras(0), chooseImage.getAllLetras(letraR));//checa si la respuesta es coorrecta en el metodo answers
			if (correct == false) block[0] = true;
			System.out.println("lalala");	
			
		}
		
		if ((x >= 205 && x <= 330 && y >= 200 && y <= 320) && (block[1] == false) ) {
			
			
			correct = answers.answer(chooseImage.getAllLetras(1), chooseImage.getAllLetras(letraR));
			if (correct == false) block[1] = true;
			System.out.println("lololo");
	
		}
		if ((x >= 385 && x <= 510 && y >= 200 && y <= 320) && (block[2] == false)) {
			correct = answers.answer(chooseImage.getAllLetras(2), chooseImage.getAllLetras(letraR));
			if (correct == false) block[2] = true;
			System.out.println("lelele");
			 
		}
		
		
	}
	
	public void update() {

			if(correct ) {
				
				rondas ++;
				bandera = true;
				correct = false;
				HUD.getHUD().setTiempos(0, j, HUD.getHUD().getTime()); 
				j++;
				for (int i = 0; i < 3; i++) {
					block [i] = false;
				}
				turno2();
			}

	}
	
	public int getTiempoRonda(int i) {
		return tiempoRonda[i];
	}
		
}
	

