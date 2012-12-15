package machines.types;

import java.util.*;

public abstract class AbstractMachine
{
	
  protected int codePointer;
  
  protected Stack <StackType>       stack;
  protected List  <CodeVectorType>  codeVector;
	
  public AbstractMachine()
  {
		
    stack       = new Stack <StackType>();
	codeVector  = new ArrayList <CodeVectorType>();
	codePointer = 0;
		
  }
	
  public void execute()
  {

	for (CodeVectorType c : codeVector) {
	  if(c.ins != null) {
	    codePointer = codeVector.indexOf(c) + 1;  
	    c.ins.executeInstruction();
	  }
	}
	System.out.println(stack);
	
  }
  
  public void setCodeVector(List<CodeVectorType> cv)
  {
    
    codeVector = cv;
    
  }
  
  public void push(StackType s)
  {
	
	stack.push(s);
	  
  }
  
  public StackType pop()
  {
	  
	return stack.pop();
	  
  }
  
  public CodeVectorType getParameter()
  {
	  
	return codeVector.get(codePointer);
	  
  }
	
}
