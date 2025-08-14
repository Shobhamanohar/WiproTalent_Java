
public class nnGenerator {

	public int nnGenerator(String input1) {
	    StringBuilder result = new StringBuilder();
	    int i = 0;
	    while (i < input1.length()) {
	        int sum = 0;
	        boolean firstDigitOdd = (input1.charAt(i) - '0') % 2 != 0;
	        int j = i;
	        while (j < input1.length()) {
	            sum += input1.charAt(j) - '0';
	            boolean sumOdd = sum % 2 != 0;
	            if (sumOdd != firstDigitOdd || j == input1.length() - 1) {
	                result.append(sum);
	                break;
	            }
	            j++;
	        }
	        i = j + 1;
	    }
	    return Integer.parseInt(result.toString());
	}

}

