package com.csc;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ZipperTest {

  Zipper zipper;
  List<String> string1 = List.of("one", "three", "five");
  List<String> string2 = List.of("two", "four", "six");

  @BeforeEach
  void setUp() {
    zipper = new Zipper();
  }

  @Test
  void itWorks() {
    assertEquals("one,two,three,four,five,six,seven", zipper.zip(string1, string2));
  }
}
