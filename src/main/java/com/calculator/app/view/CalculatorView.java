package main.java.com.calculator.app.view;

import javax.swing.*;

import main.java.com.calculator.app.service.OperationService;
import main.java.com.calculator.app.service.impl.OperationServiceImpl;

import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;

public class CalculatorView extends JFrame {
	private ResourceBundle guiElement; // Gui dil dosyası için kullanılan kaynak paketi
	private OperationService operationService; // Hesaplama işlemlerini yöneten servis

	private JButton addButton;
	private JButton subtractButton;
	private JButton multiplyButton;
	private JButton divideButton;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField resultField;

	public CalculatorView(String language) {

		operationService = new OperationServiceImpl(language); // Hesaplama işlemi servisini oluşturma

		setLanguage(language); // Dil ayarlarını yapma

		this.addButton = new JButton(guiElement.getString("add"));
		this.subtractButton = new JButton(guiElement.getString("subtract"));
		this.multiplyButton = new JButton(guiElement.getString("multiply"));
		this.divideButton = new JButton(guiElement.getString("divide"));
		this.textField1 = new JTextField(); // Metin girişi oluşturma
		this.textField2 = new JTextField();
		this.resultField = new JTextField();

		setTitle(guiElement.getString("title")); // Başlığı ayarlama
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Kapatma işlemi ayarları

		JPanel mainPanel = new JPanel(); // Ana panel oluşturma

		Box verticalBox = Box.createVerticalBox(); // Dikey bir kutu oluşturma

		// Satır 1
		Box row1 = Box.createHorizontalBox(); // Yatay bir kutu oluşturma
		JLabel label1 = new JLabel(guiElement.getString("label1")); // Etiket oluşturma
		row1.add(label1); // Etiketi kutuya ekleme
		row1.add(this.textField1); // Metin girişini kutuya ekleme
		verticalBox.add(row1); // Kutuyu dikey kutuya ekleme

		// Satır 2
		Box row2 = Box.createHorizontalBox();
		JLabel label2 = new JLabel(guiElement.getString("label2"));
		row2.add(label2);
		row2.add(this.textField2);
		verticalBox.add(row2);

		// Satır 3
		Box row3 = Box.createHorizontalBox();
		JLabel label3 = new JLabel(guiElement.getString("label3"));
		row3.add(label3);
		row3.add(this.resultField);
		verticalBox.add(row3);

		// Satır 4
		Box row4 = Box.createHorizontalBox();
		row4.add(addButton);
		row4.add(subtractButton);
		row4.add(multiplyButton);
		row4.add(divideButton);
		verticalBox.add(row4);

		mainPanel.add(verticalBox);

		// Ana paneli JFrame'e yerleştirme
		add(mainPanel);

		pack(); // En uygun boyutu otomatik olarak ayarlama
		setVisible(true); // Pencereyi görünür hale getirme
	}

	private void setLanguage(String language) {
		Locale locale = new Locale(language);
		guiElement = ResourceBundle.getBundle("i18n.Gui", locale);

	}

	public void setAddButtonListener(ActionListener listener) {
		// "Add" butonuna ActionListener ekleyin
		addButton.addActionListener(listener);
	}

	public void setSubtractButtonListener(ActionListener listener) {
		// "Subtract" butonuna ActionListener ekleyin
		subtractButton.addActionListener(listener);
	}

	public void setMultiplyButtonListener(ActionListener listener) {
		// "Multiply" butonuna ActionListener ekleyin
		multiplyButton.addActionListener(listener);
	}

	public void setDivideButtonListener(ActionListener listener) {
		// "Divide" butonuna ActionListener ekleyin
		divideButton.addActionListener(listener);
	}

	public String getTextField1Value() {
		// textField1'in değerini döndürün
		return textField1.getText();
	}

	public String getTextField2Value() {
		// textField2'nin değerini döndürün
		return textField2.getText();
	}

	public void setResultField(String result) {
		// Sonuç alanına (resultField) veri yazdırın
		
		resultField.setText(result);
	}
}
