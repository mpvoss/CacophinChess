package main;

import boardState.Bitboard;
import boardState.BoardState;

import java.util.regex.Pattern;

/**
 * Created by mpvoss on 7/20/17.
 */
public class Util {


    public void parseFenString(String fenString) {
        String test = "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1";

        String[] parts = fenString.split(" ");

        Bitboard bitboard= handleBoardState(parts[0]);

        boolean whiteToMove = handleSideToMove(parts[1]);
        handleCastleRights(parts[2]);
        handleEnPassent(parts[3]);
        handleHalfMoveClock(parts[4]);
        handleFullMoveClock(parts[5]);


    }

    public static Bitboard handleBoardState(String str) {
        String[] parts = str.split("/");
        Bitboard bitboard = new Bitboard();

        int rowIdx = 7;
        for (String row : parts) {
            int col = 0;
            for (int i = 0; i < row.length(); i++) {
                char c = row.charAt(i);

                if (Pattern.matches("\\d", "" + c)) {
                    // Empty spaces
                    col += Integer.parseInt("" + c);
                } else {
                    bitboard.setPiece(""+c,rowIdx,col);

                    col += 1;
                }
            }

            rowIdx--;
        }


        return bitboard;

    }

    private void handlePiece(String str) {


    }

    private void handleHalfMoveClock(String str) {

    }

    private void handleEnPassent(String part) {
    }

    private void handleFullMoveClock(String part) {
    }

    private boolean handleSideToMove(String str) {
        return str.equals("w");
    }

    private void handleCastleRights(String str) {
        if (str.equals("-")) {
            // no one can castle
        } else {
            if (str.contains("K")) {

            }
            if (str.contains("Q")) {

            }
            if (str.contains("k")) {

            }
            if (str.contains("q")) {

            }
        }
    }


}
