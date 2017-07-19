package com.mpvoss.uci.cmds;

import com.mpvoss.uci.UciInterpreter;

/**
 * Created by mpvoss on 7/18/17.
 */
public class RegisterCommand extends AbstractUciCommand {


    public RegisterCommand(UciInterpreter uciInterpreterIn) {
        super(uciInterpreterIn);
    }

    @Override
    public void performOperation(String[] args) {
        if (args.length >= 2){
            String option = args[1];

            if ("later".equals(option)){

            } else if ("name".equals(option)){

            }
        }


    }
}
