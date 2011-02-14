package org.vm.collections;

import org.junit.*;
import static org.junit.Assert.*;

public class SimpleHashMapTest {

  SimpleHashMap map;

  @Before
  public void setUp() {
    map = new SimpleHashMap();
  }

  @Test
  public void testSizeOfNewSimpleHashMap() {
    assertEquals(0, map.size());
  }

  // Now try adding get, put, delete, etc...
}
