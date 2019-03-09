package _03_polymorphs;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class pictureMorph extends Polymorph{
	BufferedImage image;
	pictureMorph(int x, int y) {
		super(x, y);
		super.setHeight(50);
		super.setWidth(50);
		 try {
			image = ImageIO.read(new File("/Users/league/Desktop/level4-module4-eshaank/src/_03_polymorphs/marker.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void draw(Graphics g) {
	g.drawImage(image, 75, 75, null);
	
	}
	
}
