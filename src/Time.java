import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Time implements Runnable, ActionListener {
	
	private Timer time;
	private Thread clock;
	int i = 0;

	public Time () {//cuenta el tiempo cada segundo
		time = new Timer(100, this);
	}
	
	public void actionPerformed(ActionEvent arg) {
		HUD.getHUD().setTime();
		
	}
	


	public void addNotify() {
		super.notify();
		startTime();
	}
	
	public void run() {}

	public void startTime() {//empezar el cronometro
		time.start();
	}
	
	public void startClock() {
		if (clock == null) {
			clock = new Thread(this);
			clock.start();
		}
	}
	


	
}
