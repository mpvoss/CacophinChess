package com.mpvoss.uci.cmds;

/**
 * Created by mpvoss on 7/18/17.
 */
public class InvalidUciCommandSyntaxException extends RuntimeException {
    public InvalidUciCommandSyntaxException(AbstractUciCommand abstractUciCommand, String cause){
        super(abstractUciCommand.getClass() + " cannot be used this way: " + cause);
    }
}
