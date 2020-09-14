package _02_gotta_catchem_all;

public class ExceptionMethods{
	public static double divide(double num1, double num2) throws Exception {
		if(num2 == 0.0) {
			throw new Exception();
		}
		double quotient = num1/ num2;
		return quotient;
	}
	public static String reverseString(String s) throws Exception {
		if(s == null) {
			throw new Exception();
		}
		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i --){
			reverse = reverse + s.charAt(i);
		}
		System.out.println(reverse);
		return reverse;
	}
}
