package com.acme.multilingual;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class HelloWorldTest {

    @Test
    void testSayHello() {
        // 출력 스트림 캡처
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello();

        // 출력값 검증
        String output = outputStream.toString();
        assertTrue(output.contains("Hello World!"), "sayHello() 출력에 'Hello World!'가 포함되어야 합니다.");
        assertTrue(output.contains("Welcome to the multilingual application!"), "sayHello() 출력에 'Welcome to the multilingual application!'이 포함되어야 합니다.");
    }

    @Test
    void testNotCovered() {
        // 출력 스트림 캡처
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        HelloWorld helloWorld = new HelloWorld();
        helloWorld.notCovered();

        // 출력값 검증
        String output = outputStream.toString();
        assertTrue(output.contains("This method is not covered by unit tests."), "notCovered() 출력에 'This method is not covered by unit tests.'가 포함되어야 합니다.");
    }

    @Test
    void testMain() {
        // 출력 스트림 캡처
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        HelloWorld.main(new String[]{});

        // 출력값 검증
        String output = outputStream.toString();
        assertTrue(output.contains("Hello World!"), "main() 출력에 'Hello World!'가 포함되어야 합니다.");
        assertTrue(output.contains("Welcome to the multilingual application!"), "main() 출력에 'Welcome to the multilingual application!'이 포함되어야 합니다.");
    }
}
