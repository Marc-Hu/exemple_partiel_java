package pobj.tme6;

import java.awt.Color;

public class CommandSetColor implements ICommand {
	
	private Color color;
	
	public CommandSetColor(Color color) {
		// TODO Auto-generated constructor stub
		this.color=color;
	}
	
	@Override
	public void execute(IColorTurtle turtle) {
		// TODO Auto-generated method stub
		turtle.setColor(color);
	}

}
