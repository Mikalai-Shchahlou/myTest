
public class Main {

	public static void main(String[] args) {
		int a = 715_827_882;
	        int n = 34;
	        long result = 0;
	        for (int i = n >> 1; i-- > 0;) {
	            result += a << 1;
	        }
	        result += (~(n & 1) + 1) & ((a + 1) + ~(n & 1) + 1);
	        System.out.print("a*n=" + result);
	}
}