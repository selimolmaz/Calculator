package main.java.com.calculator.app.modules;

import java.math.BigDecimal;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import com.ibm.icu.text.RuleBasedNumberFormat;

/**
 * TranslateNumberToWord sınıfı, sayıyı metin olarak çevirmek için kullanılan bir yardımcı sınıftır.
 * 
 * Bu sınıf, belirli bir dil için sayıları metin olarak çevirmek için kullanılır.
 */
public class TranslateNumberToWord {

	/**
     * Belirli bir dil için sayıyı metin olarak çevirir.
     * 
     * @param lang    çeviri için kullanılacak dil kodu
     * @param reqStr  çevrilecek sayı
     * @return        sayının metin olarak çevrilmiş hali
     */
    public static String translate(String lang, String reqStr) {
        StringBuffer result = new StringBuffer();
        Locale locale = null;
        RuleBasedNumberFormat rule = null;
        String inputArr[] = null;
        
        
        if(lang == "tr") {
        	locale = new Locale("tr");
        }else if (lang == "eg") {
        	locale = new Locale("en");
        }
        
        try {
        	inputArr = StringUtils.split(new BigDecimal(reqStr).abs().toPlainString(), ".");
        	rule = new RuleBasedNumberFormat(locale, RuleBasedNumberFormat.SPELLOUT);
        	
		} catch (Exception e) {
			System.out.println(e);
		}
        for (String input : inputArr) {
            result.append(rule.format(new BigDecimal(input))).append(" ");
        }
        return result.toString();
    }
}