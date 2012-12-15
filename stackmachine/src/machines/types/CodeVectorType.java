package machines.types;

public class CodeVectorType {
	
	AbstractInstruction ins;
	Integer i;
	Boolean b;
	
	public CodeVectorType(AbstractInstruction i)
	{
		ins = i;
	}
	
	public CodeVectorType(int n)
	{
		i = n;
	}
	
	public CodeVectorType(boolean bool)
	{
		b = bool;
	}
	
	public AbstractInstruction getIns()
	{
		return ins;
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
