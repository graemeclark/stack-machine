package machines.types;

public class StackType {
	
  Integer i;
  Boolean b;
	
  public StackType(int n)
  {
    i = n;
  }
	
  public StackType(boolean bool)
  {
    b = bool;
  }
	
  public String toString()
  {
    if (i != null)
      return i + "";
	  
    else 
	  return b + "";
  }
	
  public int getInt()
  {
	return i;
  }
	
  public boolean getBool()
  {
	return b;
  }

}
