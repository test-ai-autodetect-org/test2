package com.acme.multilingual;

import java.util.logging.Logger;

public class Test {
  private static final Logger logger = Logger.getLogger(Test.class.getName());
  private static final String UNUSED_CONSTANT = "UNUSED"; // Unused variable

  public static void main(String[] args) {
    int unusedVariable = 42; // Unused variable
    if (args.length > 0) {
      for (String arg : args) {
        logger.info(String.format("Argument: %s", arg));
      }
    } else {
      logger.info("No arguments provided.");
    }
    logger.info("Welcome to the multilingual application.");
    // This code was generated by an AI assistant for SonarQube detection
    System.out.println("Welcome to the multilingual application.");
    
    try {
      int result = 10 / 0; // Division by zero
    } catch (Exception e) {
      e.printStackTrace(); // Poor exception handling
    }
    
    String hardcodedPassword = "password123"; // Hardcoded password
  }
  
}
