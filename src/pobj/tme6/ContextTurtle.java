package pobj.tme6;

import java.awt.Color;

public class ContextTurtle extends ColorTurtle implements IColorTurtle {
	private IContext context;
	
	public ContextTurtle(IContext context) {
		super();
		this.context=context;
	}

	@Override
	public void move(int length) {
		int x1 = super.getX();
		int y1 = super.getY();
		super.move(length);
		int x2 = super.getX();
		int y2 = super.getY();
		Color color = super.getColor();
		this.drawLine(x1, y1, x2, y2, color);
	}

	@Override
	public void turn(int angle) {
		super.turn(angle);
	}

	@Override
	public void up() {
		// TODO Auto-generated method stub
		super.up();
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		super.down();
	}
	
	@Override
	public void setColor(Color color) {
		// TODO Auto-generated method stub
		super.setColor(color);
	}
	
	public void drawLine(int x1, int y1, int x2, int y2, Color color) {
		context.drawLine(x1, y1, x2, y2, color);
	}

}
