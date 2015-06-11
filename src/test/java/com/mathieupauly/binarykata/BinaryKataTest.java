package com.mathieupauly.binarykata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryKataTest {

  @Test
  public void zero() {
    assertEquals("0", binary(0));
  }

  @Test
  public void one() {
    assertEquals("1", binary(1));
  }

  @Test
  public void two() {
    assertEquals("10", binary(2));
  }

  @Test
  public void three() {
    assertEquals("11", binary(3));
  }

  @Test
  public void four() {
    assertEquals("100", binary(4));
  }

  @Test
  public void five() {
    assertEquals("101", binary(5));
  }

  @Test
  public void six() {
    assertEquals("110", binary(6));
  }

  @Test
  public void seven() {
    assertEquals("111", binary(7));
  }

  @Test
  public void eight() {
    assertEquals("1000", binary(8));
  }

  private String binary(int n) {
    if (n <= 1) {
      return Integer.toString(n);
    }
    return binary(n / 2) + Integer.toString(n % 2);
  }
}
