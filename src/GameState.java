import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.*;
import java.util.*;



interface GameState {

	public void start();
	public void turno1();
	public void turno2();
	public void go();
	public void update();
	
	public void setContext(GameContext cont);

	public void clickMouse(MouseEvent e);
	
	public void draw(Graphics dbg);

}
