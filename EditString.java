import java.util.Scanner;

public class EditString <T> extends ArrayBoundedStack{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayBoundedStack<String> stack = new ArrayBoundedStack<>();
		
		System.out.println("Enter the string:");
		String str = input.nextLine();
		stack.push(str);
		
		System.out.println("Enter the character:");
		String chr = input.next();
		
		//loops till the user enters X
		while (!chr.equals("X")) {
			//switch statement which takes character as argunent
			switch (chr) {
				//capatalizes all the letters
				case "U" : 	str = str.toUpperCase();
							stack.push(str);
							break;
				//makes all the letters lower case
				case "L" :	str = str.toLowerCase();
							stack.push(str);
							break;
				//reverses the string
				case "R" : 	String a ="";
							for (int i=0; i<str.length();i++) {
								a += str.charAt(str.length()-i-1);
							}
							str = a;
							stack.push(str);
							break;
				//replaces first inputed character with the second character
				case "C" :  String firstChar = input.next();
							String secondChar = input.next();
							str = str.replaceAll(firstChar,secondChar) ;
							stack.push(str);
							break;
				//undoes the last operation
				case "Z" :  stack.pop();
							str = stack.top();
							break;
				
			}
			//takes input inside while loop
			chr = input.next();
		}
		//prints out string
		System.out.println(str);
		
		
	}
}
