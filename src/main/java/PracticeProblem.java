public class PracticeProblem {

	public static void main(String args[]) {

	}


	public static int goodString(String string) {
		int n = string.length();

		//good string check
		if (n >= 2 && string.charAt(0) == string.charAt(n - 1)) {
			return 0;
		}

		if (n < 2) {
			return -1;
		}

		int minOperations = Integer.MAX_VALUE;

		//try to make goodstring
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j>= i; j--) {
				if (i < j && string.charAt(i) == string.charAt(j)) {
					int operations = i + (n - 1 - j);

					minOperations = Math.min(minOperations, operations);
				}
			}

		}

		//no goodstring can be formed
		if (minOperations == Integer.MAX_VALUE) {
			return -1;
		}

		return minOperations;
    }
}
