package machines.imp.triv;

import java.util.EmptyStackException;

import machines.types.*;

public class LoadBool extends AbstractInstruction
{

	public LoadBool(AbstractMachine machine)
	{
		super(machine);
	}

	public void executeInstruction()
	{
    try {     
      m.push(new StackType(m.getParameter().getBool()));
    }
    
    catch (EmptyStackException e) {     
      System.out.println("Can't pop from the stack, nothing there...");     
    }
	}
	
	

}
