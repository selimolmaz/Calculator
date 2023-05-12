package main.java.com.calculator.app.service.impl;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

import main.java.com.calculator.app.modules.TranslateNumberToWord;
import main.java.com.calculator.app.service.NumberConversionService;

/**
 * NumberConversionServiceImpl, sayıları metinden sayıya ve sayıdan metne
 * dönüştürmek için kullanılan bir servis uygulamasıdır.
 * 
 * Bu sınıf, NumberConversionService arayüzünü uygular ve dönüşüm işlemlerini
 * gerçekleştirir.
 * 
 * NumberConversionServiceImpl, dil ayarına bağlı olarak metin sayıları sayılara
 * ve sayıları metinlere dönüştürmek için kullanılır.
 */
public class NumberConversionServiceImpl implements NumberConversionService {

	private Map<String, Integer> numberMap;
	private ResourceBundle dictionary;
	private String language;

	/**
	 * NumberConversionServiceImpl sınıfının kurucusu.
	 * 
	 * @param language kullanılan dilin kodu
	 */
	public NumberConversionServiceImpl(String language) {
		super();
		Locale locale = new Locale(language);
		this.language = language;
		this.dictionary = ResourceBundle.getBundle("i18n.Dictionary", locale);
		this.numberMap = createNumberMap();
	}

	@Override
	public String convertNumberToString(int number) {
		String result = new TranslateNumberToWord().translate(this.language, Integer.toString(number));
		return result;
	}

	@Override
	public int convertStringToNumber(String str) {
		int result = 0;
		String[] words = str.split("\\s+");

		int currentNumber = 0;
		for (String word : words) {
			Integer value = numberMap.get(word);
			if (value != null) {
				currentNumber += value;
			} else if (word.equals(this.dictionary.getString("hundred"))) {
				if (currentNumber == 0) {
					currentNumber += 100;
				} else {
					currentNumber *= 100;
				}
			} else if (word.equals(this.dictionary.getString("thousand"))) {
				if (currentNumber == 0) {
					currentNumber += 1000;
				} else {
					currentNumber *= 1000;
				}
				result += currentNumber;
				currentNumber = 0;
			} else if (word.equals(this.dictionary.getString("million"))) {
				if (currentNumber == 0) {
					currentNumber += 1000000;
				} else {
					currentNumber *= 1000000;
				}
				result += currentNumber;
				currentNumber = 0;
			}
		}

		result += currentNumber;
		return result;
	}

	/**
	 * İngilizce kelime-dönüşüm eşlemelerini içeren bir Map oluşturur.
	 * 
	 * @return oluşturulan Map
	 */
	private Map<String, Integer> createNumberMap() {
		Map<String, Integer> map = new HashMap<>();
        // İngilizce kelime-dönüşüm eşlemeleri
        map.put(dictionary.getString("zero"), 0);
        map.put(dictionary.getString("one"), 1);
        map.put(dictionary.getString("two"), 2);
        map.put(dictionary.getString("three"), 3);
        map.put(dictionary.getString("four"), 4);
        map.put(dictionary.getString("five"), 5);
        map.put(dictionary.getString("six"), 6);
        map.put(dictionary.getString("seven"), 7);
        map.put(dictionary.getString("eight"), 8);
        map.put(dictionary.getString("nine"), 9);
        map.put(dictionary.getString("ten"), 10);
        map.put(dictionary.getString("eleven"), 11);
        map.put(dictionary.getString("twelve"), 12);
        map.put(dictionary.getString("thirteen"), 13);
        map.put(dictionary.getString("fourteen"), 14);
        map.put(dictionary.getString("fifteen"), 15);
        map.put(dictionary.getString("sixteen"), 16);
        map.put(dictionary.getString("seventeen"), 17);
        map.put(dictionary.getString("eighteen"), 18);
        map.put(dictionary.getString("nineteen"), 19);
        map.put(dictionary.getString("twenty"), 20);
        map.put(dictionary.getString("thirty"), 30);
        map.put(dictionary.getString("forty"), 40);
        map.put(dictionary.getString("fifty"), 50);
        map.put(dictionary.getString("sixty"), 60);
        map.put(dictionary.getString("seventy"), 70);
        map.put(dictionary.getString("eighty"), 80);
        map.put(dictionary.getString("ninety"), 90);
        return map;
	}

}
