
public class HalfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstHalf("WooHoo"));
		System.out.println(firstHalf("HelloThere"));
		System.out.println(firstHalf("abcdef"));
	}
	public static String firstHalf(String str) {
			String halfString;
			if(str.length()%2==0) {
				halfString=str.substring(0, str.length()/2);
				return halfString;
			}
			else {
				return str;
			}
	}

}
