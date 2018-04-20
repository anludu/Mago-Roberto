import java.util.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ChooseImage {
	  private int randNum;
 
	  String[] letras = new String[] {"B", "C", "G", "H" , "L", "O", "P", "R", "T", "V"};
	  private String[] allLetras = new String[3];
	  private BufferedImage img [] = new BufferedImage[3];
	  

	  public ChooseImage() {
		  
		int randNum;
		Random randomGenerator = new Random();
	    
		
		ImageLoader galeria = ImageLoader.getImageLoader();
		final String[] paths= new String[] {
				  "burro",
				  "cocodrilo",
				  "gato",
				  "hipo",
				  "leon",
				  "oveja",
				  "perro",
				  "rino",
				  "toro",
				  "vaca"
				  };
		
		for ( int i = 0; i < 3;  ) {
			
			randNum = randomGenerator.nextInt(10); //numeros 0-11
			
			if(paths[randNum] != null) {
				
				if (paths[randNum]== "burro") {
					 img[i] = ImageLoader.getImageLoader().getImage(0);
					 allLetras[i]= letras[randNum];
					 paths[randNum] = null;
					 i++;
				}
				
				if (paths[randNum]== "cocodrilo") {
					 img[i] = ImageLoader.getImageLoader().getImage(1);
					 allLetras[i]= letras[randNum];
					 paths[randNum] = null;
					 i++;
				}
				
				if (paths[randNum]== "gato") {
					 img[i] = ImageLoader.getImageLoader().getImage(2);
					 allLetras[i]= letras[randNum];
					 paths[randNum] = null;
					 i++;
				}
				
				if (paths[randNum]== "hipo") {
					 img[i] = ImageLoader.getImageLoader().getImage(3);
					 allLetras[i]= letras[randNum];
					 paths[randNum] = null;
					 i++;
				}
				
				if (paths[randNum]== "leon") {
					 img[i] = ImageLoader.getImageLoader().getImage(4);
					 allLetras[i]= letras[randNum];
					 paths[randNum] = null;
					 i++;
				}
				
				if (paths[randNum]== "oveja") {
					 img[i] = ImageLoader.getImageLoader().getImage(5);
					 allLetras[i]= letras[randNum];
					 paths[randNum] = null;
					 i++;
				}
				
				if (paths[randNum]== "perro") {
					 img[i] = ImageLoader.getImageLoader().getImage(6);
					 allLetras[i]= letras[randNum];
					 paths[randNum] = null;
					 i++;
				}
				
				if (paths[randNum]== "rino") {
					 img[i] = ImageLoader.getImageLoader().getImage(7);
					 allLetras[i]= letras[randNum];
					 paths[randNum] = null;
					 i++;
				}
				
				if (paths[randNum]== "toro") {
					 img[i] = ImageLoader.getImageLoader().getImage(8);
					 allLetras[i]= letras[randNum];
					 paths[randNum] = null;
					 i++;
				}
				
				if (paths[randNum]== "vaca") {
					 img[i] = ImageLoader.getImageLoader().getImage(9);
					 allLetras[i]= letras[randNum];
					 paths[randNum] = null;
					 i++;
				}


			}
		}
	  
	  }
	  
	  public BufferedImage getImg(int i) {
		  return img[i];
	  }
	  
	  public String getAllLetras(int i) {
		  return allLetras[i];
	  }


	  

}
