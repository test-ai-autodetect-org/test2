//ai code auto detection for sonarqube wirtten in java
package com.acme.multilingual;

import org.junit.Test;

public class HelloWorldTest {

  @Test
  public void sayHello() {
    new HelloWorld().sayHello();
  }

  @Test
  public void testGreeting() {
    HelloWorld helloWorld = new HelloWorld();
    String greeting = helloWorld.getGreeting();
    assertNotNull("Greeting should not be null", greeting);
    assertEquals("Hello, World!", greeting);
  }
}

