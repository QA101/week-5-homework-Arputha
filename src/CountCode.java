
public class CountCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countCode(new String("aaacodconecone")));

	}
	public static int countCode(String str) {
		int count=0;
		for(int i=0;i<=str.length()-1;i++) {
			if (str.charAt (i)== 'c') {
				i++;
				if ( i < str.length() && str.charAt(i)=='o') {
					i+=2;
					if (i < str.length() && str.charAt(i)=='e') {
						count++;
					}
					else {
						i-=2;
					}
				}
				
			}
			
		}
		return count;
	}
	

}
