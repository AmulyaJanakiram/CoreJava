package test;

public class SwitchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Number of Vowels");
		String str = "aeiou aeiou bdd";
		int cnt = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				cnt = cnt + 1;
				break;
			default:
				System.out.println("default...");

			}

		}
		System.out.println("Vowel count is " + cnt);

	}

}
