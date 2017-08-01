package boardState;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by mpvoss on 7/20/17.
 */
public class BitboardTest {

    @Test
    public void testAssertBit(){
        Bitboard bitboard = Bitboard.buildBlankBitboard();

        assertEquals(0x8000000000000L,bitboard.assertBit(0,0,0L));
        assertEquals(0x0000000000002L,bitboard.assertBit(7,6,0L));




    }
}
