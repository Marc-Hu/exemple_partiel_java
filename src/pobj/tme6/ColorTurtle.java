package pobj.tme6;

import java.awt.Color;

public class ColorTurtle extends Turtle implements IColorTurtle{
	Color couleur;
	
	public ColorTurtle() {
		super();
		couleur=Color.BLACK;
	}

	@Override
	public void move(int length) {
		super.move(length);
	}

	@Override
	public void turn(int angle) {
		super.turn(angle);
	}

	@Override
	public void up() {
		super.up();
	}

	@Override
	public void down() {
		super.down();
	}

	@Override
	public void setColor(Color color) {
		couleur=color;
	}
	
	public void draw(int x1, int y1, int x2, int y2) {
		System.out.println(x1+" "+y1+" "+x2+" "+y2+" "+couleur.toString());
	}
	
	public Color getColor() {
		return couleur;
	}

}
