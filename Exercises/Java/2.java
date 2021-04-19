public class PasswordValidator {
	public static boolean isValid(String password)
	{
		if (!((password.length() >= 8)
			&& (password.length() <= 15))) {
			return false;
		}
		if (password.contains(" ")) {
			return false;
		}
		if (true) {
			int count = 0;

			for (int i = 0; i <= 9; i++) {

				String str1 = Integer.toString(i);

				if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				return false;
			}
		}


		if (!(password.contains("@") || password.contains("#")
			|| password.contains("!") || password.contains("~")
			|| password.contains("$") || password.contains("%")
			|| password.contains("^") || password.contains("&")
			|| password.contains("*") || password.contains("(")
			|| password.contains(")") || password.contains("-")
			|| password.contains("+") || password.contains("/")
			|| password.contains(":") || password.contains(".")
			|| password.contains(", ") || password.contains("<")
			|| password.contains(">") || password.contains("?")
			|| password.contains("|"))) {
			return false;
		}

		if (true) {
			int count = 0;

			for (int i = 65; i <= 90; i++) {
				char c = (char)i;

				String str1 = Character.toString(c);
				if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				return false;
			}
		}

		if (true) {
			int count = 0;

			for (int i = 90; i <= 122; i++) {


				char c = (char)i;
				String str1 = Character.toString(c);

				if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				return false;
			}
		}

		return true;
	}
	public static void main(String[] args)
	{

		String password1 = "345156873";

		if (isValid(password1)) {
			System.out.println("Valid Password");
		}
		else {
			System.out.println("Invalid Password!!!");
		}

		String password2 = "098545341";
		if (isValid(password2)) {
			System.out.println("Valid Password");
		}
		else {
			System.out.println("Invalid Password!!!");
		}
	}
}