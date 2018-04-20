import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.Random;

public class GameStateTurno1 implements GameState{
	
	public void start() {}
	public void turno1() {}
	public void turno2() {context.setState(context.Turno2());}
	public void go() {}
	
	
	private ChooseImage chooseImage = new ChooseImage();
	private Random randomGenerator = new Random();
	private int letraR;
	private boolean bandera = true, correct = false;
	private Answers answers = new Answers();
	int intentos = 3;
	int rondas = 1;
	
	
	
	private GameContext context;
	public void setContext(GameContext context) {
		this.context = context;
		
	}

	public void draw(Graphics dbg) {
		dbg.drawImage((ImageLoader.getImageLoader().getImage(11)),0,0,null);
		
		
		if (bandera) {//escoge la letra de uno de los 3 animales de arriba
			intentos = 3;
			//for (int i = 0; i < 3; i++) {
				//if (chooseImage.getAllLetras(i) != null)
				letraR =  randomGenerator.nextInt(3);
				
				bandera = false;
			//}
			
		}
		
		
		dbg.setFont(new Font("Times New Roman", Font.BOLD, 25));
		dbg.drawString("Selecciona al animal que empieza con la letra: ", 10, 40);
		dbg.drawString("Jugador 1", 10, 80);
		dbg.setFont(new Font("Times New Roman", Font.BOLD, 50));
		dbg.drawString(chooseImage.getAllLetras(letraR), 225, 150);
		//chooseImage.getAllLetras(letraR)
		
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
	
	private boolean[] block = {false, false, false};
	
	public void clickMouse(MouseEvent e) {
		int x = 0 , y= 0;
    	x = e.getX();
    	y = e.getY();
    	
    	
		if ((x >= 25 && x <= 150 && y >= 200 && y <= 320) && (block[0] == false) ) {

			correct = answers.answer(chooseImage.getAllLetras(0), chooseImage.getAllLetras(letraR));//checa si la respuesta es coorrecta en el metodo answers
			if (correct == false) block[0] = true;
			System.out.println("lalala");	
			
		}
		
		if ((x >= 200 && x <= 300 && y >= 200 && y <= 320) && (block[1] == false) ) {
			
			
			correct = answers.answer(chooseImage.getAllLetras(1), chooseImage.getAllLetras(letraR));
			if (correct == false) block[1] = true;
			System.out.println("lololo");
	
		}
		if ((x >= 325 && x <= 475 && y >= 200 && y <= 320) && (block[2] == false)) {
			
			
			correct = answers.answer(chooseImage.getAllLetras(2), chooseImage.getAllLetras(letraR));
			if (correct == false) block[2] = true;
			System.out.println("lelele");
			 
		}
		
	}
	
	public void update() {

			if(correct || intentos <= 0) {
				rondas ++;
				bandera = true;
				intentos = 3;
				turno2();
			}

	}
	
}
	

