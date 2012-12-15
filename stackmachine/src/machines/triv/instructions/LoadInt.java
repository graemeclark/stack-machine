package machines.triv.instructions;

import java.util.EmptyStackException;

import machines.types.*;


public class LoadInt extends AbstractInstruction {

	public LoadInt(AbstractMachine machine) {
		super(machine);
	}

	public void executeInstruction()
	{
	    try {			
	        m.push(new StackType(m.getParameter().getInt()));
	      }
	  		
	  	catch (EmptyStackException e) {			
	  	  System.out.println("Can't pop from the stack, nothing there...");			
	  	}
	}

}