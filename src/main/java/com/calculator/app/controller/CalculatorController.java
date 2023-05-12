package main.java.com.calculator.app.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.java.com.calculator.app.model.CalculatorModel;
import main.java.com.calculator.app.view.CalculatorView;

/**
 * CalculatorController sınıfı, hesap makinesi uygulamasının kontrolcü
 * sınıfıdır.
 * 
 * Bu sınıf, model ve görünüm arasındaki iletişimi sağlar. Kullanıcı
 * etkileşimlerini dinler ve gerekli hesaplamaları model üzerinde
 * gerçekleştirerek sonuçları görünüme yansıtır.
 */
public class CalculatorController {
	private CalculatorModel model;
	private CalculatorView view;

	/**
	 * CalculatorController sınıfının kurucusu.
	 * 
	 * @param model hesap makinesi modeli
	 * @param view  hesap makinesi görünümü
	 */
	public CalculatorController(CalculatorModel model, CalculatorView view) {
		this.model = model;
		this.view = view;

		// Toplama butonu için ActionListener
		view.setAddButtonListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = view.getTextField1Value();
				String num2 = view.getTextField2Value();
				String result = model.add(num1, num2);
				view.setResultField(result);
			}
		});

		// Çıkarma butonu için ActionListener
		view.setSubtractButtonListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = view.getTextField1Value();
				String num2 = view.getTextField2Value();
				String result = model.subtract(num1, num2);
				view.setResultField(result);
			}
		});

		// Çarpma butonu için ActionListener
		view.setMultiplyButtonListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = view.getTextField1Value();
				String num2 = view.getTextField2Value();
				String result = model.multiply(num1, num2);
				view.setResultField(result);
			}
		});

		// Bölme butonu için ActionListener
		view.setDivideButtonListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = view.getTextField1Value();
				String num2 = view.getTextField2Value();
				String result = model.divide(num1, num2);
				view.setResultField(result);
			}
		});
	}
}
