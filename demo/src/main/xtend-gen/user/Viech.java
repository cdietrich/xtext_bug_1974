package user;

import demo.AGreeter;
import demo.BGreeter;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class Viech {
  public Class<BGreeter> x() {
    Class<BGreeter> _xblockexpression = null;
    {
      InputOutput.<Class<AGreeter>>println(AGreeter.class);
      _xblockexpression = InputOutput.<Class<BGreeter>>println(BGreeter.class);
    }
    return _xblockexpression;
  }
}
