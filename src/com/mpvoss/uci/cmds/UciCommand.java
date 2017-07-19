package com.mpvoss.uci.cmds;

import com.mpvoss.EngineState;
import com.mpvoss.uci.UciInterpreter;

/**
 * Created by mpvoss on 7/18/17.
 */
public class UciCommand extends AbstractUciCommand {

    public UciCommand(UciInterpreter uciInterpreterIn){
        super(uciInterpreterIn);

    }

    @Override
    public void performOperation(String [] args) {

        uciInterpreter.processOutput("id name Cacophin");
        uciInterpreter.processOutput("id author Matthew Voss");
        uciInterpreter.processOutput("uciok");

        if (EngineState.getDebug()){
            System.out.println("Setting UCI mode on....done");
        }
    }
}
