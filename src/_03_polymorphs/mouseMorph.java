package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class mouseMorph extends Polymorph implements MouseListener {
	int mouseX;
	int mouseY;

	mouseMorph(int x, int y) {
		super(x, y);
		super.setHeight(50);
		super.setWidth(50);

	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void update() {
		
		int x = mouseX;
		int y = mouseY;
		setX(x);
		setY(y);
	}
	public void setMouseX(int mouseX) {
		this.mouseX = mouseX;
	}
	public void setMouseY(int mouseY) {
		this.mouseY = mouseY;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseX = e.getX();
		mouseY = e.getY();

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
