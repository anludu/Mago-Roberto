import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {

	public static ImageLoader imgLoader;
	
	private String[] tags = new String[] {
			"burro",
			"cocodrilo",
			"gato",
			"hipo",
			"leon",
			"oveja",
			"perro",
			"rino",
			"toro",
			"vaca",
			"bg1",
			"bg3",
			"visto",
			"equis"};
	
	
	private BufferedImage animales [] = new BufferedImage[13];
		
	public ImageLoader() {
		try {
			
			for(int i = 0; i < 13; i++) {
				
				animales [i] = ImageIO.read(new File("src\\Imagenes Mago\\" + tags[i] + ".png")); 
			}
			
		}catch (IOException e) {}
	}
	
	public static ImageLoader getImageLoader(){
		if(imgLoader == null){
			imgLoader = new ImageLoader();
		}
		return imgLoader;
	}
	
	public BufferedImage getImage(int a) {
		return animales[a];
	}


}