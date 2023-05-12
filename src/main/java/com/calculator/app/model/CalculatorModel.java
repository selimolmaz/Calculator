package main.java.com.calculator.app.model;

import main.java.com.calculator.app.service.OperationService;
import main.java.com.calculator.app.service.impl.OperationServiceImpl;


/**
 * CalculatorModel sınıfı, hesap makinesi işlemlerini gerçekleştirmek için kullanılan bir model sınıfıdır.
 * 
 * Bu sınıf, kullanıcıdan alınan sayıları işlem servisini kullanarak hesaplamalar yapar ve sonuçları metin olarak döndürür.
 * İşlem servisi, sayıları metinden sayıya ve sayıdan metne dönüştürmek için bir dönüşüm servisi kullanır.
 */
public class CalculatorModel {
    private OperationService operationService;
 
    /**
     * CalculatorModel sınıfının kurucusu.
     * 
     * @param language kullanılacak dilin kodu
     */
    public CalculatorModel(String language) {
        operationService = new OperationServiceImpl(language);
    }
 
    /**
     * İki sayıyı toplar ve sonucunu metin olarak döndürür.
     * 
     * @param num1 ilk sayı
     * @param num2 ikinci sayı
     * @return toplama işleminin sonucu metin olarak döndürülür
     */
    public String add(String num1, String num2) {
        int result = operationService.add(num1, num2);
        return operationService.result(result);
    }
 
    /**
     * İki sayıyı çıkarır ve sonucunu metin olarak döndürür.
     * 
     * @param num1 ilk sayı
     * @param num2 ikinci sayı
     * @return çıkarma işleminin sonucu metin olarak döndürülür
     */
    public String subtract(String num1, String num2) {
        int result = operationService.subtract(num1, num2);
        return operationService.result(result);
    }
 
    /**
     * İki sayıyı çarpar ve sonucunu metin olarak döndürür.
     * 
     * @param num1 ilk sayı
     * @param num2 ikinci sayı
     * @return çarpma işleminin sonucu metin olarak döndürülür
     */
    public String multiply(String num1, String num2) {
        int result = operationService.multiply(num1, num2);
        return operationService.result(result);
    }
 
    /**
     * İki sayıyı böler ve sonucunu metin olarak döndürür.
     * 
     * @param num1 ilk sayı
     * @param num2 ikinci sayı
     * @return bölme işleminin sonucu metin olarak döndürülür
     * @throws ArithmeticException ikinci sayı sıfıra eşit olduğunda fırlatılır
     */
    public String divide(String num1, String num2) throws ArithmeticException {
        int result = operationService.divide(num1, num2);
        return operationService.result(result);
    }
}

