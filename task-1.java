package ques1;
public class Marks {
	public static void check_marks(char ch) {	
		if(ch=='A') {
			System.out.println("The marks are between 76 to 100");
		}else if(ch=='B') {
			System.out.println("The marks are between 51 to 75");
//			
		}else if(ch=='C') {
			System.out.println("The marks are between 36 to 50");
		}else if(ch=='F') {
			System.out.println("The marks are between 0 to 35");
		}else {
			System.out.println("The marks are Invalid");
		}			
			}
	public static void main(String[] args) {
		Marks.check_marks('A');
		Marks.check_marks('F');	
	}
}
