package main;

/**
 * Created by mpvoss on 7/18/17.
 */
public class EngineState {
    private static boolean isDebug = true;


    public static boolean getDebug(){
        return isDebug;
    }

    public static void setDebug(boolean debug){
        isDebug = debug;
    }

}
