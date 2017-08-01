import boardState.Bitboard;
import main.Util;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.Calendar;

/**
 * Created by mpvoss on 7/20/17.
 */

public class UtilTest {
    @Test
    public void parseFen() throws ParseException {
        String test = "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1";

        Bitboard bitboard = Util.handleBoardState(test.split(" ")[0]);

        // white
        bitboard.print(bitboard.getBitmap(0));
        System.out.println();
        // black
        bitboard.print(bitboard.getBitmap(1));


    }


}
