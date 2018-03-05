package pobj.tme6;

public class Substitution {
	static public ICommand substitute(ICommand org, ICommand subst) {
		CommandList list = (CommandList) org;
		CommandList subs_list = (CommandList) subst;
		CommandList res = new CommandList();
		for(ICommand c : list.getCommandList()) {
			if(c instanceof CommandMove) {
				for (ICommand com : subs_list.getCommandList())
					res.addCommand(com);
			}else
				res.addCommand(c);
		}
		return (ICommand) res;
	}
}
