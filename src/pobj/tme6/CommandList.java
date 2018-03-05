package pobj.tme6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CommandList implements ICommand{
	
	private List<ICommand> conteneur = new ArrayList<>();
	
	public void addCommand(ICommand command) {
		conteneur.add(command);
	}
	
	public void execute(IColorTurtle turtle) {
		for(ICommand c : conteneur)
			c.execute(turtle);	
	}
	
	public List<ICommand> getCommandList() {
		return conteneur;
	}
}
