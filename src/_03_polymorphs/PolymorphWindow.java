package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseListener {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;

	static Polymorph bluePoly;
	static Polymorph redPoly;
	static Polymorph MovingMorph;
	static Polymorph circleMorph;
	static Polymorph mouseMorph;
	static ArrayList<Polymorph> polymorphs;

	public static void main(String[] args) {
		polymorphs = new ArrayList<Polymorph>();
		new PolymorphWindow().buildWindow();
		polymorphs.add(bluePoly);
		polymorphs.add(redPoly);
		polymorphs.add(MovingMorph);
		polymorphs.add(circleMorph);
		polymorphs.add(mouseMorph);
	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);
		window.addMouseListener(this);
		bluePoly = new BluePolymorph(50, 50);
		redPoly = new RedMorph(50, 50);
		MovingMorph = new MovingMorph(50, 50);
		circleMorph = new circleMorph(60, 60);
		mouseMorph = new mouseMorph(100, 100);
	
		timer = new Timer(1000 / 30, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);

		// draw polymorph
		for(Polymorph p : polymorphs) {
			p.draw(g);
			repaint();
	}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
for(Polymorph p : polymorphs) {
		p.update();
		repaint();
}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseMorph.setMouseX(e.getX());
		mouseMorph.setMouseY(e.getY());
		System.out.println("mouseEntered");
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
