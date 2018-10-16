package roman;
import java.util.HashMap;
import java.util.Map;

public class ConvertToRomanNumerals {

	private Map<Integer, String> lookUp = new HashMap<Integer, String>();
	//private Map<Integer, String> exceptions = new HashMap<Integer, String>();
	private StringBuilder roman = new StringBuilder();

	public ConvertToRomanNumerals() {
		lookUp.put(1, "I");
		lookUp.put(4, "IV");
		lookUp.put(5, "V");
		lookUp.put(9, "IX");
		lookUp.put(10, "X");
		lookUp.put(40, "XL");
		lookUp.put(50, "L");
		lookUp.put(90, "XC");
		lookUp.put(100, "C");
		lookUp.put(400, "CD");
		lookUp.put(500, "D");
		lookUp.put(900, "CM");
		lookUp.put(1000, "M");		

	}

	public String convertToRoman(int number) {
		int[] bases = {1000, 900, 500, 400, 100, 50, 40, 10, 9, 5, 4, 1};
		int modal;
		int quo;
		for (int i = 0; i < bases.length; i++) {
			if (number <= 0) break;
			modal = bases[i];
			quo = number / modal;
			if (quo > 0)
				buildRomanString(quo, modal);
			number = number - (quo * modal);
		}
		return roman.toString();
	}

	private void buildRomanString(int num, int modal) {

		for (int j = 0; j < num; j++)
			roman.append(lookUp.get(modal));
	}

}
