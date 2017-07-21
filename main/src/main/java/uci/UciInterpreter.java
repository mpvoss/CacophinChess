package uci;

import main.EngineState;
import uci.cmds.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by mpvoss on 7/18/17.
 */
public class UciInterpreter implements Runnable{
    private final Scanner scanner = new Scanner(System.in);
    public final static Map<String,AbstractUciCommand> map = new HashMap<>();

    public UciInterpreter(){
        initializeMap();
    }

    private void initializeMap(){
        map.put("uci",new UciCommand(this));
        map.put("debug",new DebugUciCommand(this));
        map.put("isready",new IsReadyCommand(this));
        map.put("setoption",new SetOptionCommand(this));
        map.put("register",new RegisterCommand(this));
//        map.put("ucinewgame",new UciNewGameCommand(this));
//        map.put("position",new PositionCommand(this));
//        map.put("go",new GoCommand(this));
//        map.put("stop",new StopCommand(this));
//        map.put("ponderhit", new PonderHitCommand(this));
//        map.put("quit", new QuitCommand(this));



    }

    @Override
    public void run() {
        while(true){
            if(scanner.hasNext()){
                String input = scanner.nextLine();
                processInput(input);
            }
        }
    }

    private void processInput(String input) {
        String [] parts = input.split(" ");

        if (map.containsKey(parts[0])){
            AbstractUciCommand cmd = map.get(parts[0]);
            cmd.performOperation(parts);

        } else if (EngineState.getDebug()) {
            System.out.println("No command registered for '" + parts[0] + "'");
        }

    }

    public void processOutput(String output){
        System.out.println(output);
    }


}
