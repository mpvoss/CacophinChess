package com.mpvoss.uci.cmds;

import com.mpvoss.uci.UciInterpreter;

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
