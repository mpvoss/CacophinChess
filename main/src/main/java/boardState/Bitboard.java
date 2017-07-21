package boardState;

/**
 * Created by mpvoss on 7/20/17.
 */
public class Bitboard {
    private long[] rooks = new long[2];
    private long[] kings = new long[2];
    private long[] knights = new long[2];
    private long[] queens = new long[2];
    private long[] bishops = new long[2];
    private long[] pawns = new long[2];
    private int whiteSide = 0;
    private int blackSide = 1;


    public static void main(String[] args) {
        Bitboard b = new Bitboard();
        b.testDriver();
    }

    public void testDriver(){
        print(getBitmap(1));
    }

    public Bitboard() {
        initRooks();
        initKnights();
        initBishops();
        initKings();
        initQueens();
        initPawns();
    }

    public long getBitmap(int side) {
        return rooks[side] | knights[side] | bishops[side]| queens[side] | kings[side] | pawns[side];
    }

    private void initQueens() {
        queens[whiteSide] = 0x1000000000000000L;
        queens[blackSide] = 0x0000000000000010L;
    }

    private void initPawns() {
        pawns[blackSide] = 0x000000000000FF00L;
        pawns[whiteSide] = 0x00FF000000000000L;


    }

    private void initBishops() {
        bishops[whiteSide] = 0x2400000000000000L;
        bishops[blackSide] = 0x0000000000000024L;

    }

    private void initKings() {
        kings[whiteSide] = 0x0800000000000000L;
        kings[blackSide] = 0x0000000000000008L;

    }

    private void initRooks() {
        rooks[whiteSide] = 0x8100000000000000L;
        rooks[blackSide] = 0x0000000000000081L;
    }

    private void initKnights() {
        knights[whiteSide] = 0x4200000000000000L;
        knights[blackSide] = 0x0000000000000042L;
    }

    public void print(long bitboard) {
        String str = String.format("%64s", Long.toBinaryString(bitboard)).replace(' ', '0');
        for (int i = 7; i >= 0; i--) {
            System.out.println(str.substring(i * 8, (i * 8) + 8));
        }
    }

    public void printPiece(long[] array) {
        print(array[whiteSide] | array[blackSide]);

    }


}
