
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1."+reverseStr(new String("Hello there")));
		System.out.println("2."+reverseStr(new String("Seattle is cool")));
		System.out.println("3."+reverseStr(new String("I love Java")));
		System.out.println("4."+reverseStr(new String("dad")));
		System.out.println("5."+reverseStr(new String("racecar")));
	}
	public static String reverseStr(String str) {
		String tmp=new String("");
		for(int i=str.length()-1;i>=0;i--) {
			tmp=tmp.concat(String.valueOf(str.charAt(i)));
		}
		return tmp;
	}
}
