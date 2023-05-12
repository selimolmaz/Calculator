package main.java.com.calculator.app;

import java.text.NumberFormat;

import javax.swing.SwingUtilities;

import main.java.com.calculator.app.controller.CalculatorController;
import main.java.com.calculator.app.model.CalculatorModel;
import main.java.com.calculator.app.service.impl.NumberConversionServiceImpl;
import main.java.com.calculator.app.view.CalculatorView;
/**
 * CalculatorMain sınıfı, hesap makinesi uygulamasının ana sınıfıdır.
 * 
 * Bu sınıf, hesap makinesi uygulamasını başlatmak için kullanılır. Swing arayüzünü başlatır,
 * model, görünüm ve kontrolcüyü oluşturur ve birlikte çalışmalarını sağlar.
 * 
 * Uygulama, kullanıcının seçtiği dilde sayıları metne ve metinden sayıya dönüştüren bir dönüştürme
 * servisini kullanır ve dört temel matematiksel işlemi gerçekleştirir (toplama, çıkarma, çarpma, bölme).
 * 
 * Varsayılan olarak Türkçe dil seçilmiştir, ancak "eg" parametresi ile İngilizce dil de seçilebilir.
 * 
 * Projenin çalıştırılması için main metodu kullanılır ve SwingUtilities.invokeLater() metodu ile
 * Swing arayüzü olay işleme thread'inde çalıştırılır.
 */
public class CalculatorMain {
	private static String language;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				language = "tr"; // varsayılan dil türkçe ("eg" ile ingilizce seçilebilir)
				CalculatorModel model = new CalculatorModel(language);
				CalculatorView view = new CalculatorView(language);
				CalculatorController controller = new CalculatorController(model, view);

				view.setVisible(true);
			}
		});
		
	}
}
