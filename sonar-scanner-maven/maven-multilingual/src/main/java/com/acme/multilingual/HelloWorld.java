package com.acme.multilingual;

public class HelloWorld {

  void sayHello() {
    System.out.println("Hello World!");
    System.out.println("Welcome to the multilingual application!");
  }

  public static void main(String[] args) {
    HelloWorld helloWorld = new HelloWorld();
    helloWorld.sayHello();
  }

  void notCovered() {
    System.out.println("This method is not covered by unit tests.");
  }

  // Adding a SonarQube issue: Hardcoded credentials
  void insecureMethod() {
    String password = "12345"; // Noncompliant: Hardcoded password
    System.out.println("Password is:... " + password);
  }

}