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
    String password = "12345"; // Hardcoded password (SonarQube will flag this)
  }

  void potentialNullPointer() {
    String riskyString = null;
    System.out.println(riskyString.length()); // NullPointerException 발생 가능 (SonarQube가 감지)
  }

  void unusedVariable() {
    int unused = 42; // 사용되지 않는 변수 (SonarQube가 감지)
  }

}