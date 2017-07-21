package uci.cmds;

import uci.UciInterpreter;
import uci.cmds.AbstractUciCommand;

/**
 * Created by mpvoss on 7/18/17.
 */
public class IsReadyCommand extends AbstractUciCommand {

    public IsReadyCommand(UciInterpreter uciInterpreterIn) {
        super(uciInterpreterIn);
    }

    @Override
    public void performOperation(String[] args) {
        uciInterpreter.processOutput("isready");
    }
}
