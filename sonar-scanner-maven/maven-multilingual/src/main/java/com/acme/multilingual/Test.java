package com.acme.multilingual;

import java.util.logging.Logger;

public class Test {
  private static final Logger logger = Logger.getLogger(Test.class.getName());

  public static void main(String[] args) {
    if (args.length > 0) {
      for (String arg : args) {
        logger.info(String.format("Argument: %s", arg));
      }
    } else {
      logger.info("No arguments provided.");
    }
    logger.info("Welcome to the multilingual application.");
    System.out.println("Welcome to the multilingual application.");
  }
}
