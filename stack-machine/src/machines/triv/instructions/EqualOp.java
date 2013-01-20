package machines.triv.instructions;

import java.util.EmptyStackException;

import machines.types.*;

public class EqualOp extends AbstractInstruction
{

  public EqualOp(AbstractMachine machine)
  {
    
    super(machine);
    
  }

  @Override
  public void executeInstruction()
  {
  	
  	Object e1 = null;
  	Object e2 = null;
  	
    try {    	
      e1 = m.pop().getVal();
      e2 = m.pop().getVal();      
    }
    
    catch (EmptyStackException e) {    	
      System.out.println("Can't pop from the stack... nothing there.");      
    }
    
    m.push(new HeapType(e1 == e2));
    
  }

}
