package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class circleMorph extends Polymorph {
	int angle = 0;
	int radius = 50;
	int center = 150;
	circleMorph(int x, int y) {
		super(x, y);
		super.setHeight(50);
		super.setWidth(50);
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void update() {
		angle++;
		int x = (int) (radius * Math.cos(angle) + center);
		int y = (int) (radius * Math.sin(angle) + (center += 1));
		setX(x);
		setY(y);
	}
}
