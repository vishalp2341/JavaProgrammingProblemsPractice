import java.util.Scanner;

public class SubstringsVowelCount {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		launch(s);
		sc.close();
	}

	private static void launch(String s) {
		int Count = 0;

		for (int size = 1; size <= s.length(); size++)
		{
			for (int i = 0; i <= s.length() - size; i++) 
			{
				boolean allVowels = true;

				for (int j = i; j < size + i; j++) 
				{
					if (!isVowel(s.charAt(j))) 
					{
						allVowels = false;
						break;
					}
				}

				if (allVowels) 
				{
					Count++;
				}
			}
		}

		System.out.println(Count);
	}

	private static boolean isVowel(char ch) {
		if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u')
		{
			return true;
		}
		return false;
	}
}
