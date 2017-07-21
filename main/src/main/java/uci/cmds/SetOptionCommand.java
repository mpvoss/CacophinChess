package uci.cmds;

import uci.UciInterpreter;
import uci.cmds.AbstractUciCommand;

/**
 * Created by mpvoss on 7/18/17.
 */
public class SetOptionCommand extends AbstractUciCommand {


    public SetOptionCommand(UciInterpreter uciInterpreterIn) {
        super(uciInterpreterIn);
    }

    @Override
    public void performOperation(String[] args) {
        if (args.length != 5){
            // handle error
        }

        if (!"name".equals(args[1])){
            // error
        }

        String optionName = args[2];
        String value = args[4];

        System.out.println("Setting option '" + optionName + "' to value '" + value + "'");

    }


}
