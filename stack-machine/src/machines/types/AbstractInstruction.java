package machines.types;

public abstract class AbstractInstruction
{
  
  protected AbstractMachine m;
  
  public AbstractInstruction(AbstractMachine machine)
  {
    m = machine;
  }
  
  public abstract void executeInstruction();
    
}