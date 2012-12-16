package machines.types;

import java.util.*;

public abstract class AbstractMachine
{
	
  protected int codePointer, stackPointer;
  
  protected Stack <StackType>       stack;
  protected List  <CodeVectorType>  codeVector;
	
  public AbstractMachine()
  {
    
    codePointer = 0;
    stackPointer = 0;
	
    stack       = new Stack <StackType>();
	codeVector  = new ArrayList <CodeVectorType>();
		
  }
  
  public String toString()
  {
    return "\n" +
           "Code Vector: " + codeVector   + "\n" +
           "Stack:       " + stack        + "\n" +
           "SP:          " + stackPointer + "\n" +
           "CP:          " + codePointer  + "\n" ;
  }
	
  public void execute()
  {

	for (CodeVectorType c : codeVector) {
	  if(c.ins != null) {
	    codePointer = codeVector.indexOf(c) + 1;  
	    c.ins.executeInstruction();
	  }
	}
	
  }
  
  public void setCodeVector(List<CodeVectorType> cv)
  {
    
    codeVector = cv;
    
  }
  
  public void push(StackType s)
  {
	
	stack.push(s);
	stackPointer = stack.indexOf(s);
	System.out.println(stack);  

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
