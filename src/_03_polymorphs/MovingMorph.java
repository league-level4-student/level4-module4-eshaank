package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph {

	MovingMorph(int x, int y) {
		super(x, y);
		super.setHeight(50);
		super.setWidth(50);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.magenta);
		g.fillRect(getX(), getY(), getWidth(), getHeight());

	}

	public void update() {
		int x = getX() + 2;
		int y = getY() + 1;
		setX(x);
		setY(y);
	}

}
