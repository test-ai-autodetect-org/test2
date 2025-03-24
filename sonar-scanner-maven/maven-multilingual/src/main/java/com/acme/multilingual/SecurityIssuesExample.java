package com.acme.multilingual;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SecurityIssuesExample {

    public void hardcodedPassword() {
        // 하드코딩된 비밀번호 (SonarQube에서 감지 가능)
        String password = "12345";
        System.out.println("Hardcoded password: " + password);
    }

    public void sqlInjection(String userInput) {
        try {
            // SQL Injection 취약점 (SonarQube에서 감지 가능)
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM users WHERE username = '" + userInput + "'";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                System.out.println("User: " + resultSet.getString("username"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insecureHashing(String input) {
        try {
            // MD5 사용 (보안에 취약, SonarQube에서 감지 가능)
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] hash = md.digest(input.getBytes());
            System.out.println("MD5 Hash: " + new String(hash));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sensitiveDataExposure() {
        // 민감한 데이터 노출 (SonarQube에서 감지 가능)
        String creditCardNumber = "4111111111111111";
        System.out.println("Credit Card Number: " + creditCardNumber);
    }
}