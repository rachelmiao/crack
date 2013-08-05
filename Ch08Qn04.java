import java.util.ArrayList;

/**
 * Write a method to compute all permutations of a string
 */
public class Test {
	public static void main(String[] args) {
		ArrayList<String> result = permutateStrings("Hello");
		for(String s : result) {
			System.out.println(s);
		}
	}

	// f(hello) = h + f(ello),
        //            e + f(hllo),
	// 	      l + f(helo),
	// 	      l + f(helo),
	// 	      o + f(hell)
	static ArrayList<String> permutateStrings(String word) {
		ArrayList<String> permutations = new ArrayList<String>();

		if (word.length() == 0) {
			permutations.add("");
			return permutations;
		}

		for (int i = 0; i < word.length(); i++) {
			// remove the character at that index
			String remnant = word.substring(0, i) + word.substring(i+1);
			ArrayList<String> tailCall = permutateStrings(remnant);
			for (String s : tailCall) {
				permutations.add(word.charAt(i) + s);
			}
		}
		return permutations;
	}
}
