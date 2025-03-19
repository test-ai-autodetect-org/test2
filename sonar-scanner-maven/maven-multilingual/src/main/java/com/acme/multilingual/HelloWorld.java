package com.acme.multilingual;

public class HelloWorld {
  private String language;

  public HelloWorld(String language) {
    this.language = language;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }
  void sayHello() {
    System.out.println("Hello World!");
    System.out.println("Welcome to the multilingual application!");
    }

    void notCovered() {
    System.out.println("This method is not covered by unit tests.");
  }

}
