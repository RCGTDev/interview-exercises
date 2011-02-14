package org.vm.web;

import org.junit.*;

import static org.junit.Assert.*;

public class FriendlyUrlTest {

  FriendlyUrl friendlyUrl;

  @Before
  public void setUp() {
    friendlyUrl = new FriendlyUrl();
  }

  @Test
  public void testTextToUrl() {
    assertEquals("xyz", friendlyUrl.textToUrlPath("xyz"));
  }

  // Now try adding more complex strings such as "San Francisco"
}
