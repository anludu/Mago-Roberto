import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class HUD {
	
	private static HUD hud;
	private int time = 0;
	private boolean flag= true;
	private int player1, player2;
	private int[][] tiempos = new int [2][3]; 
	private int turnos = 0;

	public static HUD getHUD(){
		if(hud == null){
			hud = new HUD();
		}
		return hud;
	}
	
	 public void hud(Graphics g, int ronda){
	       g.drawString("Tiempo: "+ time, 250, 40);
	       g.drawString("Ronda: "+ ronda, 450, 40);
	       g.drawString("Tiempos ", 75, 425);
	       g.drawString("Ronda 1 ", 200, 400);
	       g.drawString("" + tiempos[turnos][0], 200, 425);
	       g.drawString("Ronda 2 ", 325, 400);
	       g.drawString("" + tiempos[turnos][1], 325, 425);
	       g.drawString("Ronda 3 ", 450, 400);
	       g.drawString("" + tiempos[turnos][2], 450, 425);

	}
	 
	public void setTime() {
			time++;			
	}
	

	public void setTimeValue(int time) {
		this.time = time;
	}
	
	public int getTime() {
		return time;
	}

	public int getPlayer1() {
		player1 = tiempos [0][0] + tiempos [0][1] + tiempos [0][2];
		return player1;
	}
	
	public int getPlayer2() {
		player2 = tiempos [1][0] + tiempos [1][1] + tiempos [1][2];
		return player2;
	}
	
	public void setTiempos(int jugador, int turno, int tiempoR) {
		tiempos[jugador][turno]= tiempoR;
	}
	
	public int getTiempos(int jugador, int turnos) {
		return tiempos[jugador][turnos];
	}
	public void setTurnos(int turno) {
		this.turnos = turno;
	}

}
