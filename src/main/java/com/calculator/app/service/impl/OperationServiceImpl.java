package main.java.com.calculator.app.service.impl;

import main.java.com.calculator.app.service.NumberConversionService;
import main.java.com.calculator.app.service.impl.NumberConversionServiceImpl;
import main.java.com.calculator.app.service.OperationService;

/**
 * OperationServiceImpl, hesap makinesi işlemlerini gerçekleştirmek için kullanılan bir sınıftır.
 * 
 * Bu sınıf, NumberConversionService bağımlılığını kullanarak sayıları metinden sayıya ve sayıdan metne dönüştürmektedir.
 * 
 * add, subtract, multiply ve divide metotları, aldığı iki metin sayıyı sayıya dönüştürür ve ilgili matematiksel işlemi gerçekleştirir.
 * Örneğin, add metodu iki sayıyı toplar ve sonucunu döndürür.
 * 
 * divide metodu sıfıra bölme hatası kontrolü yapar. Eğer ikinci sayı sıfır ise, ArithmeticException fırlatılır.
 * 
 * result metodu, aldığı bir sayıyı metne dönüştürür ve sonucu metin olarak döndürür.
 */
public class OperationServiceImpl implements OperationService {
	private NumberConversionService conversionService;

	public OperationServiceImpl(String language) {
		// Dil ayarına göre NumberConversionService uygulaması oluşturuluyor
		conversionService = new NumberConversionServiceImpl(language);
	}

	@Override
	public int add(String num1, String num2) {
		// İki sayıyı metinden sayıya dönüştürme
		int number1 = conversionService.convertStringToNumber(num1);
		int number2 = conversionService.convertStringToNumber(num2);
		// Toplama işlemi
		return number1 + number2;
	}

	@Override
	public int subtract(String num1, String num2) {
		// İki sayıyı metinden sayıya dönüştürme
		int number1 = conversionService.convertStringToNumber(num1);
		int number2 = conversionService.convertStringToNumber(num2);
		// Çıkarma işlemi
		return number1 - number2;
	}

	@Override
	public int multiply(String num1, String num2) {
		// İki sayıyı metinden sayıya dönüştürme
		int number1 = conversionService.convertStringToNumber(num1);
		int number2 = conversionService.convertStringToNumber(num2);
		// Çarpma işlemi
		return number1 * number2;
	}

	@Override
	public int divide(String num1, String num2) {
		// İki sayıyı metinden sayıya dönüştürme
		int number1 = conversionService.convertStringToNumber(num1);
		int number2 = conversionService.convertStringToNumber(num2);
		if (number2 != 0) {
			// Sıfıra bölme kontrolü ve bölme işlemi
			return number1 / number2;
		} else {
			// Sıfıra bölme hatası durumunda hata fırlatılıyor
			throw new ArithmeticException("Sıfıra bölme hatası");
		}
	}

	@Override
	public String result(int result) {
		// Sonucu metne dönüştürme
		return conversionService.convertNumberToString(result);
	}
}
