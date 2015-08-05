package com.mathieupauly.binarykata;

import org.junit.Test;

import java.util.BitSet;

import static org.junit.Assert.assertEquals;

public class BinaryKataBitSetTest {

    @Test
    public void zero() {
        final BitSet bitSet = new BitSet();

        assertEquals(bitSet, toBinary(0));
    }

    @Test
    public void one() {
        final BitSet bitSet = new BitSet();
        bitSet.set(0);

        assertEquals(bitSet, toBinary(1));
    }

    @Test
    public void two() {
        final BitSet bitSet = new BitSet();
        bitSet.set(1);

        assertEquals(bitSet, toBinary(2));
    }

    @Test
    public void three() {
        final BitSet bitSet = new BitSet();
        bitSet.set(0);
        bitSet.set(1);

        assertEquals(bitSet, toBinary(3));
    }

    @Test
    public void four() {
        final BitSet bitSet = new BitSet();
        bitSet.set(2);

        assertEquals(bitSet, toBinary(4));
    }

    @Test
    public void eight() {
        final BitSet bitSet = new BitSet();
        bitSet.set(3);

        assertEquals(bitSet, toBinary(8));
    }

    @Test
    public void nine() {
        final BitSet bitSet = new BitSet();
        bitSet.set(0);
        bitSet.set(3);

        assertEquals(bitSet, toBinary(9));
    }

    private static BitSet toBinary(int n) {
        final BitSet bitSet = new BitSet();
        int p = 0;

        while (p <= n) {
            final int bit = (n / (int) Math.pow(2, p)) % 2;

            if (bit != 0) {
                bitSet.set(p);
            }
            p++;
        }

        return bitSet;
    }
}
