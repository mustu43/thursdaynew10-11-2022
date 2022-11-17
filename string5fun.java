package javaexamples;

public class string5fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="python";
		String s2="programmer";
		
		// 1st string function string length
		System.out.println("string length is: "+s1.length());
		System.out.println("string length is: "+s2.length());
		
		//2nd string function concat
		s1=s1.concat(" is a programming lang");
		System.out.println(s1);
		
		//3rd string function replace
		
		String replaceString=s1.replace('p','q');
		System.out.println(replaceString);
		
		//4th string function equals 
		System.out.println(s1.equals(s2));
		
		//5th string function to upper case
		String s1UPPER=s1.toUpperCase();
		System.out.println(s1UPPER);
		
		//  string function to check weather the string is empty or not
		//	System.out.println(s1.isEmpty());      
		//	System.out.println(s2.isEmpty());
	}

}
