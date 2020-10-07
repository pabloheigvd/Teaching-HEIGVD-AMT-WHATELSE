package ch.heigvd.amt.whatelse;

import ch.heigvd.amt.whatelse.api.ICoffee;
import ch.heigvd.amt.whatelse.impl.Chillin;
import ch.heigvd.amt.whatelse.impl.Yverdoto;

import java.lang.reflect.InvocationTargetException;

public class George {

  /*
   !!!! WARNING !!!!
   The following keywords are STRICTLY FORBIDDEN in this class:
   - if
   - switch
   - case
   - what
   - else

   !!!! WARNING !!!!
   You must write all the code in THIS class to make the tests get green.
   */

  public ICoffee pleasePrepareMeANice(String coffeeName) {
    // return coffeeName == Chillin.TASTE ? new Chillin() : new Yverdoto(); // bad hack
    // sensibilisation
    String prefix = "ch.heigvd.amt.whatelse.impl.";
    String className = prefix + coffeeName;
    ICoffee c = null;
    try {
      c = (ICoffee) Class.forName(className).getConstructor().newInstance();
    } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | ClassNotFoundException e) {
      e.printStackTrace();
    }
    return c;
  }

}
