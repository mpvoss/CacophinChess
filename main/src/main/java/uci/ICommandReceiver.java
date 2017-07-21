package uci;

import uci.cmds.UciCommand;

/**
 * Created by mpvoss on 7/20/17.
 */
public interface ICommandReceiver {
    void giveCommand(UciCommand uciCommand);

}
