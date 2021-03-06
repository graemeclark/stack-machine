package machines.types;

import java.util.*;

public abstract class AbstractMachine
{
	
  protected int codePointer, stackPointer, heapPointer;
  
  protected Stack <Integer>         stack;
  protected List  <CodeVectorType>  codeVector;
  protected List  <HeapType>				heap;
	
  public AbstractMachine()
  {
    
    codePointer  = 0;
    stackPointer = 0;
    heapPointer  = 0;
	
    stack       = new Stack <Integer>();
	  codeVector  = new ArrayList <CodeVectorType>();
	  heap        = new ArrayList <HeapType>();
		
  }
  
  public String toString()
  {
    return "\n" +
           "Code Vector: " + codeVector   + "\n" +
           "Stack:       " + stack        + "\n" +
           "Heap:        " + heap         + "\n" +
           "SP:          " + stackPointer + "\n" +
           "CP:          " + codePointer  + "\n" +
           "HP:          " + heapPointer  + "\n" ;
  }
	
  public void execute()
  {

	  for (CodeVectorType c : codeVector) {	  
	    if(c.isInstruction()) {	    
	      c.ins.executeInstruction();
	      codePointer++;
	      System.out.println(this);	    
	    }
	  }
	
  }
  
  public void setCodeVector(List<CodeVectorType> cv)
  {
    
    codeVector = cv;
    
  }
  
  public void push(HeapType s)
  {
	
  	heap.add(s);
  	heapPointer = heap.indexOf(s);
	  stack.push(heapPointer);
	  stackPointer = stack.indexOf(heapPointer);

  }
  
  public HeapType pop()
  {
    
  	heapPointer = stack.pop();
	  return heap.get(heapPointer);
	  
  }
  
  public CodeVectorType getParameter()
  {
    
	  codePointer++;  
	  return codeVector.get(codePointer);
	  
  }
	
}
