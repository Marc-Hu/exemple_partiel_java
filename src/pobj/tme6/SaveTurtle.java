package pobj.tme6;

import java.awt.Color;

public class SaveTurtle implements IColorTurtle {
	
	private CommandList list;
	
	public SaveTurtle() {
		// TODO Auto-generated constructor stub
		list=new CommandList();
	}

	@Override
	public void move(int length) {
		// TODO Auto-generated method stub
		list.addCommand(new CommandMove(length));
	}

	@Override
	public void turn(int angle) {
		// TODO Auto-generated method stub
		list.addCommand(new CommandTurn(angle));
	}

	@Override
	public void up() {
		// TODO Auto-generated method stub
		list.addCommand(new CommandUp());
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		list.addCommand(new CommandDown());
	}

	@Override
	public void setColor(Color color) {
		// TODO Auto-generated method stub
		list.addCommand(new CommandSetColor(color));
	}
	
	public CommandList getCommand() {
		return list;
	}

}
