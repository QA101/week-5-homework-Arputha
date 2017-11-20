
public class EndOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1."+endOtherString(new String("Hiabc"),new String("abc")));
		System.out.println("2."+endOtherString(new String("AbC"),new String("hiabc")));
		System.out.println("3."+endOtherString(new String("axeAabD"),new String("Abd")));
	}
	
	public static boolean endOtherString(String str1,String str2) {
		if (str1.toLowerCase().endsWith(str2.toLowerCase())||str2.toLowerCase().endsWith(str1.toLowerCase())) {
			return true;
		}
		else
			return false;
	}

}
