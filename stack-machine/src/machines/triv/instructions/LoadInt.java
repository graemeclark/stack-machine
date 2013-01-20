package machines.triv.instructions;

import machines.types.*;

public class LoadInt extends AbstractInstruction {

	public LoadInt(AbstractMachine machine) {
		
		super(machine);
		
	}

	public void executeInstruction()
	{
	  
	  m.push(new HeapType(m.getParameter().getInt()));

	}

}