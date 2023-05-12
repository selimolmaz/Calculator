package main.java.com.calculator.app.service;

public interface OperationService {
	int add(String num1, String num2);
    int subtract(String num1, String num2);
    int multiply(String num1, String num2);
    int divide(String num1, String num2);
    String result(int result);
}
