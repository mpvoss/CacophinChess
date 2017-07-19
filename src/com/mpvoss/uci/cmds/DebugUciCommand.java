package com.mpvoss.uci.cmds;

import com.mpvoss.EngineState;
import com.mpvoss.uci.UciInterpreter;

/**
 * Created by mpvoss on 7/18/17.
 */
public class DebugUciCommand extends AbstractUciCommand{
    public DebugUciCommand(UciInterpreter uciInterpreterIn) {
        super(uciInterpreterIn);
    }

    @Override
    public void performOperation(String[] args) {
        if (args.length != 2){
            throw new InvalidUciCommandSyntaxException(this, "one argument is required: 'on' or 'off'");
        }

        if ("on".equals(args[1])){
            EngineState.setDebug(true);
            if (EngineState.getDebug()){
                System.out.println("Debug set to 'on'");
            }

        } else if ("off".equals(args[1])){
            EngineState.setDebug(false);
        } else {
            throw new InvalidUciCommandSyntaxException(this, "one argument is required: 'on' or 'off'");
        }


    }
}
