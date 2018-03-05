package pobj.tme6;

public class CommandTurn implements ICommand {
	
	private int degres;
	
	public CommandTurn(int degre) {
		// TODO Auto-generated constructor stub
		degres=degre;
	}
	@Override
	public void execute(IColorTurtle turtle) {
		// TODO Auto-generated method stub
		turtle.turn(degres);
	}

}
