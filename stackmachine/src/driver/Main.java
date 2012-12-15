package driver;

import java.util.*;

import machines.triv.TrivMachine;
import machines.triv.instructions.*;
import machines.types.*;

public class Main
{

  public static void main(String[] args)
  {
    AbstractMachine triv = new TrivMachine();
    List<CodeVectorType> cv = new ArrayList<CodeVectorType>();
    
    cv.add(new CodeVectorType(new LoadInt(triv)));
    cv.add(new CodeVectorType(1));
    cv.add(new CodeVectorType(new LoadBool(triv)));
    cv.add(new CodeVectorType(true));
    
    triv.setCodeVector(cv);
    triv.execute();
  }
}