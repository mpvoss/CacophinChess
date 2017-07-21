package uci.cmds;

import uci.UciInterpreter;

/**
 * Created by mpvoss on 7/18/17.
 */
public class PositionCommand extends AbstractUciCommand {
    public PositionCommand(UciInterpreter uciInterpreter) {
        super(uciInterpreter);
    }

    @Override
    public void performOperation(String[] args) {

        int idx = 1;


        if ("startpos".equals(args[idx])){
            // handle it
            idx++;
        }else if ("fen".equals(args[idx])){
            idx++;
            String fenString = args[idx];
            //handle it
            idx++;
        }else {
            // error
        }

        if ("moves".equals(args[idx])){
            idx++;

            while(idx < args.length){
                String move = args[idx];
                idx++;
                //handle move
            }

        }


    }


}
