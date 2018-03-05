package pobj.tme6;

import java.awt.Color;

public class ColorTurtleAdapter implements IColorTurtle{
	private ITurtle turtle;
	private Color couleur;
	
	public ColorTurtleAdapter(ITurtle turtle) {
		this.turtle=turtle;
	}

	@Override
	public void move(int length) {
		turtle.move(length);
	}

	@Override
	public void turn(int angle) {
		turtle.turn(angle);
	}

	@Override
	public void up() {
		// TODO Auto-generated method stub
		turtle.up();
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		turtle.down();
	}

	@Override
	public void setColor(Color color) {
		// TODO Auto-generated method stub
		couleur=color;
	}
	
	public void draw(int x1, int y1, int x2, int y2) {
		System.out.println(x1+" "+y1+" "+x2+" "+y2);
	}

}
