package machines.triv.instructions;

import machines.types.*;

public class LoadBool extends AbstractInstruction
{

	public LoadBool(AbstractMachine machine)
	{
	  
		super(machine);
		
	}

	public void executeInstruction()
	{
	  
      m.push(new HeapType(m.getParameter().getBool()));
      
	}
	
}
