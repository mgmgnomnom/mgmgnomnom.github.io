import java.util.Scanner;
public class wowtest {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("put a text hehe: ");  
			String str= sc.nextLine();
			String new_str = str.replaceAll("b", " :bingles: " );
			System.out.println("bingle-ified text: " + new_str);
		} 
		System.out.println("copy paste in discord!!");
    }
}

