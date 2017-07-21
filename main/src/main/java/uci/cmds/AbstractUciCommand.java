package uci.cmds;

import uci.UciInterpreter;

/**
 * Created by mpvoss on 7/18/17.
 */
public abstract class AbstractUciCommand {
    protected UciInterpreter uciInterpreter;

    public AbstractUciCommand(UciInterpreter uciInterpreterIn){
        uciInterpreter = uciInterpreterIn;
    }

    public abstract void performOperation(String [] args);


}
